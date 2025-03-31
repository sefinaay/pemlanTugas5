package tugaslima;

public class TestVehicle1{

    public static void main(String[] args){
        System.out.println("Creating a vehicle with "); 
    
        //membuat kendaraan 
        Vehicle1 vehicle = new Vehicle1();      //menggunakan konstruktor default
        //menampilkan kapasitas maksimum 
        System.out.println("Vehicle max load : " + vehicle.getMaxLoad());

        //menambah berat kotak
        System.out.println("Add box #1 (500kg) : " + vehicle.addBox(500));
    
        System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250));
    
        System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000));
    
        System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000));
    
        System.out.println("Add box #5 (300kg) : " + vehicle.addBox(300));
    
        //menampilkan total muatan 
        System.out.println("Vehicle load is " + vehicle.getLoad() + "kg");
        System.out.println();

        //membuat kendaraan          
        Vehicle1 vehicle2 = new Vehicle1(1000);     //menggunakan konstruktor custom
        //menampilkan kapasitan maksimum 
        System.out.println("Vehicle max load : " + vehicle2.getMaxLoad());
    
        //menambah berat kotak
        System.out.println("Add box #1 (500kg) : " + vehicle2.addBox(500));
    
        System.out.println("Add box #2 (250kg) : " + vehicle2.addBox(250));
    
        System.out.println("Add box #3 (5000kg) : " + vehicle2.addBox(5000));
    
        System.out.println("Add box #4 (4000kg) : " + vehicle2.addBox(4000));
    
        System.out.println("Add box #5 (300kg) : " + vehicle2.addBox(300));
    
        //menampilkan total muatann 
        System.out.println("Vehicle load is " + vehicle2.getLoad() + "kg");
    }

}



