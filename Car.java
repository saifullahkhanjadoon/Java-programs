import java.util.Scanner;
public class Car{
    String CarModel;
    String CarName;
    int CarPrice;
    String CarOwner;

    public void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter car model= ");
        CarModel=sc.nextLine();
        System.out.println("Enter Car Name= ");
        CarName=sc.nextLine();
        System.out.println("Enter Car Price= ");
        CarPrice=sc.nextInt();
        System.out.println("Enter Car Owner Name= ");
        CarOwner=sc.next();
    }
    public void display(){
        System.out.println("\nCar Details");
        System.out.println("Car Model= "+ CarModel);
        System.out.println("Car Name= "+CarName);
        System.out.println("Car Price= "+CarPrice);
        System.out.println("Car Owner= "+CarOwner);
    }
    public static void main(String[] args){
        Car c1=new Car();
        System.out.println("Enter Car details for owner 1");
        c1.get();

        Car c2=new Car();
        System.out.println("Enter Car details for owner 2");

        c2.get();

        Car c3=new Car();
        System.out.println("Enter Car details for owner 3");

        c3.get();

        c1.display();
        c2.display();
        c3.display();
        if(c1.CarPrice> c2.CarPrice && c1.CarPrice> c3.CarPrice){
            System.out.println(c1.CarName+" car has maximum selling price than "+c2.CarName+ " and "+c3.CarName);

        } else if (c2.CarPrice> c1.CarPrice && c2.CarPrice> c3.CarPrice) {
            System.out.println(c2.CarName+" car has maximum selling price than "+c1.CarName+ " and "+c3.CarName);

        }else {
            System.out.printf(c3.CarPrice+" car has maximum selling price than "+ c1.CarPrice +" and "+ c2.CarPrice);
        }

    }
}