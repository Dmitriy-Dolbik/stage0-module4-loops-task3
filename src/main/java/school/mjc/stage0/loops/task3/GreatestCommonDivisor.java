package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        greatestCommonDivisor.printGCD(60,48);
    }
    public void printGCD(int first, int second) {
        int temp = 1;
        for (int i = 1; i <= first ; i++) {
            if (second % i == 0 && first%i == 0){
                temp = i;
            }
        }
        System.out.println(temp);
    }
}
