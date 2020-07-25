/* 
Link problema:https://codeforces.com/contest/1383/problem/A
Estado: WR
Solucion: A mi criterio
Complejidad: O(n)
*/
import java.util.*;
import java.io.*;
public class A1383{
	public static void main(String[] args) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int t=Integer.parseInt(in.readLine());
		while(t-->0) {
			int n=Integer.parseInt(in.readLine());
			String A=in.readLine();
			String B=in.readLine();
			char aux='x';
			Set<Character> conjunto=new TreeSet<>();
			boolean hay_solucion=true;//si un caracter de B < A no hay solucion
			for(int i=0;i<n;i++	){
				if(B.charAt(i)<A.charAt(i)) {
					hay_solucion=false;
					break;
				}
				if(B.charAt(i)!=A.charAt(i)) 
					conjunto.add(A.charAt(i));
			}
			if(hay_solucion) {
				out.append(String.valueOf(conjunto.size()));
				out.append("\n");
			}else
				out.append("-1\n");
		}
		
		out.flush();
		in.close();
		out.close();
	}
	private static int modulo(int S, int N) { return ((S) & (N - 1)); } // returns S % N, where N is a power of 2
 
	private static int isPowerOfTwo(int S) { return (S & (S - 1)) == 0 ? 1 : 0; }
 
	 
}