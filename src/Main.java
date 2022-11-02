public class Main {
    public static void main(String[] args) {
        System.out.println(result(80, 70)); // 理科が80点で数学で70点
        System.out.println(result(70, 60)); // 理科が70点で数学で60点
        System.out.println(result(90, 0)); // 理科が90点で数学で0点
    }

    private static String result(int point1, int point2) {
        String ret;
        if((point1 + point2 >= 140) || (point1 >= 90 || point2 >= 90)){
            ret = "合格";
        } else {
            ret = "不合格";
        }

        return ret;
    }
}