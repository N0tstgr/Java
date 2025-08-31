package Luxxy;

public class Homeworkfinally {
    public static void main(String[] args) {
for(int i = 1; i<=5; i++){
    try {
        System.out.println( i);
        if(i ==2){
            System.out.println("breaking the loop");
            break;
        }
    }catch(Exception e){
        System.out.println(e);
    }finally{
        System.out.println("cleaning the sources ... ");
    }

}
        System.out.println("Loop ended");
    }
}
