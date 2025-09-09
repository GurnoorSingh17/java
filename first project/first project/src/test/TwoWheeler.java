

public class TwoWheeler extends vehicle_base {

    boolean IsStandDown;

    public TwoWheeler(String BrandName,String ModelName,String DateOfManufacturing,int FuelInLiters,Boolean DoYouHaveKeys,boolean IsVehicalStarted){
        super(2, BrandName, ModelName, DateOfManufacturing, FuelInLiters, DoYouHaveKeys, IsVehicalStarted);
    }


    public void ChangeStandPos(Boolean IsDown){

        IsStandDown = IsDown;
        
        switch (IsStandDown) {
            case true: System.out.println("Stand is down");
                
                break;
        
            case false:System.out.println("Stand is up");
                break;
        }
        

        


    }
    

}
