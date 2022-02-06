import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class Problem2 {
    static boolean stringHasUniqueCharacters(String s1) {
        return false; // TODO
    }

    static boolean linkedListHasDuplicateValues(Node head) {
        return false; // TODO
    }

    static boolean linkedListIntersectsItself(Node head) {
        return false; // TODO
    }

    static int countAddsTo10(List<Integer> list) {
        int counter = 0;
        Set<Integer> tenMinus = new HashSet<>();
        for(Integer ele: list) {
            if(tenMinus.contains(ele)) {
                counter += 1;
            }
            int lookFor = 10 - ele;
            tenMinus.add(lookFor);
        }
        return counter;

    }

    static int diffOfK(List<Integer> list, int k) {
        return 0;
    }

}
