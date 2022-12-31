package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        greatestCommonDivisor.printGCD(6,24);
    }
    public void printGCD(int first, int second) {
        int result = 0;
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
            result = temp;
        }
        System.out.print(result);
    }
}
