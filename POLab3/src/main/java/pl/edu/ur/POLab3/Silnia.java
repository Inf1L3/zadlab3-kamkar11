package pl.edu.ur.POLab3;


public class Silnia {
    

    public static int silnia(int wartosc) {

        //silnia rekurencyjnie
        
         /*
        if (wartosc == 0) {
            return 1;
        } else {
            return wartosc * silnia(wartosc - 1);
        }
         */
         
        // silnia iteracyjnie
        if (wartosc == 0) {
            return 1;
        } else {
            int i = 1, s = 1;
            while (i <= wartosc) {
                s = s * i;
                i++;
            }
            return s;
        }
        
    }   
}
