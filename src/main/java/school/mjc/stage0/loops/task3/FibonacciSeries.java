package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.printFibonacci(20);
    }
    public void printFibonacci(int lastFibonacci) {
        int sum = 0;
        int x = 0;
        int y = 1;
        System.out.println(x);
        System.out.println(y);
        while (sum <= lastFibonacci){
            sum = x+y;
            System.out.println(sum);
            x = y;
            y = sum;
        }
    }
}
