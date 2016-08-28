import cats.Cat;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interface2 {

    static Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        Cat cat = getCat();

        Double weight = getWeight();
        cat.setWeight(weight);

        Date date = getDate();
        cat.setDate(date);

        System.out.println(cat);
    }

    private static Date getDate() {
        Pattern pattern;
        System.out.println("What cat's date of birth is?");
        String dateAsString;
        String datePattern = "\\d{4}\\.((0[1-9])|(1[0-2]))\\.(([012]\\d)|(3[01]))";
        pattern = Pattern.compile(datePattern);
        dateAsString = doUntilCorrect(pattern);
        return parseDate(dateAsString);
    }

    private static String doUntilCorrect(Pattern pattern) {
        String dateAsString;
        Matcher matcher;
        do {
            dateAsString = getUserInput();
            matcher = pattern.matcher(dateAsString);
            if (!matcher.matches()){
                System.out.println("That isn't right! try again");
            }
        } while (!matcher.matches());
        return dateAsString;
    }

    private static double getWeight() {
        System.out.println("What cat's weight is?");
        String weightAsString;
        String weightPattern = "[1-9](\\d?){2}([\\.][0-9]+)?";
        Pattern pattern = Pattern.compile(weightPattern);
        weightAsString = doUntilCorrect(pattern);
        return Double.parseDouble(weightAsString);
    }

    private static Date parseDate(String dateAsString) {
        String[] parts = dateAsString.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return new Date(year, month, day);
    }

    public static Cat getCat() {
        Cat cat = new Cat();
        System.out.println("What cat's name is?");
        String name = getUserInput();
        System.out.println("What cat's owner name is?");
        String ownerName = getUserInput();
        cat.setName(name);
        cat.setOwnerName(ownerName);
        return cat;
    }
}
