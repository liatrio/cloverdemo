import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DemoTest {
    private Demo testClass = new Demo();

    @Test
    public void test1() {assertTrue(testClass.is_foo("foo"));}

//    @Test
//    public void test2() {
//        assertFalse(testClass.is_greater(3, 5));
//    }
//
//    @Test
//    public void test3() {
//        assertTrue(testClass.is_greater(5, 3));
//    }
}