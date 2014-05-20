package com.springjerseydemo.model;

import java.io.Serializable;

public class Demo implements Serializable {

	private static final long serialVersionUID = 1754810232476458519L;

	private String key;
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Demo [key=" + key + ", value=" + value + "]";
	}

}
