package com.practice.CollectionsProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo1 {

	public static List<Integer> getZigZagList(List<Integer> l1, List<Integer> l2) {
		List<Integer> list1 = l1;
		List<Integer> list2 = l2;
		List<Integer> list3 = new ArrayList<Integer>();
		int element = 0, element1 = 0;
		int j = 0;

		for (int i = 0; i < list1.size(); i++) {

			j = i;
			element = list1.get(i);
			if (i % 2 == 0)
				list3.add(element);
			j++;
			if (j < list1.size() - 1) {
				element1 = list2.get(j);
				if (j % 2 != 0)
					list3.add(element1);
			}
		}

		return list3;

	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.add(500);

		System.out.println(getZigZagList(list1, list2));
		// expected output : [10,200,30,400,50]
		// get even index elements from list 1, odd index elements from list 2
		// store all in to another list and return

	}
}
