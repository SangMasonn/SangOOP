
package OOP8;
public class TextBook extends Book {
    private String subject;
    
    TextBook(){
        
    }
    TextBook(String id,String Title, double basePrice, String subject){
        super(id,Title,basePrice);
        this.subject = subject;
    }
    @Override
    public double calculatePrice(){
        double n= 0;
        n = getBasePrice()* 0.9;
        return n;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("subject" + subject);
        System.out.println("gia sach textbook" + calculatePrice());
    }

  
}
