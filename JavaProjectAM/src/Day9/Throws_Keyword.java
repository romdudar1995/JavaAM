package Day9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws_Keyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		

		FileReader fr=null;
		fr = new FileReader("C:\\data\\Text.txt");
		
		BufferedReader bfr=new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(5000);
		
	}

}
