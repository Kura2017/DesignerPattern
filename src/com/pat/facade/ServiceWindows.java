package com.pat.facade;
/**
 * 外观模式，被统筹类的接口
 * @author ZX
 */
public interface ServiceWindows {
	//提供服务的方法
	void provide();
}
/**
 * 音乐播放器接口
 * @author ZX
 *
 */
class Music implements ServiceWindows{
	@Override
	public void provide() {
		System.out.println("播放音乐~我的滑板鞋~滑板鞋~鞋~");
	}
	
}
/**
 * 视频播放器接口
 * @author ZX
 *
 */
class Video implements ServiceWindows{
	@Override
	public void provide() {
		System.out.println("播放视频~非洲农业不发达~就用金坷垃~~~");
	}
	
}
/**
 * 学习资料接口
 * @author ZX
 */
class Study implements ServiceWindows{
	@Override
	public void provide() {
		System.out.println("学习资料.zip》重命名 学习资料.avi");
		System.out.println("开始播放：学习资料.avi");
	}
	
}