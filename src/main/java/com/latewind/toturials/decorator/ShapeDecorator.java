package com.latewind.toturials.decorator;

public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;

   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
      
   }
   
//   public void test(){
//	   
//	   System.out.println(decoratedShape.getClass());
//	   
//   }

   public void draw(){
      decoratedShape.draw();
   }

public void test() {
	//  Auto-generated method stub
	
}	
}