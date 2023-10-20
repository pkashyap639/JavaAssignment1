import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Variables to store vertices
        double x1,y1,x2,y2,x3,y3;
        // Array of class Triangle
        Traingle[] t = new Traingle[3];
        // getting Input
        for(int i=0;i< t.length;i++){
            System.out.println("Enter Vertices of Triangle: "+(i+1));
            // Enter Vertices 1
            System.out.print("Enter x1: ");
            x1 = s.nextDouble();
            System.out.print("Enter y1: ");
            y1 = s.nextDouble();

            // Enter Vertices 2
            System.out.print("Enter x2: ");
            x2 = s.nextDouble();
            System.out.print("Enter y2: ");
            y2 = s.nextDouble();

            // Enter Vertices 3
            System.out.print("Enter x3: ");
            x3 = s.nextDouble();
            System.out.print("Enter y3: ");
            y3 = s.nextDouble();

            // making triangle
            t[i] = new Traingle(new Point(x1,y1), new Point(x2,y2), new Point(x3,y3));
            System.out.println("Triangle "+(i+1)+" created successfully");
            // Display Vertices
            t[i].DisplayVertices();
            // Display Perimeter
            System.out.println("Perimeter of Triangle "+(i+1)+" is "+t[i].Perimeter());

            // Display isosceles
            if(t[i].isosceles()){
                System.out.println("Triangle "+(i+1)+" is isosceles");
            }else{
                System.out.println("Triangle "+(i+1)+" is not isosceles");
            }
            System.out.println("");

        }


    }
}