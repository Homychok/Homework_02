public class Main {
    public static void main(String[] args) {
    int a1 = 0;
    int b1 = 10;
    int a2 = -10;
    int b2 = 0;
    boolean firstsolution = b1 < a2;
    boolean secondsolution = b2 < a1;
    boolean thirdsolution = a1 < a2 & b1 < b2 & a2 < b1;
    boolean fourthsolution = a2 < a1 & b2 < b1 & a1 < b2;
    boolean fifthsolution = b1 == a2;
    boolean sixthsolution = b2 == a1;
    boolean seventhsolution = a1 == a2 & b1 == b2;
    boolean eightsolution = a1 < a2 & b1 > b2;
    boolean ninthsolution = a2 < a1 & b2 > b1;
    boolean tenthsolution = a1 == a2 & b1 < b2 ;
    boolean eleventhsolution = a1 == a2 & b2 < b1;
    boolean twelthsolution = a1 < a2 & b1 == b2;
    boolean thirteenthsolution = a2 < a1 & b1 == b2;
    if (firstsolution | secondsolution) {
        System.out.println("У данных отрезков нет точек пересечения");
    } else if (thirdsolution) {
        System.out.println("Два ряда пересекаются на отрезке [" + a2 + ";" + b1 + "]");
    } else if (fourthsolution) {
        System.out.println("Два ряда пересекаются на отрезке [" + a1 + ";" + b2 + "]");
    } else if (fifthsolution) {
        System.out.println("Два ряда пересекаются в точке " + b1);
    } else if (sixthsolution) {
        System.out.println("Два ряда пересекаются в точке " + b2);
    } else if (seventhsolution | ninthsolution | tenthsolution | thirteenthsolution) {
        System.out.println("Два ряда пересекаются на отрезке [" + a1 + ";" + b1 + "]");
    } else  {
        System.out.println("Два ряда пересекаются на отрезке [" + a2 + ";" + b2 + "]");
    }
    }
}