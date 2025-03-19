package Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryL {

	public static void main(String[] arg) {
		ArrayList<String> tvseries = new ArrayList<String>();
		tvseries.add("Game of Throns");
		tvseries.add("breaking Bad");
		tvseries.add("Big Bang");

		tvseries.forEach(show -> {
			System.out.println(show);
		});

		for (int i = 0; i < tvseries.size(); i++) {
			System.out.println(tvseries.get(i));
		}

		Iterator<String> it = tvseries.iterator();
		while (it.hasNext()) {
			String show = it.next();
			System.out.println(show);
		}
		
		for(String show: tvseries)
		{
			System.out.println(show);
		}

	}

}
