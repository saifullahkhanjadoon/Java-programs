class Date {
    int day;
    int month;
    int year;
    Date(int d, int m, int y)
    {
        day=d;
        month=m;
        year=y;
    }
    public void display()
    {
        if(day<10&&month<10){
            System.out.println( "0"+day+ "/0"+month+ "/" +year);
        }else
        {
            System.out.println( day+ "/"+month+ "/" +year);
        }
           }
    public static void main(String[] args)
    {
        Date d1 = new Date(25, 12, 2023);
        Date d2 = new Date(5, 7, 2024);
        d1.display();
        d2.display();
    }
}
