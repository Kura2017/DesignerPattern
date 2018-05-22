package com.pat.bridge;
/**
 * 颜色接口
 * @author ZX
 *
 */
public interface Color {
	void paint(String shape);

}
/**
 * 具体颜色
 * @author ZX
 *
 */
class Red implements Color{

    @Override
	public void paint(String shape) {
    	if(shape==null||"".equals(shape)) {
    		System.out.println("红色色块");
    	}else {
    		System.out.println("红色"+shape);
    	}
	}	
}
class Blue implements Color{

    @Override
	public void paint(String shape) {
    	if(shape==null||"".equals(shape)) {
    		System.out.println("蓝色色块");
    	}else {
    		System.out.println("蓝色"+shape);
    	}
	}	
}