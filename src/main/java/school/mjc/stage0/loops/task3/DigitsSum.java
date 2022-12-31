package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void main(String[] args) {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(-22);
    }

    public void printDigitsSum(int t) {
        int sum = 0;
        while (Math.abs(t) > 0) {
            sum += Math.abs(t) % 10;
            t /= 10;
        }
        System.out.println(sum);

    }
}
