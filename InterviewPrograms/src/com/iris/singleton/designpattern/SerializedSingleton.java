package com.iris.singleton.designpattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2266763944723093511L;

	private SerializedSingleton () {
		
	}
	
	private static class SingletonHelper{
		private static final SerializedSingleton SERIALIZED_SINGLETON = new SerializedSingleton();
	}
	
	public SerializedSingleton getInstance() {
		return SingletonHelper.SERIALIZED_SINGLETON;
	}

}
