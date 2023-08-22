public class Main {
    public static void main(String[] args) {
        int bill = 200;
        int replenishment = 1500;

        int bonusRub = 0;


        if (replenishment > 1000) {
            bonusRub = replenishment / 100;

        }

        int finalBill = bill + replenishment + bonusRub;

        System.out.println("Итоговый счет: " + finalBill);
        System.out.println("Бонусные рубли: " + bonusRub);


    }

}
