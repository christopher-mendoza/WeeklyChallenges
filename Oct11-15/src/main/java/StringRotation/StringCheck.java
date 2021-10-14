package StringRotation;

public class StringCheck {
	/*
	 * Write a program which accepts two given String and checks if they are the rotation of each. 
	 * If they then return true otherwise return false. 
	 * A String is said to be a rotation of other string if they contain same characters and the sequence 
	 * is rotated across any character, e.g. "dabc" is a rotation of "abcd" but "dbac" is not.
	 */
	
	// Tested in src/test/java
	public boolean rotationCheck(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		
		String c = a + a;
		if(c.contains(b)) {
			return true;
		}
		else {
			return false;
		}
	}
}
