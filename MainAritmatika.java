package tugaslima;

//mengimpor kelas scanner 
import java.util.Scanner;

public class MainAritmatika {
    public static void main(String[] args) {

        //membuat objek scanner untuk membaca inputan dari pengguna
        Scanner in = new Scanner(System.in);

        //meminta pengguna memasukan nilai 1 dan 2
        System.out.print("masukkan nilai 1 : ");
        //membaca dan menyimpan input pengguna 
        int nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil2 = in.nextInt();
        //memanggil method static
        Aritmatika.hitungPengurangan(nil1, nil2);

        //meminta pengguna memasukan nilai 1 dan 2
        System.out.print("masukkan nilai 1 : ");
        //membaca dan menyimpan input pengguna 
        nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nil2 = in.nextInt();
        //memanggil method static
        Aritmatika.hitungPerkalian(nil1, nil2);

        //meminta pengguna memasukan nilai 1 dan 2
        System.out.print("masukkan nilai 1 : ");
        //membaca dan menyimpan input pengguna 
        int value1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int value2 = in.nextInt();
        //memanggil method NONstatic harus melalui objek
        Aritmatika a = new Aritmatika();
        a.hitungPenjumlahan(value1, value2);

        //meminta pengguna memasukan nilai 1 dan 2
        System.out.print("masukkan nilai 1: ");
        //membaca dan menyimpan input pengguna 
        String nilai1 = in.next();
        System.out.print("masukkan nilai 2: ");
        String nilai2 = in.next();

        //membuat objek aritmatika untuk memanggil method hitungPembagian() dan menampilkan hasil 
        Aritmatika aritmatika = new Aritmatika();
        double nilai = aritmatika.hitungPembagian(nilai1, nilai2);
        System.out.println("nilai pembagian adalah: " + nilai);

        //menutup scanner 
        in.close();
    }
}



