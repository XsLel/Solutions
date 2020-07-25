/* 
Link problema:https://codeforces.com/contest/1383/problem/B
Estado: Sin enviar
Solucion: A mi criterio
Complejidad: O(n)
Notas: se trata de elecciones multiples, no tengo idea de como hacerlo,
ordeno la lista y las elecciones son de izquierda a derecha, creo que es
algo ingenuo
*/
//template
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int t=Integer.parseInt(in.readLine());
		while(t-->0) {
			int n=Integer.parseInt(in.readLine());
			int i;
			List<Long> lista=new ArrayList<>();
			//StringTokenizer st=new StringTokenizer(in.readLine());
			String[] vec=in.readLine().split(" ");
			for(i=0;i<n;i++	) {
				lista.add(Long.parseLong(vec[i]));
			}
			Collections.sort(lista);
			long p1=0,p2=0;//players
			boolean turno=true;
			while(lista.size()>0){
				long x=p1;
				long y;
				if(turno)
					y=lista.remove(0);
				else
					y=lista.remove(lista.size()-1);
				long score=x^y;
				if(turno)
					p1=score;
				else
					p2=score;
			}
			if(p1==p2)
				out.append("DRAW\n");
			else if(p1>p2)
				out.append("WIN\n");
			else
				out.append("LOSE\n");
		}
		
		out.flush();
		in.close();
		out.close();
	}
	private static int modulo(int S, int N) { return ((S) & (N - 1)); } // returns S % N, where N is a power of 2
 
	private static int isPowerOfTwo(int S) { return (S & (S - 1)) == 0 ? 1 : 0; }
 
	 
}