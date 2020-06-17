package ds.strings;

public class StringProblemSolving {

	public static void main(String[] args) {
			
		findMaxOccuringChar("capability");
	}
	
	/**
	 * find maximum occuring character in a string
	 * 
	 * 1) Find using bruteforce approach T.C -O(n^2) S.C -O(1)
	 *      -> curr_char and curr_count for each iteration from left to right
	 *      - and compare with max_char and max_count
	 * 2) Sort the string and follow the char count 
	 *   	TC -O(nlogn) SC-O(1)
	 * 3) Construct binary search tree with unique characters and their count while inserting for max
	 *  	TC-O(nlogn) SC-O(n)
	 *  
	 *  4)Use HashTable which will be constant with 256 characters and take count
	 *       TC-O(n)  SC-O(1) (space is always constant for characters)
	 * 
	 */
	public static void findMaxOccuringChar(String s) {
		
		int[] temp = new int[256];
		int max =0;
		char repeatedChar = 0;
		for(int i =0; i<s.length();i++) {
			temp[s.charAt(i)]++;
		}
		for(int j=0; j<temp.length;j++) {
			if(max<temp[j]) {
				max = temp[j];
				repeatedChar=(char)j;
			}
		}
		
		System.out.println("Max repeated character in String :" + s + " is : " + repeatedChar + " and count is" + max);
		
		
		
	}

}
