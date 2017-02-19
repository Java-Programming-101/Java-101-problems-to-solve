package text_in_a_frame;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Hello");
		list.add("World");
		list.add("in");
		list.add("a");
		list.add("frame");
		
		
		FrameTheText.printInFame(list);
	}
}
