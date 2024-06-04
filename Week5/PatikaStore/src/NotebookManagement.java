import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NotebookManagement implements ProductManagement {
    private List<Notebook> notebooks;

    public NotebookManagement() {
        this.notebooks = new ArrayList<>();
        notebooks.add(new Notebook(17500, 0, 2455, "Monster", new Brand("Monster"), 16, 2048, 15.4));
        notebooks.add(new Notebook(11500, 0, 1400, "Lenovo", new Brand("Lenovo"), 8, 512, 14));
        notebooks.add(new Notebook(8500, 0, 750, "Asus", new Brand("Asus"), 32, 1024, 17));
    }
    @Override
    public void listAll() {
        System.out.println("\nNotebook List\n");
        String leftAlignFormat = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-5d |%n";
        System.out.format("---------------------------------------------------------------------------------------------%n");
        System.out.format("| ID | Product Name                  | Price       | Brand     | Storage   | Screen     | RAM   |%n");
        System.out.format("---------------------------------------------------------------------------------------------%n");
        for (Notebook notebook : this.notebooks) {
            System.out.format(leftAlignFormat, notebook.getId(), notebook.getName(), notebook.getPrice() + " " + "Usd" +
                    notebook.getBrand().getName(), notebook.getStorage(), notebook.getScreenSize(), notebook.getRam());
        }
        System.out.format("---------------------------------------------------------------------------------------------%n");
    }
    @Override
    public boolean delete(int id) {
        return this.notebooks.removeIf(notebook -> notebook.getId() == id);
    }
    @Override
    public boolean add(Product product) {
        return this.notebooks.add((Notebook) product);
    }
    @Override
    public void listByBrand(String brandName) {
        System.out.println("\nNotebook List\n");
        String leftAlignFormat = "| %-2d | %-25s | %-11s | %-9s | %-10d | %-9s | %-5d |%n";
        System.out.format("---------------------------------------------------------------------------------------------%n");
        System.out.format("| ID | Product Name                  | Price       | Brand     | Storage   | Screen     | RAM   |%n");
        System.out.format("---------------------------------------------------------------------------------------------%n");
        List<Notebook> filtered = notebooks.stream().filter(notebook -> notebook.getBrand().getName().equalsIgnoreCase(brandName)).collect(Collectors.toList());
        for (Notebook notebook : filtered) {
            System.out.format(leftAlignFormat, notebook.getId(), notebook.getName(), notebook.getPrice() + " " + "Usd" +
                    notebook.getBrand().getName(), notebook.getStorage(), notebook.getScreenSize(), notebook.getRam());
        }
        System.out.format("---------------------------------------------------------------------------------------------%n");
        System.out.println();
    }

}
