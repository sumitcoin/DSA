package array;

import bean.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {
        //Creating a product list
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(101, "Laptop", 55000.00));
        productList.add(new Product(102, "SmartPhone", 15000.00));
        productList.add(new Product(103, "Tablet", 25000.00));
        productList.add(new Product(103, "Keyboard", 2000.00));

        //List to map with Replacement
        Map<Integer, Product> mapProduct = productList.stream().collect(Collectors.toMap(Product::getId, Function.identity(), (existing, replacement) -> replacement));
        System.out.println("Print Map Products without duplicate records (Replacement)  ::"+mapProduct);

        //List to map with Existing
        Map<Integer, Product> mapProductExisting = productList.stream().collect(Collectors.toMap(Product::getId, Function.identity(), (existing, replacement) -> existing));
        System.out.println("Print Map Products without duplicate records (Existing)  ::"+mapProductExisting);
    }
}
