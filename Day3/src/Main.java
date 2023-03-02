import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int i;
//        for (i = 1; i < 10; i++) {
//            System.out.println("Student " + i);
//        }
//        System.out.println("Outside loop i = "+ i);
//        int j = 6;
//        while (j > 5) {
//            System.out.println("Inside while loop");
//            // Test Expression
//            j--;
//        }
//        System.out.println("Outside while loop j = " + j);
//
//        int k = 6;
//        do {
//            System.out.println("k = " + k);
//            k++;
//        }while (k < 10);
//        int[] arr = {1,2,3,4,5};
//        for (int number:arr) {
//            System.out.println(number);
//        }
//        int a = 6;
//        while (a < 5) {
//            System.out.println("Hello");
//            a++;
//        }
//        System.out.println("Outside while loop coz a = "+ a);
//
//        do {
//            System.out.println("Hello");
//            a++;
//        }while (a < 5);
//        System.out.println("Outside do while loop coz a = " + a);
//        for (int i = 1; i < 6; i++) {
//            if (i == 3) {
//                continue;
//            }
//            System.out.println("Student " + i);
//        }
//        int i = 1;
//        int j = 2;
//        // Nested statement
//        if (i == 1) {
//            if (j == 2) {
//                System.out.println("True");
//            }
//        }

        // Nested loop
//        for (int a = 1; a <=4; a++) {
//            for (int b = 1; b <=4; b++) {
//                System.out.println(a + " * "+ b);
//            }
//        }
        // dataType(className) name = new Obj()
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name;
//        name = scanner.next();
//        System.out.println("My name is " + name);
//
//        System.out.println("Enter your age");
//        int age = scanner.nextInt();
//        System.out.println("My age is " + age);

        for (int i = 0; i < 5; i++){
            if (i == 3){
                System.exit(0);
            }
            System.out.println("i = "+ i);
        }
        System.out.println("This is outside for loop");
    }
}