package Employee_Wage_Computation_Problem;

import java.util.Random;

public class Employee_Computation {
    public static final int wage_per_hr = 20;
    public static final int hrs_in_a_day = 8;
    public static final int part_time_hrs = 4;
    public static int UC1(){
        Random rand = new Random();
        int attandance = rand.nextInt(3);
        int hrs_worked = 0;
        switch (attandance){
            case 1 : hrs_worked = hrs_in_a_day;
                break;
            case 2 : hrs_worked = part_time_hrs;
                break;
            default: hrs_worked = 0;
                break;
        }
        return hrs_worked;
    }

    public static int UC2(){
        int check_attendance = UC1();
        int total_hrs_attended = 0;
        if(check_attendance == 4){
            total_hrs_attended+=4;
        }
        else if(check_attendance == 8){
            total_hrs_attended+=8;
        }
        else total_hrs_attended+=0;

        int total_wage = total_hrs_attended * wage_per_hr;
        System.out.println("Total hrs attended :"+ total_hrs_attended);
        System.out.println("Daily wage : "+ total_wage);
        return total_wage;
    }

    public static void UC3(){
        int total_wage = part_time_hrs * wage_per_hr;
        System.out.println("Wage of a Part-Time Employee : "+ total_wage);
    }

    public static void UC5(){
        int working_days = 20;
        int total_month_wage = 0;
        while(working_days>0){
            total_month_wage+=UC2();
            working_days--;
        }
        System.out.println("Montly Wage : "+ total_month_wage);
    }

    public static void UC68(String companyname, int wageperhr, int maxworkingdays, int maxworkinghrs){
        int total_working_days = 0;
        int total_working_hrs = 0;
        int total_wage = 0;

        Random rand = new Random();
        System.out.println("\nComputing wages for " + companyname + "...");
        while (total_working_days < maxworkingdays && total_working_hrs < maxworkinghrs) {
            int attendance = rand.nextInt(3); // Generates 0 (Absent), 1 (Full Time), or 2 (Part Time)
            int hrs_worked = 0;

            switch (attendance) {
                case 1:
                    hrs_worked = hrs_in_a_day;
                    break;
                case 2:
                    hrs_worked = part_time_hrs;
                    break;
                default:
                    hrs_worked = 0;
                    break;
            }

            total_working_hrs += hrs_worked;
            total_working_days++;
            int daily_wage = hrs_worked * wageperhr;
            total_wage += daily_wage;

            System.out.printf("Day %d: Hours Worked = %d, Daily Wage = $%d\n", total_working_days, hrs_worked, daily_wage);
        }

        System.out.println("Total Working Hours: " + total_working_hrs);
        System.out.println("Total Working Days: " + total_working_days);
        System.out.println("Total Wage for the Month: $" + total_wage);
    }


    public static void main(String args[]){

        UC68("CompanyA", 20, 20, 100);
        UC68("CompanyB", 25, 22, 120);
        UC68("CompanyC", 30, 25, 150);

        //UC2();
        //UC3();
        //UC5();

    }

}

