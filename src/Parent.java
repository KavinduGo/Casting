public class Parent {
    void printData() {
        System.out.println("Method of Parent class");
    }
}
class Child extends Parent {
    @Override
    void printData() {
        System.out.println("Method of Child class");
    }
}
class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        p.printData();
    }
}
