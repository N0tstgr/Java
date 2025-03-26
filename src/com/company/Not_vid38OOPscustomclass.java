package com.company;
  class Forbes{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
        System.out.println("that's the salary " + salary);
    }
    public int getSalary(){
        return salary;
    }
}
public class Not_vid38OOPscustomclass {
    public static void main(String[] args) {
        System.out.println("this is our custom class " + "vikash");
Forbes vikash = new Forbes(); //instantiating a new Employee object
Forbes Not = new Forbes();
        //setting attributes for vikash
vikash.id = 321;                                                // >>>>> understand it conveniently
vikash.name = "Notstranger";
vikash.salary = 4;
//setting attributes for Not
Not.id = 451;
Not.name = "Stranger";
Not.salary = 5;
//printing attributes
vikash.printDetails();
Not.printDetails();
int salary = Not.getSalary();
        System.out.println(salary);


    }

}
