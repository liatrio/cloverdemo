public class Demo {
    public String s;

    public Demo() {
        this.s = "Hello world!";
    }

    public String another_method() {

        if (1 == 1) {
             this.s = "if";
             return this.s;
        }
        else {
            this.s = "else";
            return s;
        }
    }

    public String return_string(int a, int b) {
        s = "b";

        if (a >= b) {
            System.out.println("a");
            System.out.println("a");
            System.out.println("a");
            System.out.println("a");
            System.out.println("a");
            return s;
        }
        else return s;
    }
}