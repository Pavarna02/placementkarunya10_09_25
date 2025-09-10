import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int count=0;
        int a = sc.nextInt();  
        int b = sc.nextInt();  
        for( ; a>=b; a=a-b,count++);
        
        System.out.println(count);
        
    }
}
