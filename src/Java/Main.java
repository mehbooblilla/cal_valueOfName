package Java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*if a=1,b=2...... and z=26 then write a computer program that take input of person name and display sum of
        values against each character used in the name.The program should only work for your on name
        and all those names that formed using character those belong to your name.
         */
        Scanner scanner=new Scanner(System.in);
        String myName="mehboob";
        System.out.print("sum of my name value is: ");
        System.out.println(cal_valueOfString(myName));
        System.out.print("Enter your name:");
        String name=scanner.next();
       if(isValid(myName,name)==true) System.out.println(cal_valueOfString(name));
       else System.out.println("Invalid");


    }
    public static int cal_valueOfString(String name) {
        int total = 0;
        for (int i = 0; i < name.length(); i++) {
            int value = name.charAt(i);
            total += value;
        }
        return total;
    }
    public static boolean isValid(String myName,String name){
        if(myName.contains(name)){
            return true;

        }
        else return false;

    }

}
