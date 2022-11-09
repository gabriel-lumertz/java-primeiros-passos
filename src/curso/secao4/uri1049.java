package curso.secao4;

import java.util.Scanner;

public class uri1049 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String a = sc.nextLine();
    String b = sc.nextLine();
    String c = sc.nextLine();

    if (a == "vertebrado" && b == "ave" && c == "carnivoro") {

        System.out.println("aguia");

    } else if (a == "vertebrado" && b == "ave" && c == "onivoro") {

        System.out.println("pomba");

    } else if (a == "vertebrado" && b == "mamifero" && c == "onivoro") {

        System.out.println("homem");

    } else if (a == "vertebrado" && b == "mamifero" && c == "herbivoro") {

        System.out.println("vaca");

    } else if (a == "invertebrado" && b == "inseto" && c == "hematofago") {

        System.out.println("pomba");

    }
    
    System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
    
    sc.close();
}
}