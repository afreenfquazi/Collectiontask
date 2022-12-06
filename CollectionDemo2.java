package com.practice.CollectionsProblems;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo2 {

	public static int getMaxNumber(List<Integer> l1) {
		int max = 0;
		int num = 0;
		List<Integer> list = l1;
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			num = itr.next();
			if (max < num)
				max = num;
		}
		return max;
	}

	public static List<Integer> getReversedList(List<Integer> l1) {
		List<Integer> list = l1;
		list.sort(Comparator.reverseOrder());
		return list;
	}

	public static List<Integer> getOrderedList(List<Integer> l1) {

		List<Integer> list = l1;

		list.sort(Comparator.naturalOrder());

		return list;
	}

	public static int getExactMidNumber(List<Integer> l1) {
		// return the mid number after sorting
		// NOTE : if the list size is odd, return the exact mid,
		// ex : after sorting, the list will be [32,48,145,202,598], the exact mid
		// number is 145

		// if the list size is even, return the max number from the mid numbers
		// EX: [10,14,54,76,234,123] => mids are [54,76] => as 76 is greater return 76
		// your code
		int midNum=0;
		List<Integer> list = l1;
		list.sort(Comparator.naturalOrder());
		if(list.size()==0) {
			int arr =  list.get(list.size()/2);
			//not completed
		}
		else
		{
			midNum = list.get(list.size()/2);
		}
		return midNum;
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(145);
		list1.add(202);
		list1.add(32);
		list1.add(48);
		list1.add(598);

		System.out.println("Max number is "+getMaxNumber(list1));
		System.out.println("Reversed order is "+getReversedList(list1));
		System.out.println("Sorted order is "+getOrderedList(list1));
		System.out.println("Exact mid number is "+getExactMidNumber(list1));
	}


}
