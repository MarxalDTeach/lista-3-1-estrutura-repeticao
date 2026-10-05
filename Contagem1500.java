
public class Contagem {
    public static void main(String[] args) {

        System.out.println("contagem de 233 a 456");
        int d = 5;

        for (int i = 233; i <= 456; i += d) {
            System.out.println(i);

            if (i >= 300 && i <= 400) {

                d = 3;}
                else if (i > 400) {
                    d = 5;


            }
        }

    }

}
