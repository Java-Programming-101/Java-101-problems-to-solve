/**
 * 
 */
package Problems;



/**
 * The beersong
 * In this puzzle, write code to print out the entire "99 bottles of beer on the wall" song.
 * 
 * For those who do not know the song, the lyrics follow this form:
 * 
 * X bottles of beer on the wall
 * X bottles of beer
 * Take one down, pass it around
 * X-1 bottles of beer on the wall
 * X-1 bottles of beer on the wall
 * 
 * ...
 * 
 * Take one down, pass it around
 * 0 bottles of beer on the wall
 * 
 * Where X and X-1 are replaced by numbers of course.
 * 
 * Grammatical support for "1 bottle of beer" is optional.
 * 
 * As with any puzzle, try to do it in as creative/concise/comical a way as possible (simple, obvious solutions allowed, too).
 *
 */
public class BeerSong {
	
	public static void main(String[] args) {
	
	for (int x = 99; x>0;x--){
		System.out.println(x +" bottles of beer on the wall.");
		System.out.println(x +" bottles of beer.");
		System.out.println("Take one down, pass it around");
		if (x == 2) {
			System.out.println(x-1 + " bottle of beer on the wall.");
		}
		System.out.println(x-1 + " bottles of beer on the wall.\n");
		}

	}
}
