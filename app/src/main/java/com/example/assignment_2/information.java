package com.example.assignment_2;

public class information {

    private String name;
    private String email;
    private String hobbies;
    private String gender;


    public information(){
    }

    public information(String name,String email,String hobbies,String gender){
        this.name= name;
        this.email=email;
        this.hobbies=hobbies;
        this.gender=gender;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getHobbies() {
        return hobbies;
    }
    public void setHobbies(String hobbies){
        this.hobbies=hobbies;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
}
