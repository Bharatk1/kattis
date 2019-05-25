package com.dto;

import java.util.List;

public class TwoZeroFourEight {
	private List<Integer> firstRow;
	private List<Integer> secondRow;
	private List<Integer> thirdRow;
	private List<Integer> fourthRow;
	

	public TwoZeroFourEight() {

	}

	public TwoZeroFourEight(List<Integer> firstRow, List<Integer> secondRow, List<Integer> thirdRow,
			List<Integer> fourthRow) {
		super();
		this.firstRow = firstRow;
		this.secondRow = secondRow;
		this.thirdRow = thirdRow;
		this.fourthRow = fourthRow;
	}

	public List<Integer> getFirstRow() {
		return firstRow;
	}

	public void setFirstRow(List<Integer> firstRow) {
		this.firstRow = firstRow;
	}

	public List<Integer> getSecondRow() {
		return secondRow;
	}

	public void setSecondRow(List<Integer> secondRow) {
		this.secondRow = secondRow;
	}

	public List<Integer> getThirdRow() {
		return thirdRow;
	}

	public void setThirdRow(List<Integer> thirdRow) {
		this.thirdRow = thirdRow;
	}

	public List<Integer> getFourthRow() {
		return fourthRow;
	}

	public void setFourthRow(List<Integer> fourthRow) {
		this.fourthRow = fourthRow;
	}

}
