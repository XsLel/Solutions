import java.util.Scanner;
public class A1367{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
			String b=scan.next();
			int size=b.length();
			int i=3;
			String ans="";
			ans=b.substring(0,2);
			if(size%2==0){
				while(i<size){
					ans+=b.charAt(i);
					i+=2;
				}
			}else{
				while(i<size){
					ans+=b.charAt(i);
					i+=2;
				}
			}
			System.out.println(ans);
		}
	}
}