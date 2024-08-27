import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }

        System.out.println("\nЗадание №2");

        List<Integer> nums2 = new ArrayList<>(List.of(7, 8, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numsSet = new HashSet<>();
        for (Integer i : nums2) {
            if ((i % 2) == 0) {
                numsSet.add(i);
            }
        }
        System.out.print(numsSet);

        System.out.println("\nЗадание №3");

        List<String> words = new ArrayList<>(List.of("рука", "каша", "алгебра", "рис", "каша", "рука", "барбарис"));
        Set<String> wordsSet = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            if (words.contains(words.get(i))) {
                wordsSet.add(words.get(i));
            }
        }
        System.out.println(wordsSet);

        System.out.println("Задание №4");

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> strings1 = new HashMap<>();
        for (String string : strings) {
            if (!strings1.containsKey(string)) {
                strings1.put(string, 1);
            } else {
                strings1.put(string, strings1.get(string) + 1);
            }
        }
        System.out.println(strings1.values());
    }
}