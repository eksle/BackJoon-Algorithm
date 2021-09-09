import java.util.*;
import java.io.*;

public class Main {
	
	public static int[][] Apt = new int[15][15];
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Apt();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(Apt[k][n]).append('\n');
						
		}
		System.out.println(sb);
	}
	
	public static void Apt() {
		
		for(int i = 0; i < 15; i++) {
			Apt[i][1] = 1;
			Apt[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				Apt[i][j] = Apt[i] [j - 1] + Apt[i - 1][j];
			}
		}
	}
	
}

