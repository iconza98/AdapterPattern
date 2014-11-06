/**
 * Created by ikanisamani on 11/4/14.
 */

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args){

        ArrayList<Shape> shapeArray = new ArrayList<Shape>();
        System.out.println("Populating Array with Shape objects");
        shapeArray.add(new Shape());
        shapeArray.add(new Line());
        shapeArray.add(new Point());
        shapeArray.add(new Rectangle());
        shapeArray.add(new XXCircleAdapter(new XXCircle()));

        System.out.println("Calling setLocation in Array:");
        for(Shape s: shapeArray){
            System.out.print(s.getClass() + "\t");
            s.setLocation();
        }

        System.out.println("\nCalling getLocation in Array:");
        for(Shape s: shapeArray){
            System.out.print(s.getClass() + "\t");
            s.getLocation();
        }

        System.out.println("\nCalling display in Array:");
        for(Shape s: shapeArray){
            System.out.print(s.getClass() + "\t");
            s.display();
        }

        System.out.println("\nCalling fill in Array:");
        for(Shape s: shapeArray){
            System.out.print(s.getClass() + "\t");
            s.fill();
        }

        System.out.println("\nCalling setColor in Array:");
        for(Shape s: shapeArray){
            System.out.print(s.getClass() + "\t");
            s.setColor();
        }

        System.out.println("\nCalling undisplay in Array:");
        for(Shape s: shapeArray){
            System.out.print(s.getClass() + "\t");
            s.undisplay();
        }

    }
}
