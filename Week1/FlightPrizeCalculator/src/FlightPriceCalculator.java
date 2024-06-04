import java.util.Scanner;

public class FlightPriceCalculator {
    public static void main(String[] args) {
        // Adding variables
        // Degiskenleri Ekledim

        int distance;
        int flight;
        int age;
        double price;
        final double tax = 1.20;

        // Taking flight information from the user
        // To avoid a confusion I added scanner classes through variables
        // Kullanicidan ucusuna ait bilgileri aliyoruz
        // Kafa karisikligi olmamasi icin scanner siniflarini degiskenlere gore belirledim

        System.out.println("Please Enter The Distance To Be Traveled In KM : ");
        Scanner dist = new Scanner(System.in);
        distance = dist.nextInt();

        System.out.println("Please Enter Your Age : ");
        Scanner ages = new Scanner(System.in);
        age = ages.nextInt();


        System.out.println("Please Enter Your Flight Type 1-One Way 2-Round Trip : ");
        Scanner type = new Scanner(System.in);
        flight = type.nextInt();

        price = (distance * 0.1) * tax;

        // I am using switch case construct because it seems much easy to me
        // If you want to use if else construct it is similar to switch case
        // Switch case yapisi bana daha kolay geldigi icin bunu kullandim
        // If else yapisi da kullanilabilir hemen hemen benzerler zaten intellij otomatik uyari veriyor
        // Flight Type 1 = One Way 2 = Round Trip selection
        // Ucus Tipi 1 = Tek Yon  = Gidis-Donus secimi

        if (distance < 0 || age < 0 || (flight != 1 && flight != 2)) {
            System.out.println("Wrong Choice ! ");
        } else {
            switch (flight) {

                case 1:
                    if (age < 12) {
                        System.out.println("Fee : " + (price * 0.5) + " TL ");
                    } else if (age <= 24) {
                        System.out.println("Fee : " + (price * 0.9) + " TL ");
                    } else if (age >= 65) {
                        System.out.println("Fee : " + (price * 0.7) + " TL ");
                    } else {
                        System.out.println(" Fee " + price + " TL ");
                    }
                    break;

                case 2:
                    if (age < 12) {
                        System.out.println(" Fee " + (price * 0.5 * 2 * 0.8) + " TL ");
                    } else if (age <= 24) {
                        System.out.println(" Fee " + (price * 0.9 * 2 * 0.8) + " TL ");
                    } else if (age >= 65) {
                        System.out.println(" Fee " + (price * 0.7 * 2 * 0.8) + " TL ");
                    } else {
                        System.out.println(" Fee " + ((price * 2) * 0.8) + " TL ");
                    }
                    break;
            }
        }

    }
}
