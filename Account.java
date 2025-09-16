class Account {
    int emp_id;
    String emp_name;
    int balance;
    double rateOfInterest;

   public Account(int id,String name,int amount,double roi) {
        emp_id=id;
        emp_name=name;
        balance=amount;
       balance = 0;
       rateOfInterest=roi;
    }

    public int get_balance() {
        return balance;
    }

    public void deposit(int amount) {
        balance=balance + amount;
        System.out.println("Deposited: "+amount+" cents");
    }

    public void withdraw(int amount) {
        if (balance>=amount) {
            balance=balance-amount;
            System.out.println("Withdrawn: "+amount+" cents");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void display_balance() {
        int dollars=balance / 100;
        int cents=balance % 100;

        if (cents<10) {
            System.out.println("Balance: $"+dollars+".0"+cents);
        }else
        {
            System.out.println("Balance: $"+dollars+"."+cents);
        }
  }
    public static void main(String[] args) {
        Account acc1 = new Account(101,"Saifullah",10000,5.0);
        acc1.display_balance();

        acc1.deposit(300);
        acc1.display_balance();
        acc1.withdraw(100);
        acc1.display_balance();
    }
}
