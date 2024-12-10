
package OOP9;
import java.util.*;

public abstract class Room implements IRoom {
    private String id;
    private String name;
    private double baseCost;
    
    public Room(){}
    public Room(String id, String name, double baseCost){
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    
    

    @Override
    public abstract double calculateCost();
        
    @Override
    public void displayDetails() {
        System.out.println("Id Room: " + id);
        System.out.println("Name Room :  " + name);
        System.out.println("BaseCost Room: " + baseCost);
    }
    
    public void inForRoom(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID");
        this.id = scanner.nextLine();
        System.out.println("Enter Name");
        this.name =  scanner.nextLine();
        System.out.println("Enter baseCost");
        this.baseCost = scanner.nextDouble();
    }
 

}
