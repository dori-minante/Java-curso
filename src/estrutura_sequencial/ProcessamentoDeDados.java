package estrutura_sequencial;

public class ProcessamentoDeDados {
    public static void main(String[] args) {

        //Exemplo4 - usar o casting para a É a conversão explícita de um tipo para outro.
        //É necessário quando o compilador não é capaz de “adivinhar” que o
        //resultado de uma expressão deve ser de outro tipo.

        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = (double) a / b;
        System.out.println(resultado);

    }
}
