package OOP9;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        RoomList rl = new RoomList();
        System.out.println("-----MENU-----");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Them Room new(meeting room of bedroom) !");
            System.out.println("2.Update Room by id !");
            System.out.println("3.Delete Room by id");
            System.out.println("4.Find Room by id");
            System.out.println("5.Display all Rooms");
            System.out.println("6.Find the most expensive Room");
            System.out.println("7.Count the total number of meeting room and bedroom separately in the  RoomList. !");
            System.out.println("8.Exit.... !");
            System.out.print("Choise Function : ");
            int ft = scanner.nextInt();
            scanner.nextLine();

            switch (ft) {
                case 1:
                    rl.updateRoom();
                    break;
                case 2:
                    System.out.println("enter room id update: ");
                    String id = scanner.nextLine();
                    if (rl.updateRoomById(id)) {
                        System.out.println("Room update sucessfully");
                    } else {
                        System.out.println("Room not fuond");
                    }
                    break;
                case 3:
                    System.out.println("enter id room delete");
                    String id1 = scanner.nextLine();
                    if(rl.deleteRoomById(id1)){
                        System.out.println("room delate sucessfully");
                       
                    }else{
                        System.out.println("Room not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter id rooom to find : ");
                    String findID= scanner.nextLine();
                    Room found = rl.findRoomById(findID);
                    if(found != null){
                        rl.displayAllRooms();
                    }else{
                        System.out.println("not find room !");
                    }
                    break;
                case 5:
                    rl.displayAllRooms();
                    break;
                case 6:
                case 7:
                    rl.countRoomTypes();
                    break;
                case 8:
                    System.out.println("Exit");
                    scanner.close();
                    default:
                        System.out.println("vui long nhap lai");
                                
            }
            

        }

    }

}
