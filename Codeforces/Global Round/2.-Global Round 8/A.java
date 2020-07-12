import java.util.Scanner;
import java.io.*;
public class A1368{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            String[] s=in.readLine().split(" ");
            long a=Long.parseLong(s[0]);
            long b=Long.parseLong(s[1]);
            long n=Long.parseLong(s[2]);
            long sum_to_a=a;
            long sum_to_b=b;
            long sum_interactive=a;
            int cont1=0;
            int cont2=0;
            while(sum_to_a<=n&&sum_to_b<=n){
                sum_to_a+=b;
                sum_to_b+=a;
                cont1++;
            }
            boolean control=false;
            while(a<=n&&b<=n){
                if(control){
                    a+=b;
                    control=false;
                }else{
                    b+=a;
                    control=true;
                } 
                cont2++;
            }
            System.out.println(Math.min(cont1,cont2));
        }
    }
}