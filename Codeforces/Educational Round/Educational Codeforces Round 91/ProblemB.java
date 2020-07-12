import java.util.*;
import java.io.*;
class Problem{
	public static void main(String[] args) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int t=Integer.parseInt(in.readLine());
		while(t-->0){
			char[] vec=in.readLine().toCharArray();
			String ans="";
			for(int i=0;i<vec.length;i++){
				if(vec[i]=='R')
					ans+="P";
				else if(vec[i]=='P')
					ans+="S";
				else
					ans+="R";
			}
			out.println(ans);
		}
		
		out.flush();
		in.close();
		out.close();
	}
	private static int modulo(int S, int N) { return ((S) & (N - 1)); } // returns S % N, where N is a power of 2
 
	private static int isPowerOfTwo(int S) { return (S & (S - 1)) == 0 ? 1 : 0; }
 
	 
}