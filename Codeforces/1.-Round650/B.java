import java.util.Scanner;
public class B1367{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            int par=0;
            int impar=0;
            for(int i=0;i<n;i++){
                if(i%2==0){
                    if(scan.nextInt()%2!=0)
                        impar++;
                }else{
                    if(scan.nextInt()%2==0)
                        par++;
                }
            }
            if(par==impar)
                System.out.println(par);
            else
                System.out.println(-1);
        }
    }
}