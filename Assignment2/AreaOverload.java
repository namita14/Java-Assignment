public class AreaOverload {
    public static void main(String[] args) {
    AreaShape obj = new AreaShape();
    obj.area(10); //Call area(int x)
    obj.area(5,6); //Call area(int x,int y)
    }
}

class AreaShape {
    void area(int x) {
       System.out.println("Area of square is =" + (x*x));
    }
    void area(int x,int y) {
        System.out.println("Area of rectangle is ="  + (x*y));
    }
}
