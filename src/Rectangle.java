/**
 * Created by ikanisamani on 11/4/14.
 */
public class Rectangle extends Shape{

    @Override
    public void display() {
        System.out.println("Rectangle display called");
    }

    @Override
    public void fill(){
        System.out.println("Rectangle fill called");
    }

    @Override
    public void undisplay(){
        System.out.println("Rectangle undisplay called");
    }
}
