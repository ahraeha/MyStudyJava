package Day_07.field.internalcomponents.sec01.EX02;

//#1. 클래스 생성(정의)
class A {
  boolean m1;
  int m2;
  double m3;
  String m4;

  void printFieldValue () {
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
    System.out.println(m4);
  }

  void printLocalVariable() {
    int k;
//    System.out.println(k); // 지역변수 - 스택메모리 초기값을 집어넣지않으면 빈칸 - 반드시 초기화
  }
}

public class InitialValueOfFieldAndLocalVariable {

  public static void main(String[] args) {

    //#2. 클래스를 활용하여 객체 생성
    A a = new A();

    //#3. 객체 활용
    a.printFieldValue();

  }

}
