public class Enemy {
    private int enemyID;
    private String enemyName;
    private int enemyDamage;
    private int enemyHealth;
    private int enemyGold;
    private int enemyFood;
    private int enemyWater;
    private int enemyWood;
    private int defaultEnemyHealth;

    public Enemy(int enemyID, String enemyName, int enemyDamage, int enemyHealth, int enemyFood, int enemyWater, int enemyWood, int enemyGold) {
        this.enemyID = enemyID;
        this.enemyDamage = enemyDamage;
        this.enemyHealth = enemyHealth;
        this.defaultEnemyHealth = enemyHealth;
        this.enemyName = enemyName;
        this.enemyGold = enemyGold;
        this.enemyFood = enemyFood;
        this.enemyWater = enemyWater;
        this.enemyWood = enemyWood;
    }

    public int getEnemyID() {
        return enemyID;
    }

    public void setEnemyID(int enemyID) {
        this.enemyID = enemyID;
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        if(enemyHealth < 0) {
            enemyHealth = 0;
        }
        this.enemyHealth = enemyHealth;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getEnemyFood() {
        return enemyFood;
    }

    public void setEnemyFood(int enemyFood) {
        this.enemyFood = enemyFood;
    }

    public int getEnemyWater() {
        return enemyWater;
    }

    public void setEnemyWater(int enemyWater) {
        this.enemyWater = enemyWater;
    }

    public int getEnemyWood() {
        return enemyWood;
    }

    public void setEnemyWood(int enemyWood) {
        this.enemyWood = enemyWood;
    }

    public int getEnemyGold() {
        return enemyGold;
    }

    public void setEnemyGold(int enemyGold) {
        this.enemyGold = enemyGold;
    }

    public int getDefaultEnemyHealth() {
        return defaultEnemyHealth;
    }

    public void setDefaultEnemyHealth(int defaultEnemyHealth) {
        this.defaultEnemyHealth = defaultEnemyHealth;
    }
}
