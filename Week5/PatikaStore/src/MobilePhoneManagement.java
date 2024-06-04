import java.util.ArrayList;
import java.util.List;

public class MobilePhoneManagement implements ProductManagement {
    private List<MobilePhone> mobilePhones;

    public MobilePhoneManagement() {
        this.mobilePhones = new ArrayList<>();
        this.mobilePhones.add(new MobilePhone(5500, 0, 355, "Samsung A72", new Brand("Samsung"), 128, 6.5, 4000, 6, 32, "Black"));
        this.mobilePhones.add(new MobilePhone(7500, 0, 355, "IPhone 15", new Brand("Apple"), 256, 6.4, 2500, 8, 50, "Blue"));
        this.mobilePhones.add(new MobilePhone(9500, 0, 355, "Huawei Mate 14", new Brand("Samsung"), 512, 5.0, 5000, 8, 64, "Red"));
    }
    @Override
    public void listAll() {
        System.out.println("\nMobile Phone List\n");
        String leftAlignFormat = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s | %-5d | %-8s |%n";
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.format("| ID | Product Name                 | Price       | Brand     | Storage   | Camera    | Screen     | Battery       | RAM   | Colour     |%n");
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
        for (MobilePhone mobilephone : this.mobilePhones) {
            System.out.format(leftAlignFormat, mobilephone.getId(), mobilephone.getName(), mobilephone.getPrice() + " " + "Usd" +
                    mobilephone.getBrand(), mobilephone.getBrand().getName(), mobilephone.getStorage(), mobilephone.getCamera(), mobilephone.getScreenSize(), mobilephone.getBattery(), mobilephone.getRam(), mobilephone.getColor());
        }
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
    }
    @Override
    public boolean delete(int id) {
        return this.mobilePhones.removeIf(mobilePhone -> mobilePhone.getId() == id);
    }
    @Override
    public boolean add(Product product) {
        return this.mobilePhones.add((MobilePhone) product);
    }
    @Override
    public void listByBrand(String brandName) {
        System.out.println("\nMobile Phone List\n");
        String leftAlignFormat = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-9s | %-9s | %-5d | %-8s |%n";
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.format("| ID | Product Name                 | Price       | Brand     | Storage   | Camera    | Screen     | Battery       | RAM   | Colour     |%n");
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
        for (MobilePhone mobilephone : this.mobilePhones) {
            System.out.format(leftAlignFormat, mobilephone.getId(), mobilephone.getName(), mobilephone.getPrice() + " " + "Usd" +
                    mobilephone.getBrand(), mobilephone.getBrand().getName(), mobilephone.getStorage(), mobilephone.getCamera(), mobilephone.getScreenSize(), mobilephone.getBattery(), mobilephone.getRam(), mobilephone.getColor());
        }
        System.out.format("--------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.println();
    }

}
