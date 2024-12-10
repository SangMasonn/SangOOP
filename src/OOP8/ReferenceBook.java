
package OOP8;

public class ReferenceBook extends Book {
    String publisher;
    ReferenceBook(){}
    ReferenceBook(String id, String Title, double basePrice, String publisher){
        this.publisher = publisher;
    }
    

    @Override
    public double calculatePrice() {
        double n= 0;
        n = getBasePrice()* 0.8;
        return n;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("publisher" + publisher);
        System.out.println("gia sach textbook" + calculatePrice());
    }
    
    
}
