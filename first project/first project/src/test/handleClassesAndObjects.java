

public class handleClassesAndObjects {
    public static void main(String[] args){
        
        UseCar();
        UseMotorcycle();
        UseWreckedCar();




    }
    
    public static void UseCar(){
        FourWheeler car0 = new FourWheeler("VolksWagon", "Golf Gti", "20032025", 15, true, false);
        car0.StartVehicle();
        car0.ChangeGear(3);
        
        
        
        
        
    }
    
    public static void UseMotorcycle(){
        TwoWheeler sct0 = new TwoWheeler("TVS", "Jupiter 5000", "21022025",10, true, false);
        sct0.StartVehicle();
        sct0.ChangeStandPos(true);


    }
    public static void UseWreckedCar(){
        WreckedCar wcar0 = new WreckedCar("Mercedes", "Benz", "20051966", 0, true, false);
        wcar0.StartVehicle();
    }


}



