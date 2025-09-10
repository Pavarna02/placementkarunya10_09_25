import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,p;
        n=sc.nextInt();
        p=1;
        while(n>=p)
        {
            if(n==p){
                System.out.println("YES");
                return;
            }
            p = p*2;
        }
            System.out.println("NO");
        
    }
}
