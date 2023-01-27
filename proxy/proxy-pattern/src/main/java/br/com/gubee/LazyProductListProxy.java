package br.com.gubee;

import java.util.List;

public class LazyProductListProxy implements ProductList{
    private ProductList productList;

    @Override
    public List<String> getProducts() {
        if (productList == null)
            productList = new RealProductList();

        return productList.getProducts();
    }
}
