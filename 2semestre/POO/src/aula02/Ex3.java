package aula02;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        double M, finalTemperature, initialTemperature, Q;
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a quantidade de água:");
        M = input.nextDouble();
        System.out.print("Insira a temperatura inicial:");
        initialTemperature = input.nextDouble();
        System.out.print("Insira a temperatura final:");
        finalTemperature = input.nextDouble();
        input.close();

        if (M <= 0 || initialTemperature <= 0 || finalTemperature <= 0) {
            System.out.println("ERRO: Insira valores positivos e não nulos.");
        }
        else {
            Q = M * (finalTemperature - initialTemperature) * 4184;
            System.out.println("A energia (Q), em Joules, é " + Q + " J.");
        }

    }
}
