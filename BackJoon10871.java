import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int X = in.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int i = 0; i<N; i++) {
			if(arr[i]<X) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}


