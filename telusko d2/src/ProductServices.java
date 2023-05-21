import java.util.*;
import java.util.stream.*;

public class ProductServices {
    List<Product> products = new ArrayList<>();
    public void addProduct(Product p)
    {
        products.add(p);
    }
    public List<Product> product_list()
    {
        return products;
    }
    public Product getproduct(String name)
    {
        for (Product p : products) {
            if(p.getName().equals(name))
            {
                return p;
            }
        }
        return null;
    }

//    Assignment no 1 warrenty
    public List<Product> warrenty_expired()
    {
        List<Product> exp = new ArrayList<>();
        for (Product p : products) {
            if(p.getWarrenty()<2023)
            {
                exp.add(p);
            }
        }
        return exp;
    }
//    Assignment no 2 searching based on place
    public List<Product> getbyplace(String place)
    {
        List<Product> prod = new ArrayList<>();
        for (Product p : products) {
            if(p.getPlace().equals(place))
            {
                prod.add(p);
            }
        }
      return prod;
    }

    //searching black product
    public List<Product> getblackprod(String text)
    {
        List<Product> prod = new ArrayList<>();
        String str  = text.toLowerCase();
        for(Product p: products)
        {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str))
            {
                prod.add(p);
            }
        }
        return prod;
    }
}
