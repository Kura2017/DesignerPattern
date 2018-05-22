package com.pat.Interpreter;

import java.util.Map;

/*
 * 解释器规则类，本类定义一些语法规则，解释器应用本类中的规则进行解析文本
 * @author ZX
 */

/**
 * 条件表达式接口，用于解析语法规则
 * @author ZX
 */
public interface Expression {
	public int interpret(Map<String,Expression> variables);
}
/**
 * 数字
 */
class Number implements Expression{
    private int number;
	@Override
	public int interpret(Map<String, Expression> variables) {
		
		return number;
	}
	public Number() {}
	public Number(int number) {
		this.number=number;
	}
	
}
/**
 * 加
 */
class Plus implements Expression{
	private Expression leftExp;
	private Expression rightExp;
	@Override
	public int interpret(Map<String, Expression> variables) {
		
		return leftExp.interpret(variables)+rightExp.interpret(variables);
	}
	public Plus(){}
	public Plus(Expression leftExp,Expression rightExp){
		this.leftExp=leftExp;
		this.rightExp=rightExp;
	}
}
/**
 * 减
 */
class Minus implements Expression{
	private Expression leftExp;
	private Expression rightExp;
	@Override
	public int interpret(Map<String, Expression> variables) {
		
		return leftExp.interpret(variables)-rightExp.interpret(variables);
	}
	public Minus(){}
	public Minus(Expression leftExp,Expression rightExp){
		this.leftExp=leftExp;
		this.rightExp=rightExp;
	}
	
}
/**
 * 变量
 */
class Variable  implements Expression{
	private String name;
	@Override
	public int interpret(Map<String, Expression> variables) {
		if(variables==null) {return 0;}
		return variables.get(name).interpret(variables);
	}
	public Variable(String name) {
		this.name=name;
	}
}