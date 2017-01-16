import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class DemoTest {
    Demo testClass = new Demo();

    @Test
    public void test1() {
        assertTrue(testClass.s == "Hello world!");
    }

    @Test
    public void test2(){
        assertTrue( testClass.foo_bar() == "Foo");
    }
}