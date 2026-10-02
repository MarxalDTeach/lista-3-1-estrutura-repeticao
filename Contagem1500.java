
public class Contagem1500 {
    public static void main(String[] args) {

        System.out.println("contagem de 233 a 456 de 2 em 2: ");
        int d = 2;

        for (int i = 233; i <= 456; i += d) {
            System.out.println(i);

            if (i >= 300 ) {

                d = 3;
            } else if (i >= 400) {

                d = 2;
            }
        }

    }

}
