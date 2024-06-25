package estrutura_sequencial;

public class ProcessamentoDeDados {
    public static void main(String[] args) {

        //Exemplo1 - boa prática: para double use .0

        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println(area);

        //Exemplo2 - boa prática: para float use f

        float b, B, h, area;
        b = 6f;
        B = 8f;
        h = 5f;
        area = (b + B) / 2f * h;
        System.out.println(area);

        //Exemplo4 - usar o casting para a É a conversão explícita de um tipo para outro.
        //É necessário quando o compilador não é capaz de “adivinhar” que o
        //resultado de uma expressão deve ser de outro tipo.

        int a, b;
        double resultado;
        a = 5;
        b = 2;
        resultado = (double) a / b;
        System.out.println(resultado);

        //outro exemplo de casting

        double a;
        int b;
        a = 5.0;
        b = (int) a;
        System.out.println(b);
    }
}
