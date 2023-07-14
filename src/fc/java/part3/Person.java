package fc.java.part3;

import fc.java.model.PersonVO;

public class Person {
    public String name;
    public int age;
    public String phone;
    public void play(){
        System.out.println("운동을 한다");
    }
    public void eat(){
        System.out.println("음식을 먹는다");
    }
    public void walk(){
        System.out.println("달린다");
    }

    public static void main(String[] args) {

        // vo.name // 에러. PersonVO의 멤버변수 name은 private으로 선언되었기 때문에 직접 접근이 되지 않음(정보은닉)
        // 1. getter와 setter를 사용한 private변수 접근
        PersonVO testVO = new PersonVO();
        testVO.setName("김테스트");
        System.out.println("name : "+ testVO.getName());

        // 2. default 생성자메소드를 이용한 초기화
        PersonVO vo = new PersonVO();
        System.out.println("default 생성자메소드를 이용한 초기화 : " + vo.getName());

        // 3. 생성자 메소드 오버로딩
        PersonVO vo1 = new PersonVO("은비",2,"010-0000-0000");
        PersonVO vo2 = new PersonVO("까비",2,"010-1111-1111");

        System.out.println("vo1.getName() = " + vo1.getName());
        System.out.println("vo2.getName() = " + vo2.getName());

        // 4. toString() 메소드 (strVO.toString() == strVO)
        PersonVO strVO = new PersonVO();
        System.out.println("stVO.toString() = " + strVO.toString());
        System.out.println("strVO : " + strVO); // 변수만 호출해도 toString(); 리턴값이 출력됨 (단, VO내 toString()이라는 이름의 메소드가 있을 경우만)

    }

}
