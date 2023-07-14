package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    // a. default 생성자
    public PersonVO(){
        // 초기화 동작을 넣어준다
        this.name = "홍길동";
        this.age = 30;
        this.phone = "010-0000-0000";
    }

    // b. 생성자메소드를 오버로딩 - 원하는 값으로 초기화
    public PersonVO(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name; // this.name; // 중복되는 변수가 없을 경우 this는 생략 가능
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age; // this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "name='" + name + "', age=" + age + ", phone='" + phone +"'";
    }
}
