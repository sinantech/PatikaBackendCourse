public class SafeHouse extends NormalLocation {
    public SafeHouse(Player newPlayer) {
        super(newPlayer, "Safe House");
    }
    public boolean onLocation() {
        // True return because in normal location we cannot die in game
        System.out.println("You are in safe house and  your health refreshed !");
        this.getNewPlayer().setPlayerHealth(this.getNewPlayer().getDefaultPlayerHealth());
        return true;
    }
}
