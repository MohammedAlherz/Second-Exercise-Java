import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        1.Write a program that checks the role of the user
        If the role is admin print "welcome admin"
        If the role is superuser print "welcome superuser"
        If the role is user print "welcome user" (tip:
        use if else)
         */
        Scanner input1 = new Scanner(System.in);
        System.out.println("Write your Role: ");
        String role = input1.nextLine();
        if(role.equalsIgnoreCase("Admin")){
            System.out.println("Welcome "+role);
        }else if(role.equalsIgnoreCase("Superuser")){
            System.out.println("Welcome "+role);
        }else if(role.equalsIgnoreCase("User")){
            System.out.println("Welcome "+role);
        }else{
            System.out.println("Invalid Role!!");
        }

        /*
        2.Take three numbers from the user and print the greatest number.
        Test Data
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
        Expected Output : The
        greatest: 87
         */
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = input2.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = input2.nextInt();
        System.out.println("Enter Third Number: ");
        int num3 = input2.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("The gratest: "+num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("The gratest: "+num2);
        }else if (num3 > num1 && num3 > num2){
            System.out.println("The gratest: "+num3);
        }else{
            System.out.println("All Three numbers are equal: ("+num1+", "+num2+", "+num3+")");
        }

        /*
        3.Write a Java program that generates an integer between 1 and 7
        and displays the name of the weekday.
        Test Data
        number: 4
        Expected Output:
        Wednesday
         */

//        Scanner input3 = new Scanner(System.in);
        int numOfDays = (int) (Math.random() * 7) + 1;
        switch (numOfDays){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Number!!");
        }

        /*
        4.
        Write a program that takes a numeric score as input and prints
        the corresponding letter grade using the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59
        Enter your numeric score: 85
        Numeric Score: 85
        Letter Grade: B
         */

        Scanner input4 = new Scanner(System.in);
        System.out.println("Please Enter a numeric score: ");
        int score = input4.nextInt();
        if(score >=90 && score<=100){
            System.out.println("Numeric Score: "+score);
            System.out.println("Letter Grade: A");
        }else if(score >=80 && score<=90){
            System.out.println("Numeric Score: "+score);
            System.out.println("Letter Grade: B");
        }else if(score >=70 && score<=79){
            System.out.println("Numeric Score: "+score);
            System.out.println("Letter Grade: C");
        }else if(score >=60 && score<=69){
            System.out.println("Numeric Score: "+score);
            System.out.println("Letter Grade: D");
        }else if(score >=0 && score<=59){
            System.out.println("Numeric Score: "+score);
            System.out.println("Letter Grade: F");
        }else{
            System.out.println("Invalid Score!!");
        }

        /*
        5.
        Write a Java program that takes a person's age as input and
        categorizes them into one of three age categories: "Child,"
        "Teenager," or "Adult" using an if statement.
        use an if statement to categorize the age based on the following criteria:
        • If the age is less than 13, categorize them as a "Child."
        • If the age is between 13 and 19 (inclusive), categorize them as a
        "Teenager."
        • If the age is 20 or older, categorize them as an "Adult."
        Sample Output:
        Enter your age: 25
        You are an Adult.
         */

        Scanner input5 = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input5.nextInt();
        if(age < 13 && age >= 1){
            System.out.println("Your are a Child");
        }else if(age <= 19 && age >= 13){
            System.out.println("Teenager");
        }else if(age >= 20){
            System.out.println("Adult");
        }else{
            System.out.println("Invalid number!!");
        }
    }
}