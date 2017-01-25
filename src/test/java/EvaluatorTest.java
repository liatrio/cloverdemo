import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvaluatorTest {
    private Evaluator testClass = new Evaluator();

    @Test
    public void is_foo_test() {
        assertTrue(testClass.is_foo("foo"));
    }

    @Test
    public void is_greater_test_1() {
        assertFalse(testClass.is_greater(3, 5));
    }

    @Test
    public void is_greater_test_2() {
        assertTrue(testClass.is_greater(5, 3));
    }
}