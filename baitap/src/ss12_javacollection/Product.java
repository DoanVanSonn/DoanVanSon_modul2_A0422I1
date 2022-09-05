package ss12_javacollection;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private String idProduct;
    private String nameProduct;
    private Double priceProduct;

    public Product(String idProduct) {
        this.idProduct = idProduct;
    }

    public Product(String idProduct, String nameProduct, Double priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(getIdProduct(), product.getIdProduct()) && Objects.equals(getNameProduct(), product.getNameProduct()) && Objects.equals(getPriceProduct(), product.getPriceProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdProduct(), getNameProduct(), getPriceProduct());
    }

    @Override
    public int compareTo(Product o) {
        return idProduct.compareTo(o.idProduct);
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}