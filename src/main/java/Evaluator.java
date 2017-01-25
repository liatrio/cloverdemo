public class Evaluator {

    public boolean is_foo(String string) {
        if (string.equals("foo"))
            return true;
        else
            return false;
    }

    public boolean is_greater(int a, int b) {
        if (a >= b) {
            System.out.println("a");
            return true;
        } else
            return false;
    }
}