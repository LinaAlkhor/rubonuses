
public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int added = 400;
        int bonus = 0;
        if (added > 1000) {
            bonus = added / 100;
            ;
        }
        int finalBalance = balance + added + bonus;
        System.out.println("Итог " + finalBalance);
        System.out.println("Бонус " + bonus);
    }
}