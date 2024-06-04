import java.util.Scanner;

public abstract class Location {
    private Player newPlayer;
    private String locationName;
    public static Scanner select = new Scanner(System.in);

    public Location(Player newPlayer, String name) {
        this.newPlayer = newPlayer;
        this.locationName = name;

    }

    public abstract boolean onLocation();

    public Player getNewPlayer() {
        return newPlayer;
    }

    public void setNewPlayer(Player newPlayer) {
        this.newPlayer = newPlayer;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
