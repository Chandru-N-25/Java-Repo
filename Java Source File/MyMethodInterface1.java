interface MyMethodInterface {
    void myMethod();
}

class MyClass implements MyMethodInterface {
    public void myMethod() {
        System.out.println("Method has been overridden");
    }
}

public class MyMethodInterface1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
    }
}
