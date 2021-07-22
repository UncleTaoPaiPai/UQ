public class Dog {

    private String color;
    private int age;
    private int weight;
    private int height;

    public Dog() {
    }

    public Dog(String color, int age, int weight, int height) {
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
