package org.itstep;

import java.util.ArrayList;
import java.util.Arrays;

public class Discount3 {

	public static void main(String[] args) {

		ArrayList<Goods> List = new ArrayList<Goods>();

		Goods g1 = new Goods(222, 200);
		Goods g2 = new Goods(333, 300);
		Goods g3 = new Goods(444, 400);
		Goods g4 = new Goods(333, 300);
		Goods g5 = new Goods(444, 400);
		Goods g6 = new Goods(111, 100);
		Goods g7 = new Goods(444, 400);
		Goods g8 = new Goods(222, 200);
		Goods g9 = new Goods(444, 400);
		Goods g10 = new Goods(333, 300);

		List.addAll(Arrays.asList(g1, g2, g3, g4, g5, g6, g7, g8, g9, g10));
		int[] discountArray;
		discountArray = new int[List.size()];
		int n = 0, k = 0, l = 0, j = 0;
		int totalsumm = 0;

		for (int i = 0; i < List.size(); i++) {

			switch (List.get(i).getCode()) {
			case 111:
				n = n + 1;
				if (n % 3 == 0) {
					discountArray[i] = List.get(i).getPrice() / 2;
				} else {
					discountArray[i] = List.get(i).getPrice();
				}
				break;
				
			case 222:
				j = j + 1;
				if (j % 3 == 0) {
					discountArray[i] = List.get(i).getPrice() / 2;
				} else {
					discountArray[i] = List.get(i).getPrice();
				}
				break;
				
			case 333:
				k = k + 1;
				if (k % 3 == 0) {
					discountArray[i] = List.get(i).getPrice() / 2;
				} else {
					discountArray[i] = List.get(i).getPrice();
				}
				break;
				
			case 444:
				l = l + 1;
				if (l % 3 == 0) {
					discountArray[i] = List.get(i).getPrice() / 2;
				} else {
					discountArray[i] = List.get(i).getPrice();
				}
				break;
			}
			totalsumm = totalsumm + discountArray[i];
		}
		System.out.println(totalsumm);
	}
}