/**
 * Created by ikanisamani on 11/4/14.
 */
public class XXCircleAdapter extends Shape {
    private XXCircle circle;

    public XXCircleAdapter(XXCircle circle){
        this.circle = circle;
    }
    @Override
    public void setLocation(){
        circle.setLocation();
    }
    @Override
    public  void getLocation(){
        circle.getLocation();
    }

    @Override
    public  void display(){
        circle.displayit();
    }

    @Override
    public void fill(){
        circle.displayit();
    }

    @Override
    public void setColor(){
        circle.setItsColor();
    }

    @Override
    public void undisplay(){
        circle.displayit();
    }
}
