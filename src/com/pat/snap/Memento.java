package com.pat.snap;
/**
 * 备忘录对象，用于记录
 * @author Administrator
 *
 */
public class Memento {
	private String text="";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
