/**
 * 
 */
package Problems;

import java.util.Scanner;

/**
 * Write a function/method/subroutine/... that when given an integer greater than 
 * or equal to zero returns a string of the number followed by an apostrophe then 
 * the ordinal suffix. 
 * 
 * Example returns would include 1'st 2'nd 3'rd 11'th 111'th 1001'st 1012'th
 *
 */
public class Nth_Number {
	public static void main(String args[]) {
		System.out.println("Give me a Number that is 0 or higher");
		Scanner scanner = new Scanner(System.in);
		String uString = scanner.next();
		
		//for (int i = 1 ; i<=100 ; i++){
			//String uString = Integer.toString(i);
			char laString = uString.charAt(uString.length()-1);
			switch (laString) {
				case '1':
					if (uString.length()>1){
						if (uString.charAt(uString.length()-2)== '1'){
							System.out.println(uString+"th");
							break;
						}else {
						System.out.println(uString+"st");
						break;
						}
					}else {
						System.out.println(uString+"st");
						break;	
					}
					
				case '2':
					if (uString.length()>1) {
						if (uString.charAt(uString.length()-2) == '1'){
							System.out.println(uString+"th");
							break;
						}else{
							System.out.println(uString+"nd");
							break;
						}
					}else{
						System.out.println(uString+"nd");
						break;
					}
				case '3':
					if (uString.length()>1) {
						if (uString.charAt(uString.length()-2) == '1'){
							System.out.println(uString+"th");
							break;
						}else{
							System.out.println(uString+"rd");
							break;
						}
					}else{
						System.out.println(uString+"rd");
						break;
					}
					
				case '4': case '5' : case '6' : case '7': case '8': case '9' : case'0':
					System.out.println(uString + "th");
					break;
		

				default:
					break;
			}
		}
			
		
		
		
	//}

}
