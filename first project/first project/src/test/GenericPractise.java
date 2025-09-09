public class GenericPractise<i1,i2,i3> {


    i1 Num1;
    i2 Num2;
    i3 Num3;

    public GenericPractise(i1 Num1,i2 Num2,i3 Num3){

        this.Num1 = Num1;
        this.Num2 = Num2;
        this.Num3 = Num3;



    }

    public i1 GiveNum1(){

        return(Num1);


    }
    public i2 GiveNum2(){

        return(Num2);


    }
    public i3 GiveNum3(){

        return(Num3);


    }


    public void TakeAverage(double x , double y ,double z){
        double Sum = (double) x +(double) y+(double) z;
        double Ans = Sum/3;
        System.out.println(Ans);
    }

}
