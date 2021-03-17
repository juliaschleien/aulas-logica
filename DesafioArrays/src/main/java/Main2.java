public class Main2 {

    public static void main(String[] args) {
        int[] numbers = new int[21];
        int contador = 0;

        while (contador <= 20) {
            numbers[contador] = contador;
            System.out.println(numbers[contador]);
            contador++;

            }
        for (int i = 0; i < numbers.length; i++){


            if (numbers[i] % 2 == 0) {
                System.out.println("Elemento é par:"+numbers[i]);
            } else {
                System.out.println("Elemento é impar:"+numbers[i]);

            }



        }
    }
}

