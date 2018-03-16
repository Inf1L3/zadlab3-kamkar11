package pl.edu.ur.POLab3;

public class Fibonacci {

    public static int fibReku(int n) {

        if (n < 2) {
            return n; 
        } else {
            return fibReku(n - 1) + fibReku(n - 2); 
        }
    }

}
