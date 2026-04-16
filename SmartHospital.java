import java.util.Scanner;
import java.util.Locale;

public class SmartHospital {

    private Scanner scanner;

    public SmartHospital() {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Configura o Scanner para usar ponto como separador decimal
    }

    // 🔹 MAIN (aqui roda o programa)
    public static void main(String[] args) {

        SmartHospital sistema = new SmartHospital();

System.out.print("Bem-vindo ao Smart Hospital! Vamos calcular o seu IMC.");

        double peso = sistema.pedirPeso();
        double altura = sistema.pedirAltura();

        double imc = sistema.calcularIMC(peso, altura);

        System.out.println("IMC: " + String.format("%.2f", imc));
    }

    // 🔹 MÉTODOS (ficam FORA do main)

    public double pedirPeso() {
        System.out.print("Digite o peso: ");
        return scanner.nextDouble();
    }

    public double pedirAltura() {
        System.out.print("Digite a altura: ");
        return scanner.nextDouble();
    }

    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}