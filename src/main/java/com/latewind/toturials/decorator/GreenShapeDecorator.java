package com.latewind.toturials.decorator;

public class GreenShapeDecorator extends ShapeDecorator {

   public GreenShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
	   setGreenBorder(decoratedShape);
      decoratedShape.draw();	       
      System.out.println(this.decoratedShape.getClass());
   }

   private void setGreenBorder(Shape decoratedShape){
      System.out.println("Border Color: Green");
   }
   public void test(){
	   
	   super.test();
	   
   }
   
}