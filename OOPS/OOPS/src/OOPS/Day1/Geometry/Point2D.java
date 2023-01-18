package OOPS.Day1.Geometry;

import java.util.Scanner;

public class Point2D{
    private int x,y;
    Scanner sc = new Scanner(System.in);
    public Point2D(){
        x = 0;
        y = 0;
    }
    public Point2D( int x, int y){
        this.x = x;
        this.y = y;
    }
    public void AcceptInfo(){
        System.out.println("Enter the coordinate x , y : " );
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public void show()
    {
        System.out.println("x : " + x + " y : " + y);
    }
    public boolean isEqual(int x, int y ){
        return (this.x == x && this.y == y);
    }
    public boolean isEqual(Point2D p1){
        return (this.x == p1.x && this.y == p1.y);
    }

    public double calculateDistance(int x, int y ){
        return Math.sqrt( Math.pow((this.x - x),2) + Math.pow((this.y - y),2) );
    }
    public double calculateDistance(Point2D p1 ){
        return Math.sqrt( Math.pow((this.x - p1.x),2) + Math.pow((this.y - p1.y),2) );
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

