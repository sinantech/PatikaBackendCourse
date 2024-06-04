public class Inventory {
    private Weapon Weapon;
    private Armor armor;
    public Inventory () {
         this.Weapon = new Weapon("Fist",-1,0,0);
         this.armor = new Armor(-1,"Cloth",0,0);
    }

    public Weapon getWeapon() {
        return Weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.Weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}


