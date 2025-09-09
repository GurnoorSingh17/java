

public class FourWheeler extends vehicle_base{

    int CurrentGear;




    public FourWheeler(String BrandName,String ModelName,String DateOfManufacturing,int FuelInLiters,Boolean DoYouHaveKeys,boolean IsVehicalStarted){
        super(4, BrandName, ModelName, DateOfManufacturing, FuelInLiters, DoYouHaveKeys, IsVehicalStarted);
    }

    

    public void ChangeGear(int Gear){
        if (Gear <= 5 && Gear >=1){
            CurrentGear = Gear;
            System.out.println("Current gear is changed to "+ CurrentGear);
        }





    }

}
