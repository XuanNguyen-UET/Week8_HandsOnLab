import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;
    private List<Coin> coins;

    public VendingMachine() {
        products = new ArrayList<>();
        coins = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCoin(Coin coin) {
        coins.add(coin);
    }

    // select a product by name
    public Product selectProduct(String productName) {
        for (Product product: products) {
            if (product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    // select coins and return total value inserted
    public double insertCoins(List<Coin> insertedCoins) {
        double total = 0;
        for (Coin coin: insertedCoins) {
            total += coin.getValue() * coin.getQuantity();
        }
        return total;
    }

    // Method to dispense a product based amount inserted
    public String dispenseProduct(Product product, double amountInserted) {
        if (product.getQuantity() > 0
        && amountInserted >= product.getPrice()) {
            product.setQuantity(product.getQuantity() -1);
            double change = amountInserted - product.getPrice();
            return "Dispensing " + product.getName() + ". Change" + change;
        } else if (product.getQuantity() == 0) {
            return "Sold Out!";
        } else {
            return "Not enough coins!" ;
        }
    }
}
