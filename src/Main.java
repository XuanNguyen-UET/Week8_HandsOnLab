import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Product("Soda", 1.50, 5));
        vendingMachine.addCoin(new Coin(1.0, 10));
        vendingMachine.addCoin(new Coin(0.5, 10));

        String productName = "Soda";
        Product product = vendingMachine.selectProduct(productName);
        if (product != null) {
            List<Coin> insertedCoins = new ArrayList<>();
            insertedCoins.add(new Coin(1.0, 2));
            insertedCoins.add(new Coin(0.5, 1));
            double totalInserted = vendingMachine.insertCoins(insertedCoins);
            System.out.println(vendingMachine.dispenseProduct(product, totalInserted));
        } else {
            System.out.println("Product not found.");
        }
    }
}