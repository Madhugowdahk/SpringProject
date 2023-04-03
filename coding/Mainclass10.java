class Graph
{
    double xaxis;
    double yaxis;
    void display()
    {
        System.out.println("("+xaxis+","+yaxis+")");
    }
    void changecordinates(double x,double y)
    {
        xaxis=x;
        yaxis=y;
    }
}
class Mainclass10{
public static void main(String[] args)
{
    Graph g1=new Graph();
    g1.xaxis=4.5;
    g1.yaxis=5.8;
    g1.display();
    g1.changecordinates(7.9,1.2);
    g1.display();
}
}