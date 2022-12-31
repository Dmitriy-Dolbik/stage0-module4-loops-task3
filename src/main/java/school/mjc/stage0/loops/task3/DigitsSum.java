package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void main(String[] args) {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(124);
    }

    public void printDigitsSum(int t) {
        int sum = 0;
        while (t > 0) {
            sum += t % 10;
            t /= 10;
        }

        //Второй вариант
        /*String tString = Integer.toString(t);
        char[] tStringChar = tString.toCharArray();
        int sum = 0;
        for (int i = 0; i < tStringChar.length; i++) {
            sum += Integer.parseInt(Character.toString(tStringChar[i]));
        }*/
        System.out.println(sum);

    }
}
