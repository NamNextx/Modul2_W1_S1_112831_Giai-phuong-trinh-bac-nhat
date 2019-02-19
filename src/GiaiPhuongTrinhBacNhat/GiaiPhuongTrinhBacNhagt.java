package GiaiPhuongTrinhBacNhat;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhagt {
    public static void main(String[] args) {
        float a = 0.0f;
        float b = 0.0f;
        Scanner sc = new Scanner(System.in);
        display();

        System.out.print("Moi ban nhap vao a: ");
        a = sc.nextInt();
        System.out.print("Moi ban nhap vao b: ");
        b = sc.nextInt();
        checkNghiem(a,b);

    }

    public static void checkNghiem(float a, float b) {
        if (a != 0) {
            float nghiem = (-b / a);
            System.out.print("Phuong trinh co mot nghiem la: " + nghiem);
        } else {
            if (b==0){
                System.out.println("Phuong trinh co vo so nghiem");
            }
            else System.out.println("Phuong trinh vo nghiem");
        }
    }

    public static void display() {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
    }


}

