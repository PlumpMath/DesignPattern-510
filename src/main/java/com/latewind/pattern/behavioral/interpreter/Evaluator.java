package com.latewind.pattern.behavioral.interpreter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Evaluator implements Expression {
	
	private Stack<Expression> stack = new Stack<>();
	public Evaluator(String expression) {

		
		List<String> expList = Arrays.asList(expression.split("\\s+"));
		Iterator<String> it = expList.iterator();
		while (it.hasNext()) {
			String exp = it.next();
			if (Objects.equals(exp, "+")) {
				stack.push(new PlusExpression(stack.pop(), new Variable(it.next())));
				continue;
			}
			if (Objects.equals(exp, "-")) {
				stack.push(new MinusExpression(stack.pop(), new Variable(it.next())));
				continue;
			}
			stack.push(new Variable(exp));
		}
		

	}

	@Override
	public int interpret(HashMap<String, Number> variables) {
		return stack.pop().interpret(variables);
	}
	public static void main(String[] args) {
		HashMap<String, Number> variables=new HashMap<>(3);
		variables.put("a", new Number(1));
		variables.put("b", new Number(2));
		variables.put("c", new Number(3));
		Evaluator evaluator=new Evaluator("a + b - c");
		System.out.println(evaluator.interpret(variables));
	}

}
