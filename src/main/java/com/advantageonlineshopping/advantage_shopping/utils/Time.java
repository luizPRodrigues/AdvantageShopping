package com.advantageonlineshopping.advantage_shopping.utils;

public enum Time {

	_100(100),
	_300(300),
	_500(500),
	_1(1),
	_3(3),
	_5(5),
	_10(10),
	_30(30),
	_60(60),
	_120(120);

	private final int value;

	private Time(final int value) {
		this.value = value;
	}

	public int amount() {
		return value;
	}

	public int thousandfold() {
		return value * 1_000;
	}

}
