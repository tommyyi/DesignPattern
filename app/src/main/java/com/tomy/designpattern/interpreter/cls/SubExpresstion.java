package com.tomy.designpattern.interpreter.cls;

import java.util.HashMap;

public class SubExpresstion extends SymbolExpresstion {

	public SubExpresstion(AbstractExpresstion _left, AbstractExpresstion _right) {
		super(_left, _right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Float interpreter(HashMap<String, Float> var) {
		// TODO Auto-generated method stub
		return super.left.interpreter(var) - super.right.interpreter(var);
	}

}
