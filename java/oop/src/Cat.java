public class Cat {


    static int year;
    private int age;
    private int weight;
    private String color;
    static int height = 100;

    static {
       year = 100;
        System.out.println("Cat's Code");


    }

    public Cat(int age,String color) {
        this.age=age;
        this.color=color;
    }

    public String getcolor() {
        return this.color;
    }

    public static void h(){
        System.out.println("dsjkfhsd");
    }
}
