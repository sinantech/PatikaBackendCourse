public abstract class NormalLocation extends Location {

    public NormalLocation (Player newPlayer, String name) {
        super(newPlayer, name);
    }

    @Override
    public boolean onLocation() {
        // True return because in normal location we cannot die in game
        return true;
    }
}
