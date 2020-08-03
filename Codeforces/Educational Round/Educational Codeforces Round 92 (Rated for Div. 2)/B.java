/* 
Link problema:https://codeforces.com/contest/1389/problem/A
Estado: Sin enviar
Solucion: A mi criterio
Complejidad: O(n)
Notas: Creo que hay que usar DP, para elegir la suma maxima
*/
//template
import java.util.*;
import java.io.*;
public class B{
	public static void main(String[] args) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int t=Integer.parseInt(in.readLine());
		while(t-->0) {
			StringTokenizer st=new StringTokenizer(in.readLine());
			int n=Integer.parseInt(st.nextToken());
			int k=Integer.parseInt(st.nextToken());
			int z=Integer.parseInt(st.nextToken());
			int i;
			int[] a=new int[n];
			st=new StringTokenizer(in.readLine());
			for(i=0;i<n;i++)
				a[i]=Integer.parseInt(st.nextToken());
			i=1;
			int anterior=a[0];
			int suma=a[0];
			boolean left=true;
			while(k-->0	){
				suma+=a[i];
				if(a[i-1]>a[i]&&left&&z>0) {
					i--;
					left=false;
					z--;
					continue;
				}else {
					left=true;
					i++;
				}
			}
			out.append(String.valueOf(suma));
			out.append("\n");
		}
		
		out.flush();
		in.close();
		out.close();
	}
	private static int modulo(int S, int N) { return ((S) & (N - 1)); } // returns S % N, where N is a power of 2
 
	private static int isPowerOfTwo(int S) { return (S & (S - 1)) == 0 ? 1 : 0; }
 
	 
}