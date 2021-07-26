public class useComputer {

    public static void computer(IComputer computer, int num1,int num2){

        int result = computer.computer(num1, num2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        news KXO = new news();
        System.out.println(KXO.add(100, 22));
        System.out.println(KXO.divi(200, 0));
        System.out.println(KXO.mult(20, 22));
        System.out.println(KXO.sub(22, 0));
    }
}
