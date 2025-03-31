package tugaslima;

public class Vehicle1{

    //meyimpan berat muatan saat ini 
    private double load;
    //menyimpan kapasitas maksimum kendaraan 
    private final double maxLoad;       //menghapus default value 

    //konstruktor default dengan maxLoad = 10000kg atau konstruktor tanpa parameter 
    public Vehicle1(){
        this.maxLoad = 10000;
    }

    //konstruktor custom (maxLoad ditentukan pengguna) atau konstruktor dengan parameter max
    public Vehicle1 (double max){
        this.maxLoad = max;
    }

    //getter agar kelas lain dapat mengakses tanpa langsung mengakses atributte private
    public double getLoad(){
        return this.load;
    }

    //getter agar kelas lain dapat mengakses tanpa langsung mengakses atributte private
    public double getMaxLoad(){
        return this.maxLoad;
    }

    //menerima berat, jika berhasil ditambahkan akan mengembalikan true, jika gagal akan mengembalikan false 
    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        }else{
            return false;
        }
    }
}
        