import cats.Cat;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(115, 7, 17);
        Cat cat = new Cat("Tilon", date, 6.9, "Minia");
        cat.setName("Pieszczoch");

        System.out.println(cat.introduceYourself());
    }

}
