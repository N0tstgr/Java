package Luxxy;

public class Not_vid82_nestedTryCAtch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 9;
        marks[1] = 87;
        marks[2] = 76;

        try {
            System.out.println("welcome to video no 82 ");
            try {
                System.out.println(marks[9]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception in level 1");
            }

        }
    }
}
