import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem2Tests {
    @Test
    public void testStringHasUniqueCharacters() {
        assertTrue(Problem2.stringHasUniqueCharacters("ABCDE"));
        assertTrue(Problem2.stringHasUniqueCharacters("peas"));
        assertTrue(Problem2.stringHasUniqueCharacters("A"));
        assertFalse(Problem2.stringHasUniqueCharacters("AA"));
        assertFalse(Problem2.stringHasUniqueCharacters("ABCCA"));
        assertFalse(Problem2.stringHasUniqueCharacters("ABCDEAFG"));
    }


    @Test
    public void testLinkedListHasDuplicateValues() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        assertFalse(Problem2.linkedListHasDuplicateValues(n1));

        n4.val = 1;
        assertTrue(Problem2.linkedListHasDuplicateValues(n1));

        n1.val = 4;
        assertFalse(Problem2.linkedListHasDuplicateValues(n1));
    }

    @Test
    public void testLinkedListIntersectsItself() {
        Node n1 = new Node(1);
        Node n2 = new Node(1);
        Node n3 = new Node(1);
        Node n4 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        assertFalse(Problem2.linkedListIntersectsItself(n1));

        n4.next = n2;
        assertTrue(Problem2.linkedListIntersectsItself(n1));
    }

    @Test
    public void testCountAddsToTen() {
        int result = Problem2.countAddsTo10(Arrays.asList(1, 2, 3, 9, 7));
        assertEquals(2, result); // 1 and 9, 3 and 7
        result = Problem2.countAddsTo10(Arrays.asList(1, 9));
        assertEquals(1, result); // 1 and 9
        result = Problem2.countAddsTo10(Arrays.asList(0, 1));
        assertEquals(0, result); // none
        result = Problem2.countAddsTo10(Arrays.asList(-11, -5, 21, 15));
        assertEquals(2, result); // -11 and 21, -5 and 15
        result = Problem2.countAddsTo10(Arrays.asList(-5, 5, 15));
        assertEquals(1, result); // -5 and 15
    }


    @Test
    public void testDiffOfK() {
        int result = Problem2.diffOfK(Arrays.asList(1, 2, 3, 9, 7), 1);
        assertEquals(2, result); // 1 and 2, 2 and 3

        result = Problem2.diffOfK(Arrays.asList(1, 2, 3, 9, 7), 2);
        assertEquals(2, result); // 1 and 3, 9 and 3

        result = Problem2.diffOfK(Arrays.asList(1, 2, 3, 9, 7), 4);
        assertEquals(1, result); // 3 and 7

        result = Problem2.diffOfK(Arrays.asList(1, 2, 3, 9, 7), 6);
        assertEquals(2, result); // 1 and 7, 3 and 9

        // with reversed integers
        result = Problem2.diffOfK(Arrays.asList(9, 7, 1, 2, 3), 1);
        assertEquals(2, result); // 1 and 2, 2 and 3

        result = Problem2.diffOfK(Arrays.asList(9, 7, 1, 2, 3), 2);
        assertEquals(2, result); // 1 and 3, 9 and 3

        result = Problem2.diffOfK(Arrays.asList(9, 7, 1, 2, 3), 4);
        assertEquals(1, result); // 3 and 7

        result = Problem2.diffOfK(Arrays.asList(9, 7, 1, 2, 3), 6);
        assertEquals(2, result); // 1 and 7, 3 and 9

    }

}