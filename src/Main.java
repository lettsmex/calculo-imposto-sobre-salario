import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] salariosBrutos = new double[1];
        double[] inssDescontos = new double[1];
        double[] impostoRendaDescontos = new double[1];
        double[] salariosLiquidos = new double[1];

        for (int i = 0; i < 1; i++) {

            System.out.println("Digite o salário bruto: ");
            salariosBrutos[i] = sc.nextDouble();

            inssDescontos[i] = calculoInss(salariosBrutos[i]);
            impostoRendaDescontos[i] = calculoIr(salariosBrutos[i]);
            salariosLiquidos[i] = salariosBrutos[i] - inssDescontos[i] - impostoRendaDescontos[i];
        }
        System.out.println("\nResumo dos salários:");
        for (int i = 0; i < 1; i++) {
            System.out.printf("O salário bruto é de R$%.2f%n.", salariosBrutos[i]);
            System.out.printf("O desconto do INSS é de R$%.2f%n.", inssDescontos[i]);
            System.out.printf("O desconto do Imposto de Renda é de R$%.2f%n.", impostoRendaDescontos[i]);
            System.out.printf("\nDessa forma o salário líquido é de R$%.2f%n.", salariosLiquidos[i]);
        }
        sc.close();
    }
    public static double calculoInss (double salarioBrutoValor) {
        if (salarioBrutoValor <= 1212.00) {
            return salarioBrutoValor * 0.075;
        } else if (salarioBrutoValor <= 2427.35) {
            return salarioBrutoValor * 0.09;
        } else if (salarioBrutoValor <= 3641.03) {
            return salarioBrutoValor * 0.12;
        } else {
            return salarioBrutoValor * 0.14;
        }
    }
    public static double calculoIr (double salarioBrutoValor) {
        if (salarioBrutoValor <= 1903.98) {
            return 0.0;
        } else if (salarioBrutoValor <=2826.65) {
            return salarioBrutoValor * 0.075;
        } else if (salarioBrutoValor <= 3751.05) {
            return salarioBrutoValor * 0.15;
        } else if (salarioBrutoValor <= 4664.68) {
            return salarioBrutoValor * 0.225;
        } else {
            return salarioBrutoValor * 0.275;
        }
    }
}
