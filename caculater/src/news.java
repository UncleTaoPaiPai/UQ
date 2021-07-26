public class news implements Caculater {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int mult(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int divi(int num1, int num2) {
        try{
            return num1 / num2;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
