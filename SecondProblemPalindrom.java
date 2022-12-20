public class SecondProblemPalindrom {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
		String reverseString = "";
		boolean isPalindrome = false;
		for(int i=s.length()-1;i>=0;i--) {
			reverseString += s.charAt(i);
		}
		if(s.toLowerCase().equals(reverseString.toLowerCase())) {
			isPalindrome = true;
		}
		return isPalindrome;
    }
}
