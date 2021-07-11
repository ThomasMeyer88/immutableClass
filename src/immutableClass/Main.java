package immutableClass;

import immutableClass.immutableString;

public class Main {
	public static void main(String[] args) {
		
		immutableString s1 = new immutableString("abcd");
		immutableString s2 = new immutableString("bcda");
		immutableString s3 = new immutableString("cdab");
		immutableString s4 = new immutableString("random");
		
		boolean comp1 = s1.compareImmutableStrings(s1, s2);
		boolean comp2 = s2.compareImmutableStrings(s1, s3);
		boolean comp3 = s2.compareImmutableStrings(s1, s4);
		boolean comp4 = s2.compareImmutableStrings(s2, s3);
		boolean comp5 = s2.compareImmutableStrings(s2, s4);
		boolean comp6 = s2.compareImmutableStrings(s3, s4);

		System.out.println("Test " + s1.getString() + ", " + s2.getString() + ": " + comp1);
		System.out.println("Test " + s1.getString() + ", " + s3.getString() + ": " + comp2);
		System.out.println("Test " + s1.getString() + ", " + s4.getString() + ": " + comp3);
		System.out.println("Test " + s2.getString() + ", " + s3.getString() + ": " + comp4);
		System.out.println("Test " + s2.getString() + ", " + s4.getString() + ": " + comp5);
		System.out.println("Test " + s3.getString() + ", " + s4.getString() + ": " + comp6);


	}
}
