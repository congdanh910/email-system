package com.email.system.utils.mapper;

import java.io.Serializable;
import java.util.List;

public class GridResponse<T extends Serializable> {

	private String page;
	private int totalPages;
	private int records;
	private List<T> rows;

	public GridResponse() {
	}

	public GridResponse(String page, int totalPages, int records, List<T> rows) {
		this.page = page;
		this.totalPages = totalPages;
		this.records = records;
		this.rows = rows;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		this.records = records;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "GridResponse [page=" + page + ", totalPages=" + totalPages
				+ ", records=" + records + "]";
	}
}
