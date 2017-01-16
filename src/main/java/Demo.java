public class Demo {
    public String s;

    public Demo() {
        this.s = "Hello world!";
    }

    public void another_method() {this.s = "it"; }

    public void main() {
        System.out.println(s);
    }
}