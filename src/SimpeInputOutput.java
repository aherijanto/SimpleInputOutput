import java.io.IOException;
import java.util.Scanner;

public class SimpeInputOutput {

    public static void main(String[] args) throws IOException {
        /*System.out.println("Ketik satu karakter kemudian press ENTER");
        int input;
        input = System.in.read();//read ASCII Character
        System.out.println("Kode ASCII adalah = "+input);*/

        System.out.println("\n");

        Scanner myInput = new Scanner(System.in);

        System.out.print("Masukkan Nama = ");
        String namaSaya = myInput.nextLine();
        System.out.println("Nama Saya Adalah : " + namaSaya);

        System.out.println("Masukkan Angka = ");
        int number1 = myInput.nextInt();

    }
}
