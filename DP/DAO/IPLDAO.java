package com.xworkz.DP.DAO;
import com.xworkz.DP.DTO.IplDTO;

public class IPLDAO {

	private IPLDAO[] ipldtos = new IPLDAO[5];
	private int temp = 0;

	public void create(IPLDAO dto) {
		System.out.println("invoked create method");
		if (temp < ipldtos.length && dto != null) {
			this.ipldtos[temp] = dto;
			temp++;
			System.out.println("array is added".concat(dto.getName()));
		} else {

			System.out.println("invalid passage of array");
		}

	}

	public void create(IPLDAO dto, int digit) {

		System.out.println("invoked overloading create method");

		if (temp < ipldtos.length && dto != null) {

			this.ipldtos[digit] = dto;
			System.out.println("array is added");
			temp++;
		} else {
			System.out.println("invalid index or dto parameter");
		}
	}

	public void occupiedIndex() {
		System.out.println("occupied index"+temp);
	}

	public boolean search(String name) {

		System.out.println("search method invoked");
		for (int i = 0; i < ipldtos.length; i++) {
			IplDTO ref = ipldtos[i];

			if (ref != null) {

				String variable = ref.getName();

				System.out.println("name to be searched "+name);
				if (name.equals(variable)) {
					System.out.println("name found");
					return true;
				} else {
					System.out.println("not found");
				}
			}

		}
		return false;
	}
	public IPLDAO[] getDetails() {
		
		return ipldtos;
		
		
	}
}
