package org.kosta.myproject.model;

public class ProductVO {
	private String maker;
	private long price;
	
	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "ProductVO [maker=" + maker + ", price=" + price + "]";
	}
	
	
}
