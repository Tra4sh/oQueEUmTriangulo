import java.util.Scanner;

public class OqEUmTriangulo {
    public static void main(String[] args) {
        //Criando objeto do tipo scanner.
        Scanner leitor = new Scanner(System.in);
        //Inserir os valores.
        System.out.println("Insira o valor A:");
        double ladoA = leitor.nextDouble();
        System.out.println("Insira o valor B:");
        double ladoB = leitor.nextDouble();
        System.out.println("Insira o valor C:");
        double ladoC = leitor.nextDouble();
         String triangulo = "";

         //Soma do Dados inseridos inseridos nas varieaveis.
        double somaA = ladoB + ladoC;
        double somaB = ladoA + ladoC;
        double somaC = ladoA + ladoB;

        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB){
            if (ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
                System.out.println("escaleno");
            } else if (ladoA == ladoB && ladoB == ladoC && ladoC == ladoA) {
                System.out.println("equilatero");
            } else {
                System.out.println("isoceles");
            }
        } else {
            System.out.println("ERRO: resultado não é um Triangulo");
        }
    }
}