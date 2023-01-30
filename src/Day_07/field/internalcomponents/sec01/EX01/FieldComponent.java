package Day_07.field.internalcomponents.sec01.EX01;
//필드와 지역변수의 구분
//#1. 클래스를 생성
class A {
  int m = 3; // 필드
  int n = 4; // 필드

  void work1() {
    int k = 5; // 지역변수
    System.out.println(k); // 지역변수 출력 5
    work2(3); //
  }
  void work2(int i) { // i 매개변수는 필드일까? 지역변수일까?
                      // int i 가장 먼저 실행
                      // i = 외부에서 전달된 값 -> 실제로는 중괄호 안에서 실행된것과 동일하다

    int j = 4; // 지역변수
    System.out.println(i + j); // 7
  }

}

public class FieldComponent {

  public static void main(String[] args) {

    //#2. 클래스를 활용하여 객체 생성
    A a = new A();

    //#3-1. 필드값 출력
    System.out.println(a.m); // 3
    System.out.println(a.n); // 4

    //#3-2. 메서드 호출
    a.work1();//5, 7

  }

}
