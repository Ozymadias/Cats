import cats.Cat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Interface2 {
//
//    static Scanner scanner = new Scanner(System.in);
//    public static String getUserInput(){
//        if(scanner.hasNextLine()){
//            return scanner.nextLine();
//        }
//        else{
//            return "";
//        }
//    }
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        System.out.println("What cat's name is?");
//        String name = getUserInput();
//        System.out.println("What cat's owner name is?");
//        String ownerName = getUserInput();
//        cat.setName(name);
//        cat.setOwnerName(ownerName);
//        System.out.println(cat.presentYourself2());
//
//        System.out.println("What cat's weight is?");
//        double weight = 0.0;
//        do {
//            String weightAsString = getUserInput();
//            if (Pattern.matches([0..9],weightAsString))
//        }while (weight == 0.0);
//        cat.setWeight(weight);
//        System.out.println(cat.presentYourself3());
//
//        System.out.println("What cat's date of birth is?");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
//        Date date = null;
//        do {
//            String dateAsString = getUserInput();
//            try {
//                date = sdf.parse(dateAsString);
//            }catch (ParseException pe){
//                System.out.println("Coś jest nie tak z formatem daty!");
//                date = null;
//            }
//        }while (date != null);
//        cat.setDate(date);
//        System.out.println(cat.introduceYourself());
}
