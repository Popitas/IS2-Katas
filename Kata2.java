import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 6, 6, 3, 3, 3, 3, 7, 20};
        HashMap<Integer, Integer> frequencyMap = new HashMap();
        
        //fore + (tab)
        for (int number : numbers) {
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

        int number = -1;
        int maxOcurrences = 0;

        for (Integer key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > maxOcurrences) {
                number = key;
                maxOcurrences = frequencyMap.get(key);
            }
        }
        
        //sout + (tab)
        System.out.println(number + "->" + maxOcurrences);
    }
}
