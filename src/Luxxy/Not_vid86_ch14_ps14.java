package Luxxy;

class MyException1 extends Exception{
    public MyException1(String message){
        super (message);
    }

}
public class Not_vid86_ch14_ps14 {
    public static void main(String[] args) {
        //Problem 1

//        int a = 8
//        syntax error

//        int age = 67;
//        int year_born = 2000-78; //logical error
//        System.out.println(6/0);


//Problem 2
//        try {
//            Thread t = new Thread();
//            t.setPriority(20);
//
//        }catch (IllegalArgumentException e){
//            System.out.println("hehe");
//        }catch (ArithmeticException e){
//            System.out.println("haha");
//        }


//        problem 3
//boolean flag = true;
//int [] marks = new int[3];
//marks[0] = 9;
//marks[1] = 4;
//marks[2] = 2;
//Scanner sc = new Scanner(System.in);
//int i = 0;
////int index;
//while(flag && i<5){
//try {
//
//    System.out.println("Enter the Value of the Index : ");
//    int  index = sc.nextInt();
//    System.out.println("The value of the marks[index] is " + marks[index]);
//break;
//}catch (Exception e){
//    System.out.println("Invalid Index"  + e.getMessage());
//    i++;
//}
//
//
//
//    }
//


//if(i>=5){
//    System.out.println("Error");
//}

//Problem 4
//        boolean flag = true;
//        int [] marks = new int[3];
//        marks[0] = 9;
//        marks[1] = 4;
//        marks[2] = 2;
//        Scanner sc = new Scanner(System.in);
//        int i = 0;
////int index;
//        while(flag && i<5){
//            try {
//
//                System.out.println("Enter the Value of the Index : ");
//                int  index = sc.nextInt();
//                System.out.println("The value of the marks[index] is " + marks[index]);
//                break;
//            }catch (Exception e){
//                System.out.println("Invalid Index"  + e.getMessage());
//                i++;
//            }
//
//
//
//        }
//
//        if(i>=5){
//            System.out.println("Error");
//        }

        //Problem5

  try {
      throw  new MyException1("this is new exception");
  }catch(Exception e){
      System.out.println("this is the upgradded" + e.getMessage());
  }



    }
}
