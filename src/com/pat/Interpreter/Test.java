package com.pat.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		 String expression = "w,x,z,-,+";
		 Evaluator eva = new Evaluator(expression);
		 Evaluator sentence = new Evaluator(expression);
	        Map<String,Expression> variables = new HashMap<String,Expression>();
	        variables.put("w", new Number(1));
	        variables.put("x", new Number(2));
	        variables.put("z", new Number(3));
	        //求1-2+3
	        int result = sentence.interpret(variables);
	        System.out.println(result);
	}
}
