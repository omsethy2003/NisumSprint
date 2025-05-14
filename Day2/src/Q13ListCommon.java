import java.util.*;

public class Q13ListCommon {
    public static List<String> findCommon(List<String> list1, List<String> list2) {
        List<String> common = new ArrayList<>();
        Set<String> set1 = new HashSet<>();

        for (String item : list1) {
            set1.add(item);
        }

        for (String item : list2) {
            if (set1.contains(item) && !common.contains(item)) {
                common.add(item);
            }
        }

        return common;
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C", "D");
        List<String> list2 = Arrays.asList("C", "D", "E", "F");
        List<String> common = findCommon(list1, list2);
        System.out.println("Common elements: " + common);
    }
}