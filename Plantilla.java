import java.util.*;
import java.io.*;
public class Problem {
	public static void main(String[] args) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		
		
		out.flush();
		in.close();
		out.close();
	}
	private static int modulo(int S, int N) { return ((S) & (N - 1)); } // returns S % N, where N is a power of 2
 
	private static int isPowerOfTwo(int S) { return (S & (S - 1)) == 0 ? 1 : 0; }
 
	 
}