import java.util.*;
import java.io.*;

public class Main {
	
	public static int[][] Apt = new int[15][15];
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(N));
		
	}
	
	static int fibonacci(int N) {
		if(N == 0)return 0;
		if(N == 1)return 1;
		return fibonacci(N - 1) + fibonacci(N - 2);
	}
	
}
