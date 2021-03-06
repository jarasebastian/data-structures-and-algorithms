package algorithms.recursion;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Class for reversing a string or integer
 */
public class Reverse {
	
	public static void main(String[] args) {
		
		int number = 254; //400 + 50 + 2
		System.out.println(reverseNumber(number, Integer.toString(number).length()-1));
		System.out.println();
		String word = "Hello";
		System.out.println(reverseWord(word, word.length()-1));
	}
	
	/**
	 * Function which returns a reversed a integer number
	 * Recieves the number to be reversed and the quantity of digits contained in that number as parameters
	 * @param number
	 * @param digits
	 * @return
	 */
	public static int reverseNumber(int number, int digits) {
		
		if(number < 10) {
			return number;
		}else {
			return (number % 10) * (int) Math.pow(10, digits) + (reverseNumber(number/10, digits-1));
		}
	}
	
	/**
	 * Function which receives a String and returns it reversed
	 * Receives the String and the length of that string
	 * @param word
	 * @param length
	 * @return
	 */
	public static String reverseWord(String word, int length) {
		
		if(length==0) {
			return word.charAt(length)+"";
		}else {
			return word.charAt(length) + (reverseWord(word, length-1));
		}
	}
	
	

}
