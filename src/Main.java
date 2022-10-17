public class Main {
    public static void main(String[] args) {
        int initialAccount =100;
        int depositAmount =1100;
        int bonus;

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        }
        else {
            bonus = 0;
        }

        int balance = initialAccount + depositAmount + bonus;
        System.out.println("Вы пополнили счёт на: " + depositAmount + " руб.");
        System.out.println("Ваш бонус составил: " + bonus + " руб.");
        System.out.println("Ваш баланс: " + balance + " руб.");
    }
}