package com.company;

public class ShowRegisterdCourses extends Registration{
    public void ShowRegistrationArray(){
        for(int i=0;i<setRegistrationArray.length;i++){
            if(setRegistrationArray[i] != null){
                System.out.println(setRegistrationArray[i]);
            }
            else {
                break;
            }
        }
    }
}
