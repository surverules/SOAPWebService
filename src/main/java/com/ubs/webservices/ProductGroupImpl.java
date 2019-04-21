package com.ubs.webservices;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService( serviceName = "ProductGroupImpl", endpointInterface = "com.ubs.webservices.ProductGroups",
 portName = "ProductGroupPort")
public class ProductGroupImpl implements ProductGroups {

    @Override
    public List<Product> getProducts() {
        List<Product> productlist = new ArrayList<>();

        Product Food = new Product("Chocolate", "Sweet");
        Product Fruits = new Product("Apple", "Sweet");

        productlist.add(Food);
        productlist.add(Fruits);
        return productlist;
    }
}
