//public class intro_oops {
//    String name;
//    int roll_no;
//    public static void main(String[] args) {
//    intro_oops A1 = new intro_oops();
//    A1.name = "john";
//    A1.roll_no = 2;
//
//        System.out.println("name of student is " + A1.name + " roll no is " + A1.roll_no );
//    }
//}

class Triangle {
    int a,b,c;
    public double getArea(){
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),5);
    }
    public double getPerimeter(){
        return (a+b+c)/2.0;
    }
}
public class intro_loops {
    public static void main(String[] args) {
    Triangle t1 =new Triangle();
    t1.a =5;
    t1.b =6;
    t1.c =7;
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
    }

}