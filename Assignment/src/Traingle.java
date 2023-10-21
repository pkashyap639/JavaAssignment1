// Author: Piyush Kant
// Id: c0893688
public class Traingle {
    // Three Vertices of triangle of type point
    private Point vertices1;
    private Point vertices2;
    private Point vertices3;

    // constructor to set vertices of triangle
    public Traingle(Point vertices1, Point vertices2, Point vertices3){
        this.vertices1 = vertices1;
        this.vertices2 = vertices2;
        this.vertices3 = vertices3;
    }

    // Get vertices
    private Point getVertices1(){
        return vertices1;
    }
    private Point getVertices2(){
        return vertices2;
    }
    private Point getVertices3(){
        return vertices3;
    }

    // Display Vertices
    public void DisplayVertices(){
        System.out.println("Vertices 1: ("+getVertices1().getX()+","+getVertices1().getY()+")");
        System.out.println("Vertices 2: ("+getVertices2().getX()+","+getVertices2().getY()+")");
        System.out.println("Vertices 3: ("+getVertices3().getX()+","+getVertices3().getY()+")");
    }

    // get distance of side 1
    private double distance1(){
        double x1 = getVertices1().getX();
        double y1 = getVertices1().getY();

        double x2 = getVertices2().getX();
        double y2 = getVertices2().getY();

        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
    // get distance of side 2
    private double distance2(){
        double x2 = getVertices2().getX();
        double y2 = getVertices2().getY();

        double x3 = getVertices3().getX();
        double y3 = getVertices3().getY();

        return Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
    }
    // get distance of side 3
    private double distance3(){
        double x1 = getVertices1().getX();
        double y1 = getVertices1().getY();

        double x3 = getVertices3().getX();
        double y3 = getVertices3().getY();

        return Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
    }
    // Finding Perimeter
    // Formula:  sum of each side
    public double Perimeter(){

        return distance1()+distance2()+distance3();
    }

    // check if isosceles
    public boolean isosceles(){
        if(distance1() == distance2()){
            return true;
        }
        else if(distance2() == distance3()){
            return true;
        }
        else if(distance1() == distance3()){
            return true;
        }
        return false;
    }

    // Big X
    public double BigX(){
        double x1 = getVertices1().getX();
        double x2 = getVertices2().getX();
        double x3 = getVertices3().getX();

        if(x1>x2 && x1>x3){
            return x1;
        }
        else if(x2>x1 && x2>x3){
            return x2;
        }
        return x3;
    }
    // Small X
    public double SmallX(){
        double x1 = getVertices1().getX();
        double x2 = getVertices2().getX();
        double x3 = getVertices3().getX();

        if(x1<x2 && x1<x3){
            return x1;
        }
        else if(x2<x1 && x2<x3){
            return x2;
        }
        return x3;
    }

    // Big Y
    public double BigY(){
        double y1 = getVertices1().getY();
        double y2 = getVertices2().getY();
        double y3 = getVertices3().getY();

        if(y1>y2 && y1>y3){
            return y1;
        }
        else if(y2>y1 && y2>y3){
            return y2;
        }
        return y1;
    }

    // Small y
    public double SmallY(){
        double y1 = getVertices1().getY();
        double y2 = getVertices2().getY();
        double y3 = getVertices3().getY();

        if(y1<y2 && y1<y3){
            return y1;
        }
        else if(y2<y1 && y2<y3){
            return y2;
        }
        return y1;
    }

    public boolean checkInside(double p1, double p2){
        double smallX = SmallX();
        double smallY = SmallY();
        double bigX = BigX();
        double bigY = BigY();
        if((p1>=smallX && p1<=bigX) && (p2>=smallY && p2>=bigY)){
            return true;
        }
        return false;
    }
}
