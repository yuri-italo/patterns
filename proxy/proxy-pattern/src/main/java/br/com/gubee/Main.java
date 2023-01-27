package br.com.gubee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new LazyProductListProxy();

        List<String> products = productList.getProducts();
        System.out.println(products);

        System.out.println("Getting the products again");
        List<String> products2 = productList.getProducts();
        System.out.println(products2);
    }
}
