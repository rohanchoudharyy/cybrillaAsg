import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //enter input in the following way =>   4 2
                                            //  2 1 2 5
        long a=sc.nextLong();
        long b=sc.nextLong(),c=0;
        long[] s = new long[(int) a];
        for(long j=0;j<a;j++)
        {
            s[(int) j]=sc.nextLong();
        }
        HashMap<Long,Integer> hash = new HashMap<Long,Integer>();
        for(int k=0;k<s.length;k++){
            if (hash.containsKey(s[k])) {
                hash.put(s[k], hash.get(s[k]) + 1);
            } 
            else {
                hash.put(s[k],1);
            }
        }
        ArrayList<Long> arr = new ArrayList<Long>();
        for (Map.Entry<Long, Integer> e : hash.entrySet()) {
            arr.add(e.getKey()*e.getValue());
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        for(long m:arr){
            if(b>0 && m>=0){
                c+=m;
                b-=1;
            }
        }
        System.out.println(c);
}
}