public class App {

    public static void main(String[] args) {
        Webshop shop = new Webshop();

        shop.addProduct(new Product("p10 lite", "huawei", 100.0, 5));
        shop.addProduct(new Product("p20 lite", "huawei", 150.0, 4));
        shop.addProduct(new Product("p30 lite", "huawei", 200.0, 3));
        shop.addProduct(new Product("Galaxy A10", "samsung", 140.0, 7));
        shop.addProduct(new Product("Galaxy A10", "samsung", 180.0, 7));
        shop.addProduct(new Product("Galaxy S7", "samsung", 400.0, 6));
        shop.addProduct(new Product("Galaxy S8", "samsung", 500.0, 8));
        shop.addProduct(new Product("Galaxy S9", "samsung", 600.0, 9));
        shop.addProduct(new Product("iphone 6", "apple", 300.0, 6));
        shop.addProduct(new Product("iphone 7", "apple", 350.0, 7));
        shop.addProduct(new Product("iphone 7 Plus", "apple", 400.0, 8));
        shop.addProduct(new Product("iphone 11", "apple", 699.0, 9));
        shop.addProduct(new Product("iphone XS", "apple", 849.0, 8));
        shop.addProduct(new Product("iphone 11 Pro Max", "apple", 1149.0, 10));
        shop.addProduct(new Product("5T", "onePlus", 349.0, 7));
        shop.addProduct(new Product("6", "onePlus", 449.0, 8));
        shop.addProduct(new Product("7", "onePlus", 549.0, 9));
        shop.addProduct(new Product("8 pro", "onePlus", 949.0, 10));


        System.out.println(shop.getProductListByNameAtoZ());
        //System.out.println(shop.getProductListByNameZtoA());
        //System.out.println(shop.getProductListByBrandAtoZ());
        //System.out.println(shop.getProductListByBrandZtoA());
                
        //System.out.println(shop.getProductListByPriceAscending());
        //System.out.println();
        //System.out.println(shop.getProductListByPriceDescending());
        //System.out.println(shop.getProductListByRatingAscending());
        //System.out.println();
        //System.out.println(shop.getProductListByRatingDescending());

    }

}
