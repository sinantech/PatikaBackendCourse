public class Weapon {
    private String weaponName;
    private int weaponID;
    private int weaponDamage;
    private int weaponPrice;

    public Weapon(String name, int ID, int damage, int price) {
        this.weaponName = name;
        this.weaponID = ID;
        this.weaponDamage = damage;
        this.weaponPrice = price;

    }
    // Created an array to list the weapons by constructor
    public static Weapon[] weapons() {
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon("Dagger", 1, 2, 15);
        weaponList[1] = new Weapon("Sword", 2, 3, 35);
        weaponList[2] = new Weapon("Scythe", 3, 7, 45);
        return weaponList;
    }
    // Method below provides when we select the weapon by id add weapon to inventory
    public static Weapon getWeaponObjectByID(int ID) {
        for (Weapon weaponID : Weapon.weapons()) {
            if (weaponID.getWeaponID() == ID) {
                return weaponID;
            }
        }
        return null;
    }

    public int getWeaponID() {
        return weaponID;
    }

    public void setWeaponID(int weaponID) {
        this.weaponID = weaponID;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getWeaponPrice() {
        return weaponPrice;
    }

    public void setWeaponPrice(int weaponPrice) {
        this.weaponPrice = weaponPrice;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
