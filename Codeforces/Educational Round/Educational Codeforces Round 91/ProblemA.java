import java.util.*;
import java.io.*;
//State = wrong
class Problem {
	public static void main(String[] args) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int T=Integer.parseInt(in.readLine());
		while(T-->0){
			int n=Integer.parseInt(in.readLine());
			int i=0,j=1,k=2;
			int[] p=new int[n];
			String[] s=in.readLine().split(" ");
			for(int x=0;x<n;x++)
				p[x]=Integer.parseInt(s[x]);
			boolean left=false;
			boolean right=false;
			for(int x=1;x<n-1;x++){
				left=false;
				right=false;
				i=0;
				j=x;
				k=j+1;
				int menor=9999999;
				int i2=0;
				while(i<j){
					if(p[i]<menor){
						menor=p[i];
						i2=i;
					}
					i++;
				}
				if(p[i2]<p[j])
					left=true;
				int k2=0;
				if(left){
					int mayor=0;
					while(k<n){
						if(p[k]>mayor){
							mayor=p[k];
							k2=k;
						}
						k++;
					}
				}
				if(p[k2]<p[j])
					right=true;
				if(left&&right) {
					i=i2;
					k=k2;
					break;
				}
			}
			i++;j++;k++;
			if(left&&right){
				out.print("YES\n"+i+" "+j+" "+k+"\n");
			}else
				out.print("NO\n");
			
		}
		
		out.flush();
		in.close();
		out.close();
	}
	private static int modulo(int S, int N) { return ((S) & (N - 1)); } // returns S % N, where N is a power of 2
 
	private static int isPowerOfTwo(int S) { return (S & (S - 1)) == 0 ? 1 : 0; }
 
	 
}