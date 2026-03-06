package BussinessLogic;

public class FeeStructure {
    private String component;
    private String type; // monthly, yearly, quarterly
    private double amount;

    public FeeStructure(String component, String type, double amount) {
        this.component = component;
        this.type = type;
        this.amount = amount;
    }

    public String getComponent() {
        return component;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
