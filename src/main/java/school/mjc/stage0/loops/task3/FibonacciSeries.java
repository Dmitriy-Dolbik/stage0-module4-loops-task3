package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.printFibonacci(3);
    }
    public void printFibonacci(int lastFibonacci) {
        int sum = 0;
        int x = 0;
        int y = 1;
        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < lastFibonacci-2; i++) {
            sum = x+y;
            System.out.println(sum);
            x = y;
            y = sum;
        }
    }
}
