package com.pat.Interpreter;

import java.util.Map;
import java.util.Stack;
/**
 * 解释器，继承解释器规则类
 * @author ZX
 * 知识点补充
   peek()与pop()
       相同点：大家都返回栈顶的值。
       不同点：peek 不改变栈的值(不删除栈顶的值)，pop会把栈顶的值删除。
 */
public class Evaluator implements Expression{
    private Expression syntaxTree;
    
    public Evaluator(String expression) {
    	if(expression==null||"".equals(expression)) {return;}
    	Stack<Expression> expreStack = new Stack<Expression>();
    	String[] tokens  = expression.split(",");
    	for(String token:tokens) {
    		if("+".equals(token)) {
    			Expression subExpression = new Plus(expreStack.pop(),expreStack.pop());
    			expreStack.push(subExpression);
    		}else if("-".equals(token)) {
    			Expression subExpression = new Minus(expreStack.pop(),expreStack.pop());
    			expreStack.push(subExpression);
    		}else {
    			expreStack.push(new Variable(token));
    		}
    	}
    	syntaxTree=expreStack.pop();
    }
    
    
    
	@Override
	public int interpret(Map<String, Expression> variables) {
		// TODO Auto-generated method stub
		return syntaxTree.interpret(variables);
	}

}
