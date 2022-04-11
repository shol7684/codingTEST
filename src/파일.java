import java.io.File;
import java.util.Arrays;

public class 파일 {

	public static void main(String[] args) {
		
		File file = new File("." , "파일.java");
		
		System.out.println(file);
		System.out.println(file.getPath());
		
		System.out.println(file.getParent());
		
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.exists());
		
		System.out.println(file.length());
		
//		new File("." , File.separator + "hh").mkdir();
		
		String[] list = new File("C:\\Users\\82102\\Desktop").list();
		
		System.out.println(Arrays.toString(list));
		
	}
}
