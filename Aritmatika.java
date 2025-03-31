package tugaslima;

public class Aritmatika {

    //method yang digunakan untuk menjumlahkan 2 bilangan integer
    public void hitungPenjumlahan(int a,int b){
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : "+nilai);
    }

    //method yang digunakan untukk mengalikan 2 bilangan integer 
    public static void hitungPerkalian(int a, int b){
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : "+nilai);
    }

    //method yang digunakan untuk mengurangi 2 bilangan integer 
    public static void hitungPengurangan(int a, int b){
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : "+nilai);
    }

    //method yang digunakan untuk membagi 2 bilangan dalam bentuk String 
    public double hitungPembagian(String nilai1, String nilai2){
        double a = Double.parseDouble(nilai1);
        double b = Double.parseDouble(nilai2);

        //jika pembagi = 0 progranm menolak dan akan mengeluarkan pesan 
        if(b == 0){
            System.out.println("Tidak bisa membagi dengan 0");
            return 0;
        }
        //jika pembagi tidak sama dengan 0 akan mengembalikan hasil pembagian dalam bentuk double 
        return a / b;

    }
}

