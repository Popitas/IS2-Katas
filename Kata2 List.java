import java.util.ArrayList;
import java.util.Collections;

public class Kata2 {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 6, 6, 3, 3, 3, 3, 7, 20};
        ArrayList<Integer> numberList = new ArrayList();
        for (Integer integer : numberList) {
            numberList.add(integer);
        }

        Collections.sort(numberList);

        int previousNumber = -1;
        int previousOcurrences = 0;
        int maxOcurrences = 0;
        int maxNumber = 1;

        for (Integer number : numberList) {
            if (number != previousNumber) {
                if (previousOcurrences > maxOcurrences) {
                    maxOcurrences = previousOcurrences;
                    maxNumber = previousNumber;
                }
                previousNumber = number;
                previousOcurrences = 0;
            }
            previousOcurrences += 1;
        }
    }
}
