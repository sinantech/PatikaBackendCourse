import java.util.Scanner;

public class Player {
    private int playerDamage;
    private int playerHealth;
    private int defaultPlayerHealth;
    private int playerGold;
    private int playerFood;
    private int playerWater;
    private int playerWood;
    private String playerName;
    private String playerCharName;
    private Scanner select = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.playerName = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {

        GameCharacter[] characterList = {new Necromancer(), new Sorcerer(), new Barbarian()};
        System.out.println("Characters : ");
        System.out.println("-----------------------------------------------------------------------");
        for (GameCharacter gameCharacter : characterList) {
            System.out.println("ID : " + gameCharacter.getId() +
                    "\t GameCharacter :" + gameCharacter.getCharName() +
                    "\t Damage :" + gameCharacter.getCharDamage() +
                    "\t Health : " + gameCharacter.getCharHealth() +
                    "\t Food : " + gameCharacter.getCharFood() +
                    "\t Water : " + gameCharacter.getCharWater()+
                    "\t Wood : " + gameCharacter.getCharWood() +
                    "\t Gold :" + gameCharacter.getCharGold());

        }
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("Please select Character ID : ");
        int selectCharacter = select.nextInt();

        switch (selectCharacter) {
            case 1:
                assignPlayer(new Necromancer());
                break;
            case 2:
                assignPlayer(new Sorcerer());
                break;
            case 3:
                assignPlayer(new Barbarian());
                break;
            default:
                assignPlayer(new Necromancer());
        }
        System.out.println("Character : " + this.getPlayerCharName() +
                " " + "Damage : " + this.getPlayerDamage() +
                " " + "Health : " + this.getPlayerHealth() +
                " " + "Food : " + this.getPlayerFood() +
                " " + "Water : " + this.getPlayerWater() +
                " " + "Wood : " + this.getPlayerWood() +
                " " + "Gold : " + this.getPlayerGold());
    }

    // Method below assign location to new player
    // Below select location method provides location class acting polymorphism


    // Method below assign game characters to player from the gameCharacter array
    // Below GameCharacter ancestral class acting polymorphism

    public void assignPlayer(GameCharacter gameCharacter) {
        this.setPlayerDamage(gameCharacter.getCharDamage());
        this.setPlayerHealth(gameCharacter.getCharHealth());
        this.setDefaultPlayerHealth(gameCharacter.getCharHealth());
        this.setPlayerFood(gameCharacter.getCharFood());
        this.setPlayerWater(gameCharacter.getCharWater());
        this.setPlayerWood(gameCharacter.getCharWood());
        this.setPlayerGold(gameCharacter.getCharGold());
        this.setPlayerCharName(gameCharacter.getCharName());
    }

    public void printPlayerInfo() {
        System.out.println(
                "Weapon : " + this.getInventory().getWeapon().getWeaponName() +
                        " " + "Armor : " + this.getInventory().getArmor().getArmorName() +
                        " " + "Block : " + this.getInventory().getArmor().getArmorBlock() +
                        " " + "Damage : " + this.getTotalDamage() +
                        " " + "Health : " + this.getPlayerHealth() +
                        " " + "Food : " + this.getPlayerFood() +
                        " " + "Water : " + this.getPlayerWater() +
                        " " + "Wood : " + this.getPlayerWood() +
                        " " + "Gold : " + this.getPlayerGold());

    }

    public int getTotalDamage() {
        return playerDamage + this.getInventory().getWeapon().getWeaponDamage();
    }

    public int getPlayerDamage() {
        return playerDamage;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        if(playerHealth < 0) {
            playerHealth = 0;
        }
        this.playerHealth = playerHealth;
    }

    public int getPlayerGold() {
        return playerGold;
    }

    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerCharName() {
        return playerCharName;
    }

    public void setPlayerCharName(String playerCharName) {
        this.playerCharName = playerCharName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Weapon getWeapon() {
        return this.getInventory().getWeapon();
    }

    public int getDefaultPlayerHealth() {
        return defaultPlayerHealth;
    }

    public void setDefaultPlayerHealth(int defaultPlayerHealth) {
        this.defaultPlayerHealth = defaultPlayerHealth;
    }

    public int getPlayerFood() {
        return playerFood;
    }

    public void setPlayerFood(int playerFood) {
        this.playerFood = playerFood;
    }

    public int getPlayerWater() {
        return playerWater;
    }

    public void setPlayerWater(int playerWater) {
        this.playerWater = playerWater;
    }

    public int getPlayerWood() {
        return playerWood;
    }

    public void setPlayerWood(int playerWood) {
        this.playerWood = playerWood;
    }
}
