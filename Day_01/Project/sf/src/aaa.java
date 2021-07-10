import java.awt.*;

public class aaa {

    public static void main(String[] args) {
        SequenceList<String> list = new SequenceList<>(5);
        list.insert("a");
        list.insert("b");
        list.insert("c");
        list.insert("d");
        list.insert("e");
        list.insert("f");
        list.insert("g");
        for (String s : list) {
            System.out.println(s);
        }


//        System.out.println(list.get(2));
//        System.out.println("-------------");
//        System.out.println(list.remote(1));
//        System.out.println(list.get(1));
//        System.out.println(list.getLength());
    }
}
