package org.itstep;

public class Goods {
	public static Object getCode;
	private int code;
	private int price;

	public Goods(int code, int price) {
		this.code = code;
		this.price = price;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
