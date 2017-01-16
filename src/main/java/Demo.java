public class Demo {
    public String s;

    public Demo() {
        this.s = "Hello world!";
    }

    public void another_method() {
        this.s = "it";
    }

    public String return_string() {
        s = "b";

        if (1 == 1) {
            System.out.println("a");
            System.out.println("a");
            System.out.println("a");
            System.out.println("a");
            return s;
        }
        else return s;
    }
}