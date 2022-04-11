package MVC1;

import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MovieModel {

	public void addTitle(String title, List movieList) {
		movieList.add(title);
	}
	
	public void delTitle(String title, List movieList) {
		movieList.remove(title);
	}
	
	public void saveTitles(List movieList) throws IOException {
		File file = new File("movieTtile.txt");
		FileWriter  fw = new FileWriter(file,true);
		PrintWriter pw = new PrintWriter(fw);
		String[] items = movieList.getItems();
		
		for(int i=0;i<items.length;i++) {
			pw.println(items[i]);
			System.out.println(items[i]);
		}
		
		fw.close();
		pw.close();
		
	
	}

}