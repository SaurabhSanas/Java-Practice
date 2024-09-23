public class Switch {
    public static void Drink(int code){
        switch (code) {
            case 1:
                System.out.println("Preparing Cappuccino");
                break;
            case 2:
                System.out.println("Preparing Espresso");
                break;
            case 3:
                System.out.println("Preparing Latte");
                break;
            case 4:
                System.out.println("Preparing Milk");
                break;
            default:
                System.out.println("Drink not available");
                break;
        }
    }

    void Sorting_Hat(int n) {
        switch (n) {
            case 1:
                System.out.println("Hufflepuff");
                break;
            case 2:
                System.out.println("Gryffindor");
                break;
            case 3:
                System.out.println("Slytherin");
                break;
            case 4:
                System.out.println("Ravenclaw");
                break;
            default:
                System.out.println("Enter a number from 1 to 4");
                break;
        }
    }

    void DayOfTheWeek(String month, int date){
        int day;
        if(month.equals("January")) {
            day = date;
        } else if (month.equals("February")) {
            day = 31 + 28 + date;
        } else if (month.equals("March")) {
            day = 31 + 28 + date;
        } else if (month.equals("April")) {
            day = 90 + date;
        } else if (month.equals("May")) {
            day = 120 + date;
        } else if (month.equals("June")) {
            day = 151 + date;
        } else if (month.equals("July")) {
            day = 181 + date;
        } else if (month.equals("August")) {
            day = 212 + date;
        } else if (month.equals("September")) {
            day = 243 + date;
        } else if (month.equals("October")) {
            day = 273 + date;
        } else if (month.equals("November")) {
            day = 304 + date;
        } else if (month.equals("December")) {
            day = 335 + date;
        }
    }
}
