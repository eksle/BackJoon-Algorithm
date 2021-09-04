import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		for(int i = 0; i < T; i++) {
			int r = in.nextInt();
			String s = in.next();
			
			for(int j = 0; j < s.length(); j++){
				for(int k = 0; k < r; k++) {
					System.out.print(s.charAt(j));
				}
			}
			
			System.out.println();
		}
	}
	
}




