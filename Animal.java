class Animal {
    public String name;
    public int feedingTime;

    public Animal(String n,int time) {
        name=n;
        feedingTime=time;
    }
    public void display() {
        System.out.println("Animal Name: "+name);
        System.out.println("Feeding Time: "+feedingTime+" o'clock");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Cow",12);
        Animal a2 = new Animal("Goat",15);

        a1.display();
        a2.display();
    }
}
