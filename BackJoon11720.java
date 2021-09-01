import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
	
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		String A = in.next();
		in.close();
		
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += A.charAt(i)-'0';
		}
		
		System.out.print(sum);

	}
	
}

