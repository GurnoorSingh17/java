

public class vehicle_base {

    int NoOfTyres;
    String BrandName;
    String ModelName;
    String DateOfManufacturing;
    int FuelInLiters;
    Boolean DoYouHaveKeys;
    Boolean IsVehicalStarted;

    public vehicle_base(int NoOfTyres,String BrandName,String ModelName,String DateOfManufacturing,int FuelInLiters,Boolean DoYouHaveKeys,boolean IsVehicalStarted){

        this.NoOfTyres = NoOfTyres;
        this.BrandName = BrandName;
        this.ModelName = ModelName;
        this.FuelInLiters = FuelInLiters;
        this.DoYouHaveKeys = DoYouHaveKeys;
        this.IsVehicalStarted = IsVehicalStarted;


    }

    public void StartVehicle(){

        System.out.println("Your " + BrandName + " " + ModelName+" "+ "is started");
        IsVehicalStarted = true;

    }
    

}
