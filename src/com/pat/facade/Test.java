package com.pat.facade;
/**
 * 测试类
 * @author ZX
 *
 */
public class Test {
	public static void main(String[] args) {
		FacadeController fc = new  FacadeController();
		fc.playMusic();
		fc.playVideo();
		fc.beginStudy();
	}
}
