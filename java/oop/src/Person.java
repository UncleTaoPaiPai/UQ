/**
 * @Auther : YongggzHi
 * @Date : 2021/7/9 - 23:48
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 *
 *      Person --- 类
 */
public class Person {

    int age;
    String name;
    double height;
    double width;

    public Person() {
    }

    public Person(int age, String name, double height, double width) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public void eat() {
        System.out.println("我喜欢吃饭");
    }

    public void sleep() {
        System.out.println("我在办公室睡觉");
    }

    public String introduce() {
        return "我的名字是："+name+",我的年龄是："+age+",我的身高是："+height+",我的体重是:"+width;
    }




}
