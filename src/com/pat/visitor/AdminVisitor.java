package com.pat.visitor;
/**
 * 访问者实现类-系统管理员
 * @author ZX
 */
public class AdminVisitor implements Visitor{

	@Override
	public void visit(Systems sys) {
		sys.login();
		sys.rr();
		sys.ww();
		sys.xx();
		
	}

}
