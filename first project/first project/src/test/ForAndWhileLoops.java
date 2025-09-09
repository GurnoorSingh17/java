

public class ForAndWhileLoops {

    public static void main(String[] args){
        System.out.println("***************Welcome to the guessing the password game using brute-force*************");

        int TotalyRandomPassword = (int) (Math.random() * 100);
        
        System.out.println("Guess the password");

        

        for (int Count = 0;Count<=100;Count++) {

            if (Count == TotalyRandomPassword){
                System.out.println("This attempt is the correct password: " + Count);
                break;
            }

            System.out.println("This attempt is not the correct password: " + Count);

        }


    }








}
