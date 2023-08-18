public class Main {
    public static void main(String[] args) {
        int bill = 200;
        int replenishment = 1500;

        int bonusRub;

        boolean sum = replenishment > 1000;


        if (sum);
        {

            bonusRub = replenishment / 100 * 1;

        } else {

            bonusRub = 0;
        }


        int finalBill =  bill + replenishment + bonusRub;

        System.out.println(finalBill);


    }

}
