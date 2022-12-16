import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите икс: ");
        float f = in.nextFloat();
        System.out.print("Введите ыгрык: ");
        float g = in.nextFloat();
        System.out.println(f + " + " + g + " = " + (f + g) );
    }
}