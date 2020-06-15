/**
 * @author Julia Schleien
 * @version 1.0
 * @category Model
 * @since 05/06/2020 - 15:17
 */
public class Supermarket {

    private String products;
    private String session;
    private double value;
    private int quantity;
    private String weight;

    public Supermarket() {
    }

    /**
     * @param products receives the product name by default
     * @param session  receives the product session by default
     * @param value    receives the product value by default
     * @param quantity receives the product quantity by default
     * @param weight   receives the product weight by default
     */
    public Supermarket(String products, String session, double value, int quantity, String weight) {
        this.products = products;
        this.session = session;
        this.value = value;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value = (value > 0) ? value : 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * @return product value with 10% increase. value*1.10
     */
    public double addTenPercentToTheValue() {
        return this.value * 1.10;
    }

    @Override
    public String toString() {
        return "\nProdutos: " + products
                + "\nSessão: " + session
                + "\nValor: " + value
                + "\nQuantidade: " + quantity
                + "\nPeso: " + weight
                + "\nValor com acréscimo de 10%: " + addTenPercentToTheValue();
    }
}
