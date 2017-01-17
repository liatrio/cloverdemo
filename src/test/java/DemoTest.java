import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DemoTest {
    private Demo testClass = new Demo();

    @Test
    public void test1() {assertTrue(testClass.another_method().equals("if"));}

    @Test
    public void test2() {
        assertTrue(testClass.s.equals("Hello world!"));
    }

    @Test
    public void test3() {
        assertTrue(testClass.return_string(3,5).equals("b"));
    }

    @Test
    public void test4() {assertTrue(testClass.return_string(5,3).equals("b"));
    }
}