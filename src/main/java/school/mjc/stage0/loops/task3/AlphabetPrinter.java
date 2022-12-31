package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public static void main(String[] args) {
        AlphabetPrinter alphabetPrinter = new AlphabetPrinter();
        alphabetPrinter.printAlphabet();
    }
    public void printAlphabet() {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println(Character.toChars(i));
        }
    }
}
