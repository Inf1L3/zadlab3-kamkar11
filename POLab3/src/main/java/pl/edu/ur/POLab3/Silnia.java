package pl.edu.ur.POLab3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author student
 */
public class Silnia {
    // metoda silnia zwraca silnię z liczby przekazanej jako parametr
// obliczenie silni odbywa się za pomocą rekurencji

    public static int silnia(int wartosc) {
// jeśli przekazany parametr jest równy zero to zwróć 1
// a w przeciwnym wypadku zwróć wartość parametru * wywołanie metody silnia
// z parametrem o jeden mniejszym
//silnia reku
/*
        if (wartosc == 0) {
            return 1;
        } else {
            return wartosc * silnia(wartosc - 1);
        }
         */
// silnia ite
        if (wartość == 0) {
            return 1;
        } else {
            int i = 1, s = 1;
            while (i <= n) {
                s = s * i;
                i++;
            }
        }
    }
