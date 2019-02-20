package com.iris.impl;

import java.util.Collections;
import java.util.List;

import com.iris.java8.defaultstatic.methods.MyInterface;

public class MyClass implements MyInterface {

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		Integer maxint = Collections.max(intList);
		return maxint;
	}

}
