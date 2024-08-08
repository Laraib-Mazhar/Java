class Cylinder{
////    Used in question 1
//    private int radius;
//    private int height;
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }


////    Used in question 2
//    private int radius;
//    private int height;
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public double surfaceArea(){
//        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
//    }
//    public double volume(){
//        return Math.PI * radius * radius * height;
//    }


////    Used in 3
//    private int radius;
//    private int height;
//
//    public Cylinder(int radius, int height) {
//        this.radius = radius;
//        this.height = height;
//    }
//
//    public double surfaceArea(){
//        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
//    }
//    public double volume(){
//        return Math.PI * radius * radius * height;
//    }
}


//    //used in 4
//    class Rectangle1{
//        int length;
//        int breadth;
//
//        public Rectangle1(){
//            length = 5;
//            breadth = 4;
//        }
//        public Rectangle1(int l, int b){
//            length = l;
//            breadth = b;
//        }
//}


//    Used in 5
    class Sphere{
    private int radius;
    private int area;
    private double volume;

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int Area(){
        area =  (int) (4 * Math.PI *  (Math.pow(radius,2)));
        return area;
    }
    public double Volume(){
        volume =   (4.0/3.0) * Math.PI *  (Math.pow(radius, 3));
        return volume;
    }
}

public class PS9 {
    public static void main(String[] args) {
////        Question number 1
////        create a class cylinder and use getter and setters to set its radius and height
//        Cylinder cylinder = new Cylinder();
//        cylinder.setHeight(20);
//        cylinder.setRadius(10);
//        System.out.println("Height : " + cylinder.getHeight());
//        System.out.println("Radius : " + cylinder.getRadius());



////        Question number 2
////        use ➊ to calculate surface and volume of the cylinder
//        Cylinder cylinder = new Cylinder();
//        cylinder.setRadius(2);
//        cylinder.setHeight(5);
//        System.out.println("Surface Area : " + cylinder.surfaceArea());
//        System.out.println("Volume : " + cylinder.volume());


////        Question number 3
////        Use a constructor and repeat ➊
//        Cylinder cylinder = new Cylinder(12,5);
//        System.out.println("Surface Area : " + cylinder.surfaceArea());
//        System.out.println("Volume : " + cylinder.volume());


//////        Question number 4
//////        Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
//        Rectangle1 rectangle1 = new Rectangle1();
//        System.out.println("Length : " + rectangle1.length);
//        System.out.println("Breadth : " + rectangle1.breadth);
//
//
//        Rectangle1 rectangle2 = new Rectangle1(5,4);
//        System.out.println("Length : " + rectangle2.length);
//        System.out.println("Breadth : " + rectangle2.breadth);



//        Question number 5
//        Repeat ➊ for a sphere
        Sphere sphere = new Sphere();
        sphere.setRadius(5);
        System.out.println("Area of sphere : " + sphere.Area());
        System.out.println("Volume of sphere : " + sphere.Volume());

    }
}
