public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }
}

class Test {
    String sth = "Global";
    public void test() {
        String sth = "Local";
        System.out.println(this.sth);
    }
}