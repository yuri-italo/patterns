package br.com.gubee;

import java.util.ArrayList;
import java.util.List;

public class RealProductList implements ProductList {
    private List<String> products;

    public RealProductList() {
        products = new ArrayList<>();
        loadProducts();
    }

    private void loadProducts() {
        System.out.println("Loading...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        products.add("Product 1");
        products.add("Product 2");
        products.add("Product 3");
        products.add("Product 4");

        System.out.println("Products were loaded.");
    }

    @Override
    public List<String> getProducts() {
        return products;
    }
}