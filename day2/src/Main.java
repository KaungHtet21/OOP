public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Person person = new Person();
        person.name = "Kks";
        person.test();
    }
}

class Person {
    String name = "Khk";
    private int age = 21;
    public void test() {
        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }
}