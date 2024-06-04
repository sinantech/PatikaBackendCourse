public class ExponentCalculation {
    static int exp(int base, int power) {
        // base and power variables
        // if power below zero we print 1
        if (power < 1) {
            return 1;
        } else {
            // base * base and * power-1
            // we are escaping from endless loop with power -1 because two calculations we have here
            // yoksa çarpıp durur sonsuza kadar sdbshdhg
            // recursive function the func calls himself I think if it does not let me know
            return base * exp(base, power - 1);
        }
    }


    public static void main(String[] args) {

        System.out.println(exp(5, 3));
    }
}
