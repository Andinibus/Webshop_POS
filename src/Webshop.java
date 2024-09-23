import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Webshop {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public String getProductListByPriceAscending() {
        Comparator<Product> priceAscendingComp = Comparator.comparingDouble(Product::getPrice);
        Collections.sort(products, priceAscendingComp);
        return getProductListString(products);
    }

    public String getProductListByPriceDescending() {
        Comparator<Product> priceDescendingComp = (o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice());
        Collections.sort(products, priceDescendingComp);
        return getProductListString(products);
    }

    public String getProductListByRatingAscending() {
        Comparator<Product> ratingAscendingComp = Comparator.comparingDouble(Product::getRating);
        Collections.sort(products, ratingAscendingComp);
        return getProductListString(products);
    }

    public String getProductListByRatingDescending() {
        Comparator<Product> ratingDescendingComp = (o1, o2) -> Double.compare(o2.getRating(), o1.getRating());
        Collections.sort(products, ratingDescendingComp);
        return getProductListString(products);
    }

    public String getProductListByNameAtoZ() {
        Comparator<Product> nameAscendingComp = (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName());
        Collections.sort(products, nameAscendingComp);
        return getProductListString(products);
    }

    public String getProductListByNameZtoA() {
        Comparator<Product> nameDescendingComp = (o1, o2) -> o2.getName().compareToIgnoreCase(o1.getName());
        Collections.sort(products, nameDescendingComp);
        return getProductListString(products);
    }

    public String getProductListByBrandAtoZ() {
        Comparator<Product> brandAscendingComp = (o1, o2) -> o1.getBrand().compareToIgnoreCase(o2.getBrand());
        Collections.sort(products, brandAscendingComp);
        return getProductListString(products);
    }

    public String getProductListByBrandZtoA() {
        Comparator<Product> brandDescendingComp = (o1, o2) -> o2.getBrand().compareToIgnoreCase(o1.getBrand());
        Collections.sort(products, brandDescendingComp);
        return getProductListString(products);
    }

    public String getProductListByNamePriceAtoZ() {
        List<Product> sortedList = new ArrayList<>(products);
        Collections.sort(sortedList, new ProductNamePriceComparator());
        return getProductListString(sortedList);
    }

    public String getProductListString(List<Product> products) {
        StringBuilder prodListString = new StringBuilder();
        for (Product p : products) {
            prodListString.append(p.toString()).append("\n");
        }
        return prodListString.toString();
    }
}
