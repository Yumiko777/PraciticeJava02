public class ReturnExample {
    // 戻り値はdouble
    public static double getAreaOfCircle(double radius) {
        return radius * radius * 3.14;
    }

    public static void main(String[] args) {
        double circleArea = getAreaOfCircle(2.5);
        System.out.println("半径2.5の円の面積は" + circleArea);
    }  
}
