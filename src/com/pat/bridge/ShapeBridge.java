package com.pat.bridge;

/**
 * 这是桥接模式中的桥梁(形状抽象类)
 * @author ZX
 *
 */
public abstract class ShapeBridge {
	Color color;
	public abstract void draw();
}



/**
 * 具体形状
 * @author ZX
 *
 */
class Circle extends ShapeBridge{
	String shape="圆形";
	
	public void draw() {
		color.paint(shape);	
	}
	
	public Circle(Color color) {
		this.color=color;
	}
}
class Squre extends ShapeBridge{
	String shape="正方形";

	public void draw() {
		color.paint(shape);	
	}
	public Squre(Color color) {
		this.color=color;
	}
} 