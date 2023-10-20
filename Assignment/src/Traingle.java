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

    private double distance2(){
        double x2 = getVertices2().getX();
        double y2 = getVertices2().getY();

        double x3 = getVertices3().getX();
        double y3 = getVertices3().getY();

        return Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
    }

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
}
