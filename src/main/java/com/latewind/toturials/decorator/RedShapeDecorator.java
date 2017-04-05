package com.latewind.toturials.decorator;

public class RedShapeDecorator extends ShapeDecorator {

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
	   setRedBorder(decoratedShape);
	   decoratedShape.draw();
      System.out.println(this.decoratedShape.getClass());
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}