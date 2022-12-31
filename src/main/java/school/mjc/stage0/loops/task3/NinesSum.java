package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void main(String[] args) {
        NinesSum ninesSum = new NinesSum();
        ninesSum.calculateSum(-6);
    }
    public void calculateSum(int lengthOfLastNumber) {
        int nines = 0;
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber+1; i++) {
            sum += nines;
            nines += (int) (9 * Math.pow(10, i - 1));
        }
        System.out.println(sum);

    }
}
