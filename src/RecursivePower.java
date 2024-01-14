public class RecursivePower {
    public static double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }
        long N = n;
        if (n < 0) {
            N = -1*n;
            x = 1/x;
        }

        if (n % 2 != 0) {
            return x*myPow(x,n-1);
        }
        else {
            return myPow(x * x, n/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(myPow(2, -2147483648));
    }
}
