import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Webshop {

    List<Product> products = new ArrayList<Product>();

    public void addProduct(Product prod) {
        products.add(prod);
    }


    public String getProductListByPriceAscending() {
        Comparator<Product> priceAccendingComp = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        };

        Collections.sort(products, priceAccendingComp);

        return getProductListString(products);
    }


    public String getProductListByPriceDescending() {

        Comparator<Product> priceDecendingComp = (o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice());

        Collections.sort(products, priceDecendingComp);

        return getProductListString(products);

    }

    public String getProductListByRatingAscending() {

        Comparator<Product> ratingAccendingComp = (o1, o2) -> Double.compare(o1.getRating(), o2.getRating());

        Collections.sort(products, ratingAccendingComp);

        return getProductListString(products);

    }

    public String getProductListByRatingDescending() {
        Comparator<Product> ratingDecendingingComp = (o1, o2) -> Double.compare(o2.getRating(), o1.getRating());

        Collections.sort(products, ratingDecendingingComp);

        return getProductListString(products);
    }
    public String getProductListByNameAtoZ() {
        
        Comparator<Product> nameAccendingingComp = (o1, o2) -> CharSequence.compare(o1.getName(), o2.getName());

        Collections.sort(products, nameAccendingingComp);

        return getProductListString(products);
    }
    
    public String getProductListByNameZtoA() {return null;}

    public String getProductListByBrandAtoZ() {return null;}

    public String getProductListByBrandZtoA() {return null;}

    public String getProductListString(List<Product>products){

        String prodListString = " ";
        for (Product p : products){
            prodListString += p.toString()+ "\n";
        }

        return prodListString;

    }

}
