public class Demo {
    public String s;
    public String ss;

    public boolean is_foo(String a) {
        if (a.equals("foo")) return true;
        else return false;
    }

    public boolean is_greater(int a, int b) {
        if (a >= b) {
            System.out.println("a");
            return true;
        } else return false;
    }
}