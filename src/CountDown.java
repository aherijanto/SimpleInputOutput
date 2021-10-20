public class CountDown {
    public static void main(String[] args) {
        //Mencetak Angka dari 100 sampai 1
        //Kemudian Apabila Dijumpai Kelipatan 7
        //Maka Angka Tersebut dikali dengan 5
        for(int i=100;i>=1;i--){
            if((i%7)==0){
                int cetakAngka;
                cetakAngka = i * 5;
                System.out.println(cetakAngka + " ------> " + i + " dikali 5");
            }else{
                System.out.println(i);
            }
        }
    }
}
