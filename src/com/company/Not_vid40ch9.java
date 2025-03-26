package com.company;
class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class Not_vid40ch9 {
    public static void main(String[] args) {

        MyEmployee Not = new MyEmployee();

        Not.setName("hi i'm vikash");
        Not.setId(89);
        System.out.println(Not.getName());
        System.out.println(Not.getId());
//Not.id = 45;
//Not.name = "hi vikash";               //  shows error due to private access
    }
}

