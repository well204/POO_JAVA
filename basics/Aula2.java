package basics;

import java.util.Locale;
import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double weight;
        char gender;
        // quando for usar o nextLine() e antes
        // ter lido um nextInt() ou nextDouble() etc, vc tem q dar um
        // nextLine() para consumir a quebra de linha pendente.

        System.out.print("Digite seu nome: ");
        name = sc.nextLine();
        System.out.println();
        System.out.print("Digite sua idade: ");
        age = sc.nextInt();
        System.out.println();
        System.out.print("Digite sua altura: ");
        weight = sc.nextDouble();
        System.out.println();
        System.out.print("Digite seu sexo: ");
        gender = sc.next().charAt(0);
        System.out.printf("%nSeu nome é: %s, você tem %d anos e sua altura é de %.2f e seu gênero é %c", name, age,
                weight, gender);
        sc.close();
    }
}
