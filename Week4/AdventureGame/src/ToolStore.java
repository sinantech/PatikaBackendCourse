public class ToolStore extends NormalLocation {
    public ToolStore(Player newPlayer) {
        super(newPlayer, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome To Store !");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1-Buy Weapon");
            System.out.println("2-Buy Armor");
            System.out.println("3-Leave");
            System.out.print("What Do You Want To Do : ");
            // Scanner class assigned static that is why we use it like below
            // It is produced once, it is not produced every time we produce an object
            int selectItem = Location.select.nextInt();
            while (selectItem < 1 || selectItem > 3) {
                System.out.print("Incorrect Choice Try Again !");
                selectItem = select.nextInt();
            }
            switch (selectItem) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmors();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Come Again !");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("Weapons");
        System.out.println();
        for (Weapon weaponList : Weapon.weapons()) {
            System.out.println("ID - " + weaponList.getWeaponID() +
                    " Weapon : " + weaponList.getWeaponName() +
                    " Price : " + weaponList.getWeaponPrice() +
                    " Damage : " + weaponList.getWeaponDamage());
        }
        System.out.println("0-Leave");
    }

    public void buyWeapon() {
        System.out.print("Select Your Weapon : ");

        int selectWeaponID = select.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Incorrect Choice Try Again !");
            selectWeaponID = select.nextInt();
        }

        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjectByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getWeaponPrice() > this.getNewPlayer().getPlayerGold()) {
                    System.out.println("You have no enough gold !");
                } else {
                    //Weapon Purchasing Code Block
                    System.out.println(selectedWeapon.getWeaponName() + "Purchased !");
                    int gold = this.getNewPlayer().getPlayerGold() - selectedWeapon.getWeaponPrice();
                    this.getNewPlayer().setPlayerGold(gold);
                    System.out.println("Remaining Gold : " + this.getNewPlayer().getPlayerGold());
                    System.out.println("Old Weapon : " + this.getNewPlayer().getInventory().getWeapon().getWeaponName());
                    this.getNewPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("New Weapon : " + this.getNewPlayer().getInventory().getWeapon().getWeaponName());
                }
            }
        }
    }

    public void printArmors() {
        System.out.println("Armors");
        System.out.println();
        for (Armor armorList : Armor.armors()) {
            System.out.println("ID - " + armorList.getArmorID() +
                    " Armor : " + armorList.getArmorName() +
                    " Block : " + armorList.getArmorBlock() +
                    " Price : " + armorList.getArmorPrice());
        }
        System.out.println("0-Leave");
    }

    public void buyArmor() {
        System.out.print("Select Your Armor : ");

        int selectArmorID = select.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.print("Incorrect Choice Try Again !");
            selectArmorID = select.nextInt();
        }

        if (selectArmorID != 0 ) {
            Armor selectedArmor = Armor.getArmorObjectByID(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getArmorPrice() > this.getNewPlayer().getPlayerGold()) {
                    System.out.println("You have no enough gold !");
                } else {
                    //Armor Purchasing Code Block
                    System.out.println(selectedArmor.getArmorName() + "Purchased !");
                    int gold = this.getNewPlayer().getPlayerGold() - selectedArmor.getArmorPrice();
                    this.getNewPlayer().setPlayerGold(gold);
                    System.out.println("Remaining Gold : " + this.getNewPlayer().getPlayerGold());
                    System.out.println("Old Armor : " + this.getNewPlayer().getInventory().getArmor().getArmorName());
                    this.getNewPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("New Armor : " + this.getNewPlayer().getInventory().getArmor().getArmorName());
                }
            }
        }
    }
}
