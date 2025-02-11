package util;

public class Executive extends Manager {
    private double bonus;
    private double shares;

    public Executive(String name, double salary, double bonus, double shares) {
        super(name, salary, bonus);
        this.bonus = bonus;
    }

    public double getShares() {
        return shares;
    }

    public void setShares(double newShares) {
        this.shares = newShares;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double newBonus) {
        this.bonus = newBonus;
    }

    public double getAnnualIncome() {
        return getSalary() + getBonus();
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Shares = $%,.2f%n", shares);
    }
}