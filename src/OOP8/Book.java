package OOP8;

import java.util.*;

abstract class Book implements IBook {

    private String id;
    private String title;
    private double basePrice;

    Book() {

    }

    Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();

    public void Information() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter id");
        this.id = scanner.nextLine();
        
        System.out.println("enter Title ");
        this.title = scanner.nextLine();
        
        System.out.println("enter basePrice");
        this.basePrice = scanner.nextDouble();
                
    }

    @Override
    public void displayDetails() {
        System.out.println("ID" + id);
        System.out.println("Title" + title);
        System.out.println("BasePrice" + basePrice);
    }

}
