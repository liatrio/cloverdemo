public class Demo {
    public String s;

    public Demo() {
        this.s = "Hello world!";
    }

    public void another_method() {this.s = "it"; }

    public String foo_bar() {
        if (1==1) return ("Foo");
//        else return ("Bar");
    }
}