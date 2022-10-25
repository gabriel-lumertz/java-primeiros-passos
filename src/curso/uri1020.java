package curso;

import java.util.Scanner;

public class uri1020 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int n, q, r, v; 
        
        n = sc.nextInt();

        r = n;

        v = 365;
        q = r / v;
        System.out.println(q + " ano(s)");
        r = r % v;

        v = 30;
        q = r / v;
        System.out.println(q + " mes(es)");
        r = r % v;

        System.out.println(r + " dia(s)");

        sc.close();

    }
}
