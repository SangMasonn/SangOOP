
package OOP9;
public class MeetingRoom extends Room {
    private int capacity;
    
    public MeetingRoom(){
        
    }
    public MeetingRoom(String id, String name, double baseCost, int capacity){
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    

    @Override
    public double calculateCost() {
        if(capacity > 50){
            return this.getBaseCost()*1.2;
        }
        return getBaseCost();
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("capacity" + capacity);
    }
    
    
}