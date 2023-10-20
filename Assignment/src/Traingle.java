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
    public Point getVertices1(){
        return vertices1;
    }
    public Point getVertices2(){
        return vertices2;
    }
    public Point getVertices3(){
        return vertices3;
    }
}
