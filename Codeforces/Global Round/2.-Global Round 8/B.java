import java.util.*;
import java.io.*;
public class B1368{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long k=Long.parseLong(in.readLine());
        TreeMap<String,Long> map=new TreeMap<>();
        String c="codeforces";
        for(int i=0;i<10;i++){
            for(int j=i;j<10;j++){
                long x=(c.substring(i,j).length()*(c.substring(i,j).length()+1))/2;
                map.put(c.substring(i,j),x);
            }
        }
        
    }
}