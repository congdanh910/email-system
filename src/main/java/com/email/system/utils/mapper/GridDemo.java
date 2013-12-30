package com.email.system.utils.mapper;

import java.io.Serializable;
import java.util.List;

public class GridDemo<T extends Serializable> {

	private List<T> rows;

	public GridDemo() {
	}

	public GridDemo(List<T> rows) {
		this.rows = rows;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public String toString() {
		return "Rows : " + rows;
	}
}
