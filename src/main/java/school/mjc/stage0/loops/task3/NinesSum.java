package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void main(String[] args) {
        NinesSum ninesSum = new NinesSum();
        ninesSum.calculateSum(4);
    }
    public void calculateSum(int lengthOfLastNumber) {
        /*StringBuilder nines = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int sum = 0;
        for (int i = 1; i <=lastFibonacci; i++) {
            nines.append("9");
            result.append(nines);
            if (i != lastFibonacci){
                result.append("+");
            }
        }
        System.out.println(result);*/

        //Second option
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += (int) (9 * Math.pow(10, i - 1));
            System.out.print(sum);
            if (i != lengthOfLastNumber){
                System.out.print("+");
            }
        }

    }
}
