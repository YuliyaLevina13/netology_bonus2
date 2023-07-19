public class Main {
    public static void main(String[] args) {
        int customerAccount = 50;
        int bonusAccrued  = 100;
        int replenishment = 1050;
        int bonus;

        if (bonusAccrued >= 100){
            bonus = replenishment / bonusAccrued;
        } else {
            bonus = 0;
        }

        int totalAccount = customerAccount + replenishment + bonus;

        System.out.println("Вы пополнили счёт на " + replenishment + " руб.");
        System.out.println("Ваш бонус составил " + bonus + " руб.");
        System.out.println("Ваш баланс " + totalAccount + " руб.");
    }
}
