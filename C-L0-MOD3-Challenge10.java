import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // how many times to print alphabets

        for (int i = 0; i < n; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
