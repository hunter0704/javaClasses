package com.class11;

public class TwoArrrayDemo {
	public static void main(String[] args) {
		
		String[][] names = { { "Yultuz", "Alex", "Seda", "Gunay", "Judy" },
				{ "Emily", "Bahar", "Shubbah", "Brandon", "Em" }, { "Layliy", "Hunter", "April", "Kelly", "Kevin" } 
				};

		int lengthOfRows = names.length;
		System.out.println(lengthOfRows);

		int lengthOfCols = names[1].length;
		System.out.println(lengthOfCols);

		for (String getArrays[] : names) {
			for (String getName : getArrays) {
				System.out.print(getName + " ");
			}

			System.out.println();

		}
	}

}
