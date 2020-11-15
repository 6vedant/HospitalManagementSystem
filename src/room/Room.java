package room;

public class Room {

    // primitive data types for Room class
    int roomId;
    String roomName;

    //default constructor
    public Room() {
    }

    //parameterized constructor
    public Room(int roomId) {
        this.roomId = roomId;
    }

    // getter setter for the Room class
    public int getRoomId() {
        return roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

}
