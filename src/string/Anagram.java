package string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "care";
		String s2 = "race";
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toCharArray();
			char[] ArrayS2 = s2.toCharArray();
	//char[] ArrayS1 = s1.toLowerCase().toCharArray();
	//char[] ArrayS2 =s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
		Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		
		if (status) {
			System.out.println(s1+ " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1+ " and " + s2 + " are not anagrams");
		}
	}

}
