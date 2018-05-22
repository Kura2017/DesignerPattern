package com.pat.visitor;
/**
 * 系统中心
 * @author ZX
 *
 */

import java.util.ArrayList;
import java.util.List;

public class SystemCenter {
	List<Systems> sysCenter = new ArrayList<>();
	
	public void add(Systems sys) {
		sysCenter.add(sys);
	}
	
	public void show(Visitor visitor) {
		for(Systems s:sysCenter) {
			s.accept(visitor);
		}
	}
	
}
