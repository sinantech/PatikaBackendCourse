public abstract class GameCharacter {
    private int id;
    private String charName;
    private int charDamage;
    private int charHealth;
    private int charGold;
    private int charFood;
    private int charWater;
    private int charWood;

    public GameCharacter(int id, String name, int damage, int health, int gold, int food, int water, int wood) {
        this.id = id;
        this.charName = name;
        this.charDamage = damage;
        this.charHealth = health;
        this.charGold = gold;
        this.charFood = food;
        this.charWater = water;
        this.charWood = wood;

    }

    public int getCharDamage() {
        return charDamage;
    }

    public void setCharDamage(int charDamage) {
        this.charDamage = charDamage;
    }

    public int getCharHealth() {
        return charHealth;
    }

    public void setCharHealth(int charHealth) {
        this.charHealth = charHealth;
    }

    public int getCharGold() {
        return charGold;
    }

    public void setCharGold(int charGold) {
        this.charGold = charGold;
    }

    public int getCharFood() {
        return charFood;
    }

    public void setCharFood(int charFood) {
        this.charFood = charFood;
    }

    public int getCharWater() {
        return charWater;
    }

    public void setCharWater(int charWater) {
        this.charWater = charWater;
    }

    public int getCharWood() {
        return charWood;
    }

    public void setCharWood(int charWood) {
        this.charWood = charWood;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
