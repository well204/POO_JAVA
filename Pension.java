package classes;

public class Pension {
    private String name;
    private String email;
    private int roomNumber;

    public Pension(String name, String email, int roomNumber) {
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String busyRooms = this.roomNumber + ": " + this.name + ", " + this.email;
        return busyRooms;
    }
}
