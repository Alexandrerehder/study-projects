package demo;

import java.util.*;
import java.nio.file.*;

public class logParse {
	
	
	
	String info = " ";
	
	
	
	
	public static void main(String[] args) {
		
		try {
			List<String> lines = Files.readAllLines(Paths.get("src\\data\\file.log"));
				for(String line : lines) {
					line = line.replace("\"","");
					
					String[] result = line.split (" ");
					for(String s : result)
					System.out.print(s + ", ");
					System.out.println();
					
			
	
					
			}	
		}catch (Exception e) {
			System.out.println(e.getMessage());
}
		
	}
}
