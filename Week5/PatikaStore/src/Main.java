import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrandManagement bm = new BrandManagement();
        NotebookManagement notebookManagement = new NotebookManagement();
        MobilePhoneManagement mobilePhoneManagement = new MobilePhoneManagement();

        while (true) {
            System.out.println("Path Store System !");
            System.out.println("1-Notebook Operations\n2-Mobile Phone Operations\n3-Brand List\n0-Exit ");
            System.out.println("Make Your Choice : ");
            int choice;
            try {
                choice = scanner.nextInt();
                System.out.println();
            } catch (Exception e) {
                System.out.println("Please Enter A Number !");
                scanner.nextLine();
                continue;
            }

            if (choice == 0) {
                System.out.println("See You Later !");
                break;
            } else if (choice == 1) {
                while (true) {
                    System.out.println("Notebook Operations\n0-Back\n1-Add New Notebook\n2-Delete Notebook\n3-List By Brand\n4-List All Notebooks");
                    System.out.println("Make Your Choice");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice == 0) {
                        break;
                    } else if (choice == 1) {
                        System.out.println("\nEnter The Name You Want To Add :");
                        String name = scanner.nextLine();
                        System.out.println("Enter The Brand You Want To Add : ");
                        String brandName = scanner.nextLine();
                        System.out.println("Enter The Price You Want To Add : ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        Brand brand = bm.getBrand(brandName);

                        if (brand == null) {
                            brand = new Brand(brandName);
                            bm.add(brand);
                        }

                        if (notebookManagement.add(new Notebook(price, 0, 1, name, brand, -1, -1, -1))) ;
                        System.out.println("Product Added !");
                    } else if (choice == 2) {
                        System.out.println("\nEnter The ID You Want To Delete : ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        if (notebookManagement.delete(id)) {
                            System.out.println("Product Deleted!");
                        } else {
                            System.out.println("Try Again!");
                        }
                    } else if (choice == 3) {
                        System.out.println("\n Enter The Brand :");
                        String brand = scanner.nextLine();
                        notebookManagement.listByBrand(brand);
                    } else if (choice == 4) {
                        notebookManagement.listAll();
                    } else {
                        System.out.println("\nWrong Choice!");
                        continue;
                    }
                }
            } else if (choice == 2) {
                while (true) {
                    System.out.println("Mobile Phone Operations\n0-Back\n1-Add New Phone\n2-Delete Phone\n3-List By Brand\n4-List All Phones");
                    System.out.println("Make Your Choice : ");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice == 0) {
                        break;
                    } else if (choice == 1) {
                        System.out.println("\nEnter The Name You Want To Add : ");
                        String name = scanner.nextLine();
                        System.out.println("Enter The Brand You Want To Add : ");
                        String brandName = scanner.nextLine();
                        System.out.println("Enter The Price You Want To Add : ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        Brand brand = bm.getBrand(brandName);

                        if (brand == null) {
                            brand = new Brand(brandName);
                            bm.add(brand);
                        }

                        if (mobilePhoneManagement.add(new MobilePhone(price, 0, 1, name, brand, -1, -1, -1, -1, -1, "White")))
                            ;
                        System.out.println("Product Added !");
                    } else if (choice == 2) {
                        System.out.print("\nEnter The ID You Want To Delete :");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        if (mobilePhoneManagement.delete(id)) {
                            System.out.println("Product Deleted :");
                        } else {
                            System.out.println("Try Again : ");
                        }
                    } else if (choice == 3) {
                        System.out.println("\nEnter The Brand : ");
                        String brand = scanner.nextLine();
                        mobilePhoneManagement.listByBrand(brand);
                    } else if (choice == 4) {
                        mobilePhoneManagement.listAll();
                    } else {
                        System.out.println("\nWrong Choice : ");
                        continue;
                    }
                }
            } else if (choice == 3) {
                bm.printBrands();
            } else {
                System.err.println("Wrong Choice !");
                continue;
            }
        }
    }
}
