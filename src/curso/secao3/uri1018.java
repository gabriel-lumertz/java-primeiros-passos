package curso.secao3;

import java.util.Scanner;

public class uri1018 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int n, a, ar, b, br, c, cr, d, dr, e, er, f, fr, g; 
        
        n = sc.nextInt();

        a = n / 100;
        ar = n % 100;
        b = ar / 50;
        br = ar % 50;
        c = br / 20;
        cr = br % 20;
        d = cr / 10;
        dr = cr % 10;
        e = dr / 5;
        er = dr % 5;
        f = er / 2;
        fr = er % 2;
        g = fr / 1;
        
        System.out.println(n);
        System.out.println(a + " nota(s) de R$ 100,00");
        System.out.println(b + " nota(s) de R$ 50,00");
        System.out.println(c + " nota(s) de R$ 20,00");
        System.out.println(d + " nota(s) de R$ 10,00");
        System.out.println(e + " nota(s) de R$ 5,00");
        System.out.println(f + " nota(s) de R$ 2,00");
        System.out.println(g + " nota(s) de R$ 1,00");
        sc.close();

    }
}
