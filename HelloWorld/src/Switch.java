public class Switch {
    public static void main(String[] args) {

    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch(day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Firday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        }
    }
}
