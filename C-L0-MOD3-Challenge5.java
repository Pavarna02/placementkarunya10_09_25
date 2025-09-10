import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,a,n;
         n = sc.nextInt();
        a = sc.nextInt();
         
        for(i=1; i<=n; i++){
           
                System.out.println(i +" * "+a+" = "+a*i);
            
        }
    }
}
