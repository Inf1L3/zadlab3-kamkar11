package pl.edu.ur.POLab3;

import java.util.Scanner;
import static pl.edu.ur.POLab3.Silnia.silnia;

public class Main extends Fibonacci {

    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4

        //1.3======================================================================
        /*
        int a=5;
        int b=5;
        
        if(a==5 && b==5 )
        {
            System.out.println("Takie same");
        }
        else
        {
            System.out.println("Różne");
        }
        
        byte bitowa1 = 3; // 0011
        byte bitowa2 = 6; // 0110
         
        int suma_bitowa = (bitowa1 | bitowa2);
        int iloczyn_bitowy = (bitowa1 & bitowa2);
        System.out.println("Suma bitowa: "+suma_bitowa);
        System.out.println("Iloczyn Bitowy : "+iloczyn_bitowy);
         */
        //1.4=========================================================================
        /*
        byte a = 64; // 0100 0000

        int i = a << 2; // 1 0000 0000
        int i1 = a >> 2; // 1 0000
        int i2 = a >>> 2;

        System.out.println("Oryginalna wartość: " + a);
        System.out.println("wartość int (po przesunięciu w lewo: " + i);
        System.out.println("wartość int (po przesunięciu w prawo: " + i1);
        System.out.println("wartość int (po przesunięciu w prawo bez znaku: " + i2);
         */
        //1.7========================================================================
        /*
        byte a = 3;
        byte b = 6;
        int e = (a^b);
        int d = (~(a^b));
        System.out.println("a= 3, b= 6, XOR: "+e);
        System.out.println("NOT(XOR): "+d);
         */
        //1.8========================================================================
        /*
        int a=10;
        
        if(a!=5)
        {
            System.out.println("NIe 5 !!");
        }
        else
        {
            System.out.println("TAk 5");
        }
         */
        //2.2========================================================================
        
        
        
        //3.1========================================================================
        // silnia rekurencyjnie
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = sc.nextInt();
        System.out.println(liczba + "! = " + silnia(liczba));
         */
        //silnia iterecyjnie
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = input.nextInt();
        System.out.println(liczba + "! = " + silnia(liczba));
         */
        //3.3========================================================================
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj podstawe: ");
        int x = input.nextInt();
        System.out.println("Podaj wykładnik: ");
        int n = input.nextInt();

        System.out.println("Wynik potęgowania rekurencyjnego: " + potegaRe(x , n));
        System.out.println("Wynik potegowania iteracyjnego: "+potegaIt(x , n));
        */
        //3.4========================================================================
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Który element ciągu Fibonacciego chcesz obliczyć: ");
        int n = input.nextInt();
        System.out.println(n + "-ty element ciągu Fibonacciego (rekurencja) wynosi: " + fibReku(n));
         */
    }

    // rekurencyjnie
    public static int potegaRe(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (!(n % 2 == 0)) {
            return x * (potegaRe(x, n - 1));
        } else {
            int a = potegaRe(x, n / 2);
            return a*a;
        }

    }

    // iteracyjnie        
    public static int potegaIt(int x, int n) {
        int wynik = 1;
        while (n > 0) {
            wynik = wynik *  x;
            n = n - 1;
        }
        return wynik;
    }

}
