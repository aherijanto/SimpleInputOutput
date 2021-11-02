import java.util.Scanner;

public class Function01 {
    public static void main(String[] args) {

        double jarijari;
        double kelLingkaran;
        final float pi = 3.14f;

        Scanner pleaseInput = new Scanner(System.in);
        System.out.println("Masukkan Jari-Jari = ");
        jarijari = pleaseInput.nextDouble();


        kelLingkaran = 2 * pi * jarijari;
        System.out.println("Keliling Lingkaran = " + kelLingkaran);

        KelilingLingkaran(); // calling method or function

    }

    //declaring function / method with static void
    static void KelilingLingkaran(){

        double jari;
        double kel;
        double pi = 3.14;

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukan jarijari = ");
        jari = inputUser.nextDouble();

        kel = 2 * pi * jari;
        System.out.println("Keliling Lingkaran Dalam Method / Function = "+kel);
    }

}
