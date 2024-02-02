import java.util.Locale;
import java.util.Scanner;

public class DesafioAtletas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadeAtletas, quantidadeHomens = 0, quantidadeMulheres = 0;

        String nome, sexo, atletaAlto = "";

        double altura = 0,
                peso = 0,
                pesoMedio = 0,
                pesoAtletas = 0,
                maiorAltura = 0,
                porcentagemHomens = 0,
                alturaMulheres = 0;

        System.out.print("Qual a quantidade de atletas? ");
        quantidadeAtletas = sc.nextInt();

        for (int i = 1; i <= quantidadeAtletas; i++) {
            System.out.printf("Digite os dados do atleta número %d: \n", i);
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();

            System.out.print("Sexo: ");
            sexo = sc.next();

            while (!sexo.equalsIgnoreCase("F")
                    && !sexo.equalsIgnoreCase("M")) {
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                sexo = sc.next();
            }

            System.out.print("Altura: ");
            altura = sc.nextDouble();

            if (sexo.toUpperCase().equals("M")) {
                quantidadeHomens++;
            } else {
                quantidadeMulheres++;
                alturaMulheres += altura;
            }

            while (altura <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }

            System.out.print("Peso: ");
            peso = sc.nextDouble();

            while (peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }
            pesoAtletas += peso;

            if (maiorAltura < altura) {
                maiorAltura = altura;
                atletaAlto = nome;
            }
        }

        pesoMedio = pesoAtletas / quantidadeAtletas;

        System.out.println("");
        System.out.println("RELATÓRIO: ");
        System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
        System.out.println("Atleta mais alto: " + atletaAlto);

        if (quantidadeHomens > 0) {
            porcentagemHomens = quantidadeHomens * 100 / quantidadeAtletas;
            System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemHomens);
        } else {
            System.out.println("Não há homens cadastrados");
        }

        if (quantidadeMulheres > 0) {
            alturaMulheres = (alturaMulheres / quantidadeMulheres);
            System.out.printf("Altura média das mulheres: %.2f %n", alturaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas");
        }

        sc.close();
    }

}