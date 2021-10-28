package com.xworkz.DP.DAO;

import com.xworkz.DP.DTO.WebSeriesDTO;

public class WebSeriesDAO {

	private WebSeriesDTO[] dto = new WebSeriesDTO[5];
	private int number = 0;
	
	public void saveWebSeries(WebSeriesDTO name) {
		if (this.number < this.dto.length && name != null) {

			this.dto[number] = name;
			System.out.println("create method invoked".concat(String.valueOf(number)));
			number++;

		}

		else {
			System.out.println("invalid index");

		}
	}

	public void delete(int digit) {

		if (digit < dto.length && digit >= 0) {

			this.dto[digit] = null;
			System.out.println("deleted the required index".concat(String.valueOf(digit)));
		} else {

			System.out.println("invalid index");
		}
	}
	

	public void update(int digit, WebSeriesDTO name) {

		if (digit < dto.length && digit >= 0) {

			dto[digit] = name;
			System.out.println("update created ".concat(String.valueOf(digit)).concat(": ").concat(String.valueOf(name)));
		} else {
			System.out.println("invalid index");
		}
	}

	public WebSeriesDTO[] getdto() {

		return dto;
	}

	
	
}
