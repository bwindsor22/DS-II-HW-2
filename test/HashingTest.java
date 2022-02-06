import org.junit.*;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;


public class HashingTest {


    @Test
    public void testBuiltInHash() {
        PersonBuiltInHashCode p1 = new PersonBuiltInHashCode("Bob", "Doe");
        PersonBuiltInHashCode p2 = new PersonBuiltInHashCode("John", "Doe");
        Set<PersonBuiltInHashCode> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p2);
        assertEquals(2, people.size());
    }

    @Test
    public void testPersonGoodHashCode() {
        PersonGoodHashCode p1 = new PersonGoodHashCode("Bob", "Doe");
        PersonGoodHashCode p2 = new PersonGoodHashCode("John", "Doe");
        Set<PersonGoodHashCode> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p2);
        assertEquals(2, people.size());
    }


    @Test
    public void testPersonBadHashCode() {
        PersonBadHashCode p1 = new PersonBadHashCode("Bob", "Doe");
        PersonBadHashCode p2 = new PersonBadHashCode("John", "Doe");
        Set<PersonBadHashCode> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p2);
        assertEquals(1, people.size());
    }

    @Test
    public void testPersonSelectiveHashCodeSameLastName() { // same last name => count as same person
        PersonSelectiveHashCode p1 = new PersonSelectiveHashCode("Bob", "Doe");
        PersonSelectiveHashCode p2 = new PersonSelectiveHashCode("John", "Doe");
        PersonSelectiveHashCode p3 = new PersonSelectiveHashCode("Sam", "Doe");
        Set<PersonSelectiveHashCode> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p2);
        people.add(p3);
        assertEquals(1, people.size());
    }


    @Test
    public void testPersonSelectiveHashCodeDifferentLastName() { // different last name => count as different
        PersonSelectiveHashCode p1 = new PersonSelectiveHashCode("Bob", "Doe");
        PersonSelectiveHashCode p2 = new PersonSelectiveHashCode("John", "Smith");
        Set<PersonSelectiveHashCode> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p2);
        assertEquals(2, people.size());
    }

}
