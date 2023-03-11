import java.util.Date;

// Modifier class Name {}
public class Main {
    public static void main(String[] args) {
        //dataType name = data;
        // Reference Variable
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.getCount();
        counter2.getCount();
        counter2.getCount();
//
//        // Primitive Variable
//        byte b = 2;
//        short s = 3;
//        int i = 1;
//        long l = 4;
//
//        // Type Casting
////        l = i;
//        i = (int) l;
//        System.out.println(i);

//        Example example = new Example();
//        System.out.println(example.i);
//        example.i = 1;
//        System.out.println(example.i);
    }
}
class Counter {
    static int count = 0;
    public static void getCount() {
        count++;
        System.out.println(count);
    }
}

class Example {
    public int i = 0;
    private int j = 0;
    public int getI() {
        return i++;
    }
}