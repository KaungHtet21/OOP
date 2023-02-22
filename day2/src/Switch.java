public class Switch {
    public static void main(String[] args) {
        int i = 1;
//        if (i == 1 || i == 2 || i == 3) {
//            System.out.println("Valid Value");
//        }

        // Traditional Switch
//        switch (i) {
//            case 1, 2, 3:
//                System.out.println("Valid Value");
//                System.out.println("But the value is 1");
//                break;
//            case 4:
//                System.out.println("Value is 4");
//                break;
//            default:
//                System.out.println("Invalid value");
//                break;
//        }
//
//        // Enhanced Switch
//        switch (i) {
//            case 1 -> {
//                System.out.println("Value is 1");
//            }
//            case 2 -> {
//                System.out.println("Value is 2");
//            }
//            default -> {
//                System.out.println("Invalid Value");
//            }
//        }

        String getQuarter = getQuarter("Apr");
        System.out.println(getQuarter);
    }
    public static String getQuarter(String month) {
        String result = "";
        switch (month) {
            case "Jan", "Feb", "March":
                result = "1st Quarter";
                break;
            case "Apr", "May", "June":
                result = "2nd Quarter";
                break;
            case "July", "Aug", "Sept":
                result = "3rd Quarter";
                break;
            default:
                result = "4th Quarter";
                break;
        }
        return result;
    }
}
