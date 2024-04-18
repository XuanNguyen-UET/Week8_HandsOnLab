public class Coin {
    private double value;
    private int quantity;

    public Coin(double value, int quantity) {
        this.quantity = quantity;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
