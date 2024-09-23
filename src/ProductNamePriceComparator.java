import java.util.Comparator;

public class ProductNamePriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {

        int nameComparison = p1.getName().compareToIgnoreCase(p2.getName());

        if (nameComparison == 0) {
            return Double.compare(p1.getPrice(), p2.getPrice());
        }

        return nameComparison;
    }
}

