package MVC1;

import java.awt.List;
import java.io.IOException;

public class MovieController {

	MovieModel model = new MovieModel();
	
	public void addTitle(String title, List movieList) {
		
		model.addTitle(title,movieList);
	}
	
	public void delTitle(String title, List movieList) {
		model.delTitle(title, movieList);
	}
	
	public void saveTitles(List movieList) throws IOException {
		model.saveTitles(movieList);
	}
}
