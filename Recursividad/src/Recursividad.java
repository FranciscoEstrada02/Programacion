public class Recursividad {

    public static double factorial(double n){
        if(n == 0 || n == 1)
            return 1;
        return n * factorial(n-1);

    }

    public static int fib(int n){
        if(n <= 2)
            return 1;
        return fib(n-1) + fib(n-2);
    }
}
