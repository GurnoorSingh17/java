


public class statics {


    public static void main(String[] args){


        System.out.println("x is op");
        int x = multiplication(10, 12);
        System.out.println(x);

        String y = isitgoku("vegeta");
        String z = isitgoku("goku");
        System.out.println(y);
        System.out.println(z);
    }

    private static int multiplication(int a,int b){

        int m = a*b;
        return m;


    }

    public static String isitgoku(String a){


        if (a == "goku"){
            return "yes";
        }
        else return "no";

    }


}
