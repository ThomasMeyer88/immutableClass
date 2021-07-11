package immutableClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class immutableString {
	private String string;

	public immutableString(String string) {
		this.string = string;
	}
	public String getString() {
		return string;
	}
	
	public boolean compareImmutableStrings(immutableString s1, immutableString s2) {
		String string1 = s1.getString().toLowerCase();
		String string2 = s2.getString().toLowerCase();
		if (string1.length() == string2.length()) {
			char[] char1 = string1.toCharArray();
			char[] char2 = string2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			int i = 0;
			boolean test = false;
			for (char a : char1) {		
				if (a == char2[i]) {					
					test = true;
				} else {
					test = false;
					break;
				}
				i++;
			}
			return test;
		} else {
			return false;
		}
	}
	
	
 
}
