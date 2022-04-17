package com.company;

import java.util.Scanner;
//import fileio.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc =new Scanner(System.in);
        Scanner sc1 =new Scanner(System.in);
        boolean flag = true;//false

        ShowRegisterdCourses r= new ShowRegisterdCourses();
        System.out.println("Welcome to pre Registration");


        while(flag){
                    System.out.println("1. Pre Registration");
                    System.out.println("2. Final Registration");
                    System.out.println("3. Exit");
                    int choose = sc.nextInt();
                    switch (choose){
                        case 1:
                            System.out.println("You Selected Pre-Registration");
                            System.out.println("Do you want to see available courses for You?");
                            String opinion = sc1.nextLine();
                            if(opinion.equals("Yes")){
                                r.ShowRegistrationTask();
                                break;
                            }
                            else{
                                System.out.println("Go Backing....");
                            }
                            break;
                        case 2:
                            System.out.println("You Selected Final-Registration");
                            break;
                        case 3:
                            System.out.println("Cheating");
                            flag = false;
                            break;
                        default:System.out.println("Invalid Input");
                            break;

                    }
                   // break;
        }
            ;
        }


      //  r.setRegistration();
       // r.ShowRegistrationArray();
    }

