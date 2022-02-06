import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;


public class Problem3Test {

    @Test
    public void testLinkedListIntersectsItself() {
        // Cities John wants to go to in Europe
        List<String> citiesEurope = Arrays.asList("London", "Milan", "Paris");
        // Cities John wants to go to in Asia
        List<String> citiesAsia = Arrays.asList("Tokyo", "Beijing");

        // Cities Jane has already been to
        List<String> citiesEuropeJane = Arrays.asList("London");
        List<String> citiesAsiaJane = Arrays.asList("Beijing");

        // Solve this part
        Set<String> citiesToVisit = Problem3.inFirstNotSecond(Arrays.asList(citiesEurope, citiesAsia),
                Arrays.asList(citiesEuropeJane, citiesAsiaJane));

        // Cities John wants to go to Jane hasn't already been to
        Set<String> expected = new HashSet<>(Arrays.asList("Milan", "Paris", "Tokyo"));
        assertEquals(expected, citiesToVisit);
    }

}
