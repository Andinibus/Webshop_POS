

public class Product
{

    Product(String name,String brand, double price,double rating) {
        this(name,brand,price);
        this.rating = rating;

    }

    Product(String name, String brand, double price)
    {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.rating = 0;
        this.noRatings = 0;
    }
        
    final double minRating = 1;
        
    final double maxRating = 5;
        
    private String name;
        
    private double price;
        
    private double rating;
        
    private int noRatings;
        
    private String brand;
        
    public boolean rateProduct(double userRating)
    {
        if (userRating < minRating || userRating > maxRating)
            {
                return false;
            }
                
        rating = (rating*noRatings + userRating) / (noRatings+1);
        noRatings++;
        return true;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public String getBrand() 
    {
        return brand;
    }

    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public double getRating() 
    {
        return rating;
    }

    @Override
    public String toString() 
    {
        return brand + " " + name + " " + price + "€" + " Rating " + rating + " Stars"; 
    }
}

