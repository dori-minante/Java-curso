package estrutura_sequencial;

import java.util.Locale;

public class saidaDeDados {

    public static void main(String[] args) {
    //saída de dados
        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);

        System.out.println("Bom dia!");

    //concatenar vários elementos em um mesmo comando de escrita
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);

    //Exemplo:
    // %f = ponto flutuante; %d = inteiro; %s = texto; %n = quebra de linha.

         String nome = "Maria";
         int idade = 31;
         double renda = 4000.0;
         System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
    }
}
