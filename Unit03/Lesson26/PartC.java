/*
 * Juan
 * 2/2/25
 * What is the output of the following code and why?
 * 
 * public static void main(String[] args) {
 * Customer.lastSerialUsed = 100;
 * Customer c1 = new Customer("Sal's Deli");
 * c1.addSale(100);
 * Customer c2 = c1;
 * c2.addSale(50);
 * System.out.println(c1.getSales());
 * System.out.println(c2.getSales());
 * }
 * 
 * Use the Customer class that we developed in class for this problem.
 */

class Customer {
    private double total;
    private int count;
    private String name;
    private int region;
    private int serial;

    public static int last_serial_used = 0;

    public Customer(String new_name, int new_region) {
        name = new_name;
        region = new_region;
        total = 0;
        count = 0;

        last_serial_used++;
        serial = last_serial_used;
    }

    public Customer(String new_name) {
        this(new_name, 1);
        // name = new_name;
        // region = 1;
        // total = 0;
        // count = 0;

        // last_serial_used++;
        // serial = last_serial_used;
    }

    public static double getTaxRate(int region) {
        if (region == 1) {
            return 0;
        } else if (region == 2) {
            return 0.0550;
        } else if (region == 3) {
            return 0.0600;
        } else if (region == 4) {
            return 0.0650;
        } else {
            return 0;
        }
    }

    public void addSalesAmount(double amount) {
        this.total = this.total + amount;
        this.count = this.count + 1;
    }

    public double getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public void clear() {
        this.total = 0;
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(int new_region) {
        region = new_region;
    }

    public int getRegion() {
        return region;
    }
}

public class PartC {

    public static void main(String[] args) {
        Customer.last_serial_used = 100;
        Customer c1 = new Customer("Sal's Deli");
        c1.addSalesAmount(100);
        Customer c2 = c1;
        c2.addSalesAmount(50);
        System.out.println(c1.getTotal());
        System.out.println(c2.getTotal());

    }
}

/*
 * The output would be:
 * 150.0
 * 150.0
 * this happens because you add 100 to c1 but then set c2 equal to c1. then you
 * add 50 to c2 so it is equal to 150
 */