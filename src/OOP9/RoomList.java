package OOP9;

import java.awt.BorderLayout;
import java.util.*;

public class RoomList {

    ArrayList<Room> list;
    Scanner scanner = new Scanner(System.in);

    public RoomList() {
        this.list = new ArrayList<>();
    }

    public RoomList(ArrayList<Room> list) {
        this.list = list;
    }

    public void addRoom(Room room) {
        list.add(room);
    }

    public void updateRoom() {
        System.out.println("Danh Sach Phong");
        System.out.println("Enter number of room");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Room Number :  " + (i + 1));
            System.out.println("type Room  1 Meeting Room / 2 Bed Room");
            int type = scanner.nextInt();

            if (type == 1) {
                MeetingRoom mr = new MeetingRoom();
                mr.inForRoom();
                addRoom(mr);

            } else if (type == 2) {
                BedRoom br = new BedRoom();
                br.inForRoom();
                addRoom(br);
            } else {
                System.out.println("not find room");
            }
        }
    }

    public Room findRoomById(String id) {
        for (Room room : list) {
            if (room.getId().equals(id)) {
                return room;
            }
        }
        return null;
    }
public boolean updateRoomById(String id) {
        Room s = findRoomById(id);
        if (s != null) {
            System.out.println("Update information Room : ");
            s.inForRoom();
            return true;
        }
        return false;
    }
    public void displayAllRooms() {
        System.out.println("list Room!");
        for (Room room : list) {
            System.out.println("");
            room.displayDetails();
        }
    }

    public boolean deleteRoomById(String id) {
        Room s = findRoomById(id);
        if (s != null) {
            list.remove(s);
            return true;
        }
        return false;
    }

    public void countRoomTypes() {
        int meetingRoom = 0;
        int bedRoom = 0;

        for (Room room : list) {
            if (room instanceof MeetingRoom) {
                meetingRoom++;
            } else if (room instanceof BedRoom) {
                bedRoom++;
            }
        }
        System.out.println("Total Meeting Rooms: " + meetingRoom);
        System.out.println("Total Bedrooms: " + bedRoom);
    }

    public Room findMostExpensiveRoom() {
//        if (list == null || list.isEmpty()) {
//            return null;
//        }
        Room mostExpensiveRoom = list.get(0);
        for (Room room : list) {
            if (Double.compare(room.calculateCost(), mostExpensiveRoom.calculateCost()) > 0) {
                mostExpensiveRoom = room;
            }

        }
        return null;

    }

}
