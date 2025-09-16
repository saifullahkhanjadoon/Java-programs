import java.util.Scanner;
public class Rectangle {
    private   double length=1.0;
    private   double width=1.0;
    public double getWidth() {
        return width;   }
    public void setWidth(double width) {
        if(width>0.0 && width<20.0){
            this.width = width; }else {
            System.out.println("please enter width measurment less than 20.0 and greater than 0.0");    }   }
    public double getLength() {
        return length;  }
    public void setLength(double length){
        if(length>0.0 && length<20.0){
            this.length=length;
        }else {
            System.out.println("please enter length measurment less than 20.0 and greater than 0.0\n"); }   }
    public double calculatePerimeter(){
                return 2*(length+width);    }
    public double calculateArea(){
        return length*width;    }
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        double len=sc.nextDouble();
        System.out.println("Enter width of rectangle");
        double wid=sc.nextDouble();
        r1.setLength(len);
        r1.getLength();
        double per=r1.calculatePerimeter();
        double area=r1.calculateArea();
        System.out.println("\nThe area of Reactangle is "+area);
        System.out.println("The perimeter of Reactangle is "+area); }   }