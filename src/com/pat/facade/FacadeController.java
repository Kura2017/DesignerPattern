package com.pat.facade;
/**
 * 外观模式核心-更高层的和新接口控制器，至于对象的创建可使用任何方式，这里采用最简单的方式
 * @author ZX
 *
 */
public class FacadeController {
	private ServiceWindows music;
	private ServiceWindows video;
	private ServiceWindows studyData;
	
	public FacadeController() {
		this.music = new Music();
		this.video= new Video();
		this.studyData= new Study();
	}
	
	
    public void playMusic() {
    	music.provide();
    }
    public void playVideo() {
    	video.provide();
    }
    public void beginStudy() {
    	studyData.provide();
    }
}
