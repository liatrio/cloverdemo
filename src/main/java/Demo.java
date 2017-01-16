public class Demo {
    public String s;

    public Demo() {
        this.s = "Hello world!";
    }

    public void another_method() {
        this.s = "it";
    }

    public String foo_bar() {
        s = "b";
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        return s;
    }
}