package text_in_a_frame;

import java.util.List;

public class FrameTheText {
	
	public static void printInFame( List<String> list) {
		
		//get the longest string length
		int longest = 0;
		
		for(String string : list){
			if (string.length() > longest){
				longest = string.length();
			}
		}
		
		// print top row of *'s
		rowOfStars(longest + 4);
		
		System.out.println();

		
		// print the words 
		for(String string : list){
			System.out.print("* "+ string);
			
			// if this is not the longest word we need to fill in some space 
			if (string.length()< longest){
				for (int x = string.length() ; x <= longest-1; x++){
					System.out.print(" ");
				}
			}
			System.out.println(" *");
		}
		
		// print last row of *'s
		rowOfStars(longest + 4);
	}
	
	public static void rowOfStars( int l) {
		for (int i = 0; i < l ; i++){
			System.out.print("*");
		}
		
	}

}
