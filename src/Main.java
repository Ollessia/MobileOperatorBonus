public class Main {
    public static void main(String[] args) {
        int bill = 200;
        int replenishment = 1500;

        int bonusRub;

        boolean b = replenishment > 1000;


        if (b); else bonusRub = 0;
        {

            bonusRub = replenishment / 100 * 1;

        }


        int finalBill =  bill + replenishment + bonusRub;

        System.out.println(finalBill);


    }

}
