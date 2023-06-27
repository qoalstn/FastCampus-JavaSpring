# FastCampus-JavaSpring
패스트캠퍼트/자바스프링 강의 정리


## ch1. 자바 개발 환경 구축
## ch2. 첫 자바 프로그래밍

#### 1.JavaSE프로젝트 만들기
- **객체지향 프로그래밍이란?**
    - 클래스 단위로 프로그래밍 하는 것, 클래스들간의 유기적인 연동으로 만들어진다
- Main클래스 (시작클래스) 만들기
    - main 메서드를 가지고 있는 클래스
    - 메인클래스는 1개
    - 프로그램의 시작점(진입점)
#### 2.JavaSE프로젝트 구조 살펴보기
- 자바는 클래스 단위로 코딩
- main메소드에서 시작하는 프로그램은 JavaSE프로그램이다
- 변수 선언
    - 데이터를 저장공간에 넣는것
    - 변수를 선언할 때는 자료형을 명시해야한다 (예 int a, b, sum;)
    - 기본 구조
        - src(소스코드)
        - out : 실행코드, 컴파일 후 클래스파일이 해당 폴더에 생성된다
        - api : 자바라이브러리, 클래스들의 집함
    - 터미널에서 컴파일 실행해보기
        - .java 파일 > run > javac를 이용해서 바이트코드(클래스파일, 중간어코드)로 컴파일, 왜 중간어 코드로 컴파일 하냐? 어떤 os에서 실행 될지 아직 모르기 때문, JVM에서 os에 맞는 코드 exe로 한 번 더 2차로 컴파일하여 메모리에 로 > out폴더에 생성 > JVM에서 실행
          cls : clear
          dir : 디렉토리구조

- 수동으로 수동 컴파일/실행 해보기 (인텔리제이에서는는 run을 누를 떄 자동 동작)

    - 컴파일

        ```jsx
        디렉터리: C:\Java\project\campus\src
        
        Mode                 LastWriteTime         Length Name
        ----                 -------------         ------ ----
        -a----      2023-06-16  오전 10:49            271 Calculator.java
        -a----      2023-06-16  오전 10:49            397 FoureAtithmetic.java
        -a----      2023-06-16  오전 11:32             85 HelloWorld.java
        -a----      2023-06-16  오전 10:49            354 Operator.java
        
        PS C:\Java\project\campus\src> javac.exe  -d ..\out\production\campus\ .\HelloWorld.java**
        ```

    - 실행

        ```jsx
        # 1-1. 컴파일
        $ javac.exe  -d ..\out\production\campus\ .\HelloWorld.java**     
        
        # 1-2. 컴파일 할 때 한글로 인코딩
        $ javac.exe  -d ..\out\production\campus\ .\HelloWorld.java -encoding UTF-8
        
        # 2. 실행 (**파일명 뒤에 .class를 붙이지 않는다)
        $ java.exe -classpath ..\out\production\campus HelloWorld**  
        Hello world << HelloWorld 클래스의 메인 함수 실행
        
        ```


#### 3.JVM과 자바의 구동 방식
- JVM이란?
    - java를 플랫폼(OS)독립적인 개발이 가능하도록 해준다 → 예를 들면 윈도우에서 개발한 프로그램을 맥에서 실행 할 수 있다 (OS가 아닌 JVM 위에서 동작하므로..! +윈도우에서는 윈도우용 JVM을 맥에서는 맥용 JVM을 설치하여 사용한다)
    - 자동으로 메모리를 관리해준다




## ch3. 프로그래밍의 3대 요소

### 1-2.변수, 자료형, 할당
- **변수(V)** : 데이터를 저장하는 메모리 공간의 이름(symbol)
    - 변수의 이름 : 숫자로 시작X, 대소문자가 구분, 길이에 제한X. 특수문자는 $와_만 허용, 예약어는 사용 불가
    - 변수의 종류 : 멤버변수(instance), 클래스변수(static), 지역변수(local), 매개변수(parameter, argument)
- **자료형(D)** : 변수의 **크기와 어떤 종류**의 데이터를 저장할 것인지를 결정하는것
    - 자료형의 종류
        - 기본자료형(Primitive) : int(4byte), float(4byte), char(2byte, 비영어권 문자도 저장 가능, 홑따옴표 사), boolean(1byte)
        - 사용자정의 자료형(Class, 사용자가 modeling) : Book, Movie, 자바에서 클래로 만들어놓은 객체자료형(ex> String..)
- **할당(A)** : 변수에 데이터를 저장하는 것

** 실습 (CarTest.java)


### 3-4.변수 선언과 할당 및 초기화
- **변수선언** : 자료형+변수 → 변수(기억공간)이 메모리에 만들어진다

```jsx
        int a;
        
        int = 4byte의 정수 
        a = 변수 
        
        -> 4byte의 메모리(RAM)를 사용하는 정수형 변수 a의 기억공간을 만든다
```

- **초기화** : 선언한 객체에 최초로 값을 넣어주는 것

```jsx
        int a; // 선언
        a = 10 // 할당(대입) 
        
        int a = 10 // 초기화
```

초기화를 하지 않으면 쓰레기 값이 들어간다(→ 연산이 불가능)

** 실습 (VDAtest.java)


### 5.변수와 심볼테이블 (symbol table)
- 심볼테이블
  - 변수가 만들어지면 변수를 관리하는 테이블에 변수 정보(변수의 이름+메모리상의 주소)가 저장된다


## ch4. 자료형(DataType)의 이해

### 1-2.자료형의 종류
- Class라는 개념이 자료형에서 나온다.
- 사용자정의자료형과 객체(Object, class)와의 관계를 이해하는 것이 목표
- class는 새로운 자료형(객체자료형, 사용자정의자료형)을 만드는 도구이다.

    ```jsx
    java.lang.String == java.lang(lang패키지는 생략 가능).String
    ```

### 3-6.기본자료형과 문자자료형 / 수의표현 (BinaryTest.java, BinaryExam.java, CharTest.java)

- 아스키(ASCII)코드 : 전세계 공통 문자에 대한 약속, 영어를 숫자로 맵핑, 20~127까지(128개의 문)
- 유니코드(UTF8) : 비영어권의 문자를 아스키코드로 표현하기 어렵기 때문에 유니코드를 사용한다  , 2byte크기로 데이터를 저장할 수 있다,0~65,535까지(65,536개의 문자), \uXXXX = 네 개의 *16진수* 문자(또는 숫자)*로 표현*되는 *Unicode* 문자 (ex> ‘가’ = 44032 = \uAC00) ***자바의 char type은 2byte로 되어있어 유니코드 저장이 가능하다**
### 7.형변환 (CastingTest.java)

**형변환이란?**

값의 타입(DataType)을 다른 타입으로 변환하는 것

- 자동형변환(묵시적) : 작은type이 큰type에 저장되는 경우 (예:byte→int)
- 강제형변환(명시적) : 타입을 강제로 맞춘다→ `(DataType)변수` 형태로.  (예:int→byte, float→int.소수점 손실발생 가능성), boolean은 형변환이 안된다

## ch5. 객체와 클래스

- 객체지향프로그래밍은 class를 이용해 사용자정의자료형을 만들어 사용하는 것 ( class는 새로운 자료형을 만드는 모델링 도구)

### 1. 사용자정의 자료형이 필요한 이유

- 객체를 변수에 저장하기 위해서는 **사용자정의자료형**이 필요하다

### 2. 객체와 클래스의 이해

- 객체는 여러개의 구조(변수)로 이루어진 데이터이다
- class : 사용자정의자료형을 만드는(설계하는, 모델링하는) 도구

### 3. 객체를 생성(사용)하는 방법
** 실습 : Book.java, BookTest.java, BookExam.java, Member.java, MemberTest.java

1. **Book클래스(설계도, 객체) 생성**

```java
public class Book {
		// 클래스 안에 만들어지는 변수 = 속성, 멤버변수, 프로퍼티, 상태변수
    public String title;
    public int price;
}
```

2. **변수를 선언(객체변수, 아무것도 가르키지 않은 상태)**

```java
Book b;
```

3. **객체를 생성** : new 생성연산자와 Book(); 생성자 메소드를 이용하여 메모리에 설계도를 등록, 이제 Book객체를 번지로 찾을 수 있다

```java
new Book(); // instance, 번지를 가리킴 
```

4. **생성된 객체를 연결**(저장, 인스턴스변수)

```java
b = new Book(); // b(인스턴스변수)는 Book의 번지를 가지고 있다
// Book b = new Book();
```

5. **접근은 도트연산자(=참조연산자)를 사용**하여 할 수 있다

```java
b.title // "자바의 정석"
b.price // 30000
```
