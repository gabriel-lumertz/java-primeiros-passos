package curso.secao4;

import java.util.Scanner;

public class uri1046 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c;

    if (a < b) {

        c = b - a;
    
    } else {

        c = 24 - a + b;

    }

    System.out.printf("O JOGO DUROU %d HORA(S)%n", c);

    sc.close();
 
    }
}