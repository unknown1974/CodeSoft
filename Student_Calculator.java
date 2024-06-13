import java.util.Scanner;

public class Student_Calculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Student Calculator---------");
        System.out.println("Enter no of Subjects : ");
        int n = sc.nextInt();
        System.out.println("Enter Marks Secured in Subjects : ");
        int a[] =new int[n];
        for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0;i<n;i++){
            total += a[i];
        }
        float perc = total/n;


        int count = 0;
        for (int i = 0;i<n;i++){
            if (a[i] < 40) {

                count++;
            }
        }
        System.out.println("\n\n-----------Student Memo----------");
        System.out.println("Total Marks : "+total);
        

        if(count>0){
            System.out.println("You are Failed in "+count+" Subjects");
            System.out.println("Better Luck Next Time");
        }
        else{
            char grade;
            if(perc>=90 && perc<=100)
                grade = 'S';
            else if(perc>=75 && perc<90)
                grade = 'A';
            else if(perc>=60 && perc<75)
                grade = 'B';
            else if(perc>=50 && perc<60)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("Percentage Secured : "+perc+"%");
            System.out.println("You Got "+grade+" Grade.");
        }
    }
}
