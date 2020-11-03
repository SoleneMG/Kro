package hello;

public class HelloWorld {
    String name;

    public HelloWorld(String txt) {
        this.name = txt;
    }

    public void printHelloWorld() {
        System.out.println("Hello World by " + name);
    }

}
