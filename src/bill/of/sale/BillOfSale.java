/*
 * William Zwart
 * 18/9/18
 * This will display info on the transaction.
 */
package bill.of.sale;

/**
 *
 * @author wizwa9381
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double purchase_price = 12.49;
        double amount_paid = 20.0;
        double final_price;
        double change_given;
        double tax = purchase_price * 0.13;
        final_price = purchase_price * 113 / 100;
        change_given = amount_paid - final_price;
        System.out.println("The amount paid was $" + final_price);
        System.out.println("The amount given was $" + amount_paid);
        System.out.println("The amount of change given was $" + change_given);
        System.out.println("The tax was $" + tax);
        // TODO code application logic here
    }
    
}
