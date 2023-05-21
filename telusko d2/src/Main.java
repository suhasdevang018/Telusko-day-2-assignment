import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        ProductServices service = new ProductServices();
        service.addProduct(new Product("redmi","mobile","Black table",2020));
        service.addProduct(new Product("lenovo","laptop","drawer",2020));
        service.addProduct(new Product("syska","trimmer","table",2020));
        service.addProduct(new Product("b type","Black cable","table",2024));

//        List<Product> stores = service.product_list();
//
//        for (Product i: stores) {
//            System.out.println(i);
//        }
//        System.out.println("##################################################");
//        Product prod = service.getproduct("lenovo");
//        System.out.println(prod);

//        System.out.println("##################################################");

//        List<Product> exp = service.warrenty_expired();
//        for(Product i: exp)
//        {
//            System.out.println(i);
//        }
//        System.out.println("##################################################");

//        List<Product> prod = service.getbyplace("table");
//        for(Product i: prod)
//        {
//            System.out.println(i);
//        }
//        System.out.println("##################################################");
//
//
//        Assignment no 3
//        Stream<Product> prod = service.getblackprod("Black").stream();
//        prod.forEach(p-> System.out.println(p));
//        System.out.println("##################################################");
    }
}
