package org.liuxt.ibatisSpring.model;

public class OrderByBean {
	String field;
	String order;

	public OrderByBean(String field, String order) {
		this.field = field;
		this.order = order;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

}
