package com.company;

import java.util.Scanner;

public class Registration {
    String setRegistrationArray[] = new String[20];
    private String ArrayOfRegistration[] = new String[]{"Object oriented Analysis and Design",
            "Software Quality and Testing",
            "Advance Computer Network",
            "Network Security",
            "Data warehouse and Data Mining",
            "Advance Database Management",
            "Linear Programming"};
    public void ShowRegistrationTask(){
        System.out.println("Available Courses Are:");
        for(int i=0;i<ArrayOfRegistration.length;i++){
            System.out.println((i+1)+". "+ArrayOfRegistration[i]);
        }
    }
    public void setRegistration(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Preferred number:");


        for(int i=0;i<3;i++){
            int inputNumber = sc.nextInt();
            if(inputNumber ==1){
                setRegistrationArray[i] = ArrayOfRegistration[(0)];
            }
            if(inputNumber ==2){
                setRegistrationArray[i] = ArrayOfRegistration[(1)];
            }
            if(inputNumber==3){
                setRegistrationArray[i] = ArrayOfRegistration[2];
            }
            //setRegistrationArray[i] = setRegistrationArray[inputNumber];//0
        }

    }


}
