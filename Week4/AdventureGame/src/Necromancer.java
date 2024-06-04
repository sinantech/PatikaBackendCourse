public class Necromancer extends GameCharacter {
    public Necromancer() {
        super(1,"Necromancer",5, 21, 15,0,0,0);
        // Super keyword provides using the constructor parameters from the ancestral class GameCharacter
        // We use these parameters at Player class with getter and setter methods
        // We are calling methods separately for each subclass like Necromancer,Sorcerer,Barbarian etc...
    }
}
