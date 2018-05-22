package com.pat.visitor;
/**
 * 访问者实现类-普通用户
 * @author Administrator
 *
 */
public class UsualVisitor implements Visitor{
	
	@Override
	public void visit(Systems sys) {
		sys.login();
		sys.rr();
		
	}

}
