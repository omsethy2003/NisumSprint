import java.util.TreeSet;

public class Q12UniqueSorter {
    public static TreeSet<Integer> getUniqueSorted(int[] numbers) {
        TreeSet<Integer> uniqueSorted = new TreeSet<>();
        for (int num : numbers) {
            uniqueSorted.add(num);
        }
        return uniqueSorted;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 2, 5, 1, 9, 3};
        TreeSet<Integer> result = getUniqueSorted(numbers);
        System.out.println("Unique sorted numbers: " + result);
    }
}