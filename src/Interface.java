import cats.Cat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Interface {
    static Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        Cat cat = Interface2.getCat();

        double weight = getWeight();
        cat.setWeight(weight);

        Date date = getDate();
        cat.setDate(date);

        System.out.println(cat);
    }

    private static Date getDate() {
        System.out.println("What cat's date of birth is?");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date date;
        do {
            String dateAsString = getUserInput();
            try {
                date = sdf.parse(dateAsString);
            } catch (ParseException pe) {
                System.out.println("That is not a date!");
                date = null;
            }
        } while (date == null);
        return date;
    }

    private static double getWeight() {
        System.out.println("What cat's weight is?");
        double weight = 0.0;
        do {
            String weightAsString = getUserInput();
            try {
                weight = Double.parseDouble(weightAsString);
            } catch (NumberFormatException nfe) {
                System.out.println("Weight must be double!");
            }
        } while (weight == 0.0);
        return weight;
    }
}
