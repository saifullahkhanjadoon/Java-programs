class Employee {
    String name;
    int yearOfJoining;
    int salary;
    String address;

   public Employee(String n, int y, int s, String a)
   {
        name=n;
        yearOfJoining=y;
        salary=s;
        address=a;
    }
    public void display()
    {
        System.out.println(name+"\t\t\t" +yearOfJoining +"\t\t\t" +salary+ "\t\t" +address);
    }
    public static void main(String[] args) {

        Employee e1 = new Employee("Saifullah",2021,30000,"Nawasher");
        Employee e2 = new Employee("abdullah ",2010,50000,"Abbottabad");
        Employee e3 = new Employee("talha ",1999,20000,"nathiagali");

        System.out.println("Name\t\t\tYear of joining\t\tSalary\t\tAddress");
        System.out.println("__________________________________________________________");
        e1.display();
        e2.display();
        e3.display();
    }
}
