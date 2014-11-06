/**
 * Created by ikanisamani on 11/3/14.
 */
public class Point extends  Shape{

    @Override
    public void display() {
        System.out.println("Point display called");
    }

    @Override
    public void fill(){
        System.out.println("Point fill called");
    }

    @Override
    public void undisplay(){
        System.out.println("Point undisplay called");
    }
}
