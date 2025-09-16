public class Employee_8 {
        int salary;
        int workHours;
        public void getInfo(int sal,int hrs) {
            salary=sal;
            workHours=hrs;
        }

        public void AddSal() {
            if (salary<50000) {
                salary=salary+ 1000;
            }
        }

        public void AddWork() {
            if (workHours>6) {
                salary=salary + 500;
            }
        }
        public void displaySalary() {
            System.out.println("Final Salary: Rs. "+salary);
        }
            public static void main(String[] args) {
            Employee_8 e1=new Employee_8();
            e1.getInfo(38000,8);
            e1.AddSal();
            e1.AddWork();
            e1.displaySalary();
        }
    }

