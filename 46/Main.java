import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int arabicNumber = convertRomanToArabic(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " in Arabic format: " + arabicNumber);
    }

    public static int convertRomanToArabic(String romanNumeral) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int curValue = romanMap.get(romanNumeral.charAt(i));
            result += (curValue < prevValue) ? -curValue : curValue;
            prevValue = curValue;
        }

        return result;
    }
}
