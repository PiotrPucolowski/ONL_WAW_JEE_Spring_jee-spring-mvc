package pl.coderslab.session;

public class CartItem {
    private Integer quantity;
    private Product product;

    public CartItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public double itemAmount(){
        return quantity * product.getPrice();
    }

}
