

public class WreckedCar extends vehicle_base implements Stopable{




    public WreckedCar(String BrandName,String ModelName,String DateOfManufacturing,int FuelInLiters,Boolean DoYouHaveKeys,boolean IsVehicalStarted){

        super(4, BrandName, ModelName, DateOfManufacturing, FuelInLiters, DoYouHaveKeys, IsVehicalStarted);

    }


    public void StartVehicle(){
        System.out.println("sorry, the required vehical is not in the shape to be turned on/off");
    }

    public void StopVehicle(){

        System.out.println("sorry, the required vehical is not in the shape to be turned on/off");
        

    }
}
