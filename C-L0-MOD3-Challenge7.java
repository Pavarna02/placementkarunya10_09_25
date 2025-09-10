import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        i = Math.max(a, b);
        while(true)
        {
            if(i % a==0 && i % b==0)
            break;
            i++;
        }
        System.out.print(i);
    }
}
