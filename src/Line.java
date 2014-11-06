/**
 * Created by ikanisamani on 11/4/14.
 */
public class Line extends Shape{

    @Override
    public void display() {
        System.out.println("Line display called");
    }

    @Override
    public void fill(){
        System.out.println("Line fill called");
    }

    @Override
    public void undisplay(){
        System.out.println("Line undisplay called");
    }
}
