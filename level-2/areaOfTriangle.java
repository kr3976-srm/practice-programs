
import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();
        double areacm = 0.5 * base * height;
        double areain = areacm / 6.4516; 
        System.out.println("The area of the triangle in sqcm: " + areacm + " cm²");
        System.out.println("The area of the triangle in sqin: " + areain + " in²");
    }
}
