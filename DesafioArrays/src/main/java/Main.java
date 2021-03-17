public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[7];
        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 8;
        numbers[3] = 10;
        numbers[4] = 20;
        numbers[5] = 35;
        numbers[6] = 16;

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Terceira Posição:" + numbers[2]);

        int soma = numbers[2] + numbers[2];

        System.out.println("Soma da terceira posição: "+soma);
        System.out.println("Soma da terceira posição aparece uma única vez no vetor");
    }
}
