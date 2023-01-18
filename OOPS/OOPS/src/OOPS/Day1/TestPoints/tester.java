package OOPS.Day1.TestPoints;
import OOPS.Day1.Geometry.Point2D;
import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int maxX=0, maxY=0;
        System.out.println("Enter the no of Points: ");
        int num = sc.nextInt();

        Point2D[] points = new Point2D[num];

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point2D();
            points[i].AcceptInfo();
        }
        for (int i = 0; i < points.length; i++) {
            points[i].show();

        }

//        char[][] graph = new char[(maxX)][(maxY)];
//        for (int i = 0; i < maxX; i++) {
//            for (int j = 0; j < maxY; j++) {
//                //graph[i][j]="*";
//            }
//        }
//
//        for (int i = 0; i < maxX; i++) {
//            for (int j = 0; j < maxY; j++) {
//                System.out.print(graph[i][j]);
//            }
//        }


        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D();

        p1.AcceptInfo();
        p2.AcceptInfo();

        p1.show();
        p2.show();

        p1.isEqual(10,10);

        System.out.println(p1.isEqual(10,10));
        System.out.println(p2.isEqual(p1));

        if(p2.isEqual(p1))
            System.out.println("Equal");
        else {
            System.out.println("not Equal");
            System.out.println("Distance : " + (p2.calculateDistance(p1)));
        }

        System.out.println(new String[]{"not Equal","Equal"}[p2.isEqual(p1)?1:0]);

        System.out.println("Distance from origin: "+ (p2.calculateDistance(0,0)));
        System.out.println("Distance : "+ (p2.calculateDistance(p1)));

    }
}
