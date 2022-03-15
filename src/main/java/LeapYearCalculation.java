import java.util.Scanner;

public class LeapYearCalculation {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter a year: " );
        year=input.nextInt();

        if(year%4==0 && year%100== 0){
            System.out.println("This is not leap year");
        }else if (year%4 ==0 ){
            System.out.println("This is leap year");
        }else {
            System.out.println("This is not leap year");
        }



    }
}
