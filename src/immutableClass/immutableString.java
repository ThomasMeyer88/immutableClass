package immutableClass;

public final class immutableString {
	private String string;

	public immutableString(String string) {
		this.string = string;
	}
	public String getString() {
		return string;
	}
	
	public boolean compareImmutableStrings(immutableString s1, immutableString s2) {
		String string1 = s1.getString();
		String string2 = s2.getString();
		if (string1.length() == string2.length()) {
			return true;
		} else {
			return false;
		}
	}
 
}
