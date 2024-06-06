import java.util.ArrayList;
import java.util.List;
public class StringCalculator {
    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }
        String[] numArray = numbers.split(delimiter);
        int sum = 0;
        List<String> negativeNumbers = new ArrayList<>();
        for (String num : numArray) {
            int number = Integer.parseInt(num);
            if (number < 0) {
                negativeNumbers.add(num);
            }
            sum += number;
        }
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " + String.join(", ", negativeNumbers));
        }
        return sum;
    }
}
