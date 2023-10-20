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
}
