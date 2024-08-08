class Circle1{
    private float radius ;
    private float area;
    private float perimeter;
    public float getArea(){
        return area;
    }
    public void setArea(float r){
        radius = r;
       area = ( float) (Math.PI * radius * radius);

    }
    public float getPerimeter(){
        return perimeter;
    }
    public void setPerimeter(float r){
        radius = r;
        perimeter = (float) (2 * Math.PI * radius);
    }

    public void isCorrectlySet() {
        if (area == (float) (Math.PI * radius * radius)) {
            System.out.println("Area is set correctly");
        } else {
            System.out.println("Area is not set in accordance with the radius");
        }

        if (perimeter == (float) (2 * Math.PI * radius)) {
            System.out.println("Perimeter is set correctly");
        } else {
            System.out.println("Perimeter is not set in accordance with the radius");
        }
    }

}
public class circleThroughPrivateAccessModifier {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.setArea(5);
        c.setPerimeter(5);
        System.out.println("Area : " + c.getArea());
        System.out.println("Perimeter : " + c.getPerimeter());
        c.isCorrectlySet();
    }
}
