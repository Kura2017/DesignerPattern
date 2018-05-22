package com.pat.snap;
/**
 * 记事本对象，被记录的对象
 * @author Administrator
 *
 */
public class TextEditor {
	//正在编辑的内容
	private String text="";

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = this.text+text;
	}
	//保存
	public Memento saveHistory() {
		Memento curr = new Memento();
		curr.setText(this.text);
		return curr;
	}
	//ctrl+z
	public void backUp(Memento mem) {
		this.text=mem.getText();
	}
	
}
