package org.itstep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Discount5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Goods> List = new ArrayList<Goods>();
		// ArrayList<Integer> discountArray2 = new ArrayList<>();
		ArrayList<Integer> discountArray = new ArrayList<>();
		ArrayList<Integer> Summ = new ArrayList<>();
		Goods g1 = new Goods(2, 100);
		Goods g2 = new Goods(37, 300);
		Goods g3 = new Goods(22, 200);
		Goods g4 = new Goods(22, 200);
		Goods g5 = new Goods(22, 200);
		Goods g6 = new Goods(111, 150);
		Goods g7 = new Goods(411, 100);
		Goods g8 = new Goods(4, 200);
		Goods g9 = new Goods(4474, 400);
		Goods g10 = new Goods(333, 300);
		int totalsumm = 0;
		int k = 0;

		List.addAll(Arrays.asList(g1, g2, g3, g4, g5, g6, g7, g8, g9, g10));

		for (int i = 0; i < List.size(); i++) {
			discountArray.add(List.get(i).getCode());
		}

		ArrayList<Integer> discountArray21 = new ArrayList<Integer>(new HashSet<Integer>(discountArray));
		Collections.sort(discountArray21);
		System.out.println(discountArray21);

		for (int i = 0; i < discountArray21.size(); i++) {
			k = 0;
			for (int j = 0; j < List.size(); j++) {
				if (discountArray21.get(i) == List.get(j).getCode()) {
					k = k + 1;
					if (k % 3 == 0) {
						Summ.add(List.get(j).getPrice() / 2);
					} else {
						Summ.add(List.get(j).getPrice());
					}
				}
			}
			
		}
		System.out.println(Summ);

		for (int i = 0; i < List.size(); i++) {
			totalsumm = totalsumm + Summ.get(i);
		}
		System.out.println("totalsumm: " + totalsumm);
	}

}
