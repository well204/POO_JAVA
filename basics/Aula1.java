package basics;

//import java.util.Locale;

public class Aula1 {
    public static void main(String[] args) throws Exception {
        /*
         * String product1 = "Computer";
         * String product2 = "Office desk";
         * int age = 31;
         * int code = 3902;
         * char gender = 'F';
         * double price1 = 2100.0;
         * double price2 = 650.50;
         * double measure = 54.392839;
         * 
         * System.out.println("Products: ");
         * System.out.printf("%s, with price is $ %.2f%n", product1, price1);
         * System.out.printf("%s, with price is $ %.2f%n%n", product2, price2);
         * System.out.printf("Record: %d years old, code %d and gender %c%n%n", age,
         * code, gender);
         * 
         * System.out.printf("Measure with eight decimal places: %.8f%n", measure);
         * Locale.setDefault(Locale.US);
         * System.out.printf("US decimal point: %.3f%n", measure);
         */
        System.out.println(calc(-5));

    }

    public static int calc(int number) {
        number = Math.abs(number); // Obtém o valor absoluto do número fornecido
        if (number == 1 || number == 0)
            return number;
        return number + calc(number - 1);
    }

}
