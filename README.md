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

## ch6. 배열의 이해

### 데이터를 이동하는 배열-array

- 1차원배열 - 리스트, 선형구조, 연속적
- 2차원배열 - 테이블구조
- 배열의 선언

```java
int[]a; 
String[]s;
Book[]b;

```

- 배열이 없다면?
    - 갯수가 늘어나면 선언이 불편하다
    - 반복문 사용이 어렵다
    - 메소드의 파라미터로 사용될 경우 불편하다

### 배열을 사용하는 방법

- 배열은 서로 인접해있는 **연속된 기억공간**을 가지고, **동일한 데이터**(클래스와의 차이점)를 여러개 저장할 수 있는 순차 자료구조, **배열또한 객체**, 변수들의 집리
- 배열 생성 방법

```java
int[]a; // 1. 변수 선언

new int[3]; // 2. 객체 생성

a = new int[3]; // 3. 변수에 객체를 연결

// 한줄로
int[]a = new int[5]; 
```

- 길이 구하기와 반복문

```java
int[]a = new int[5]; 
a.length // 5

for(int i=0; i<a.length; i++){
	a[i]=10;
}	
```

- 기본 배열 초기화

```java
## 1. 배열은 생성과 동시에 각 기억공간에 0이 들어있다
new int[5] // [0,0,0,0,0]

## 2. 생성과 동시에 초기화가 가능하다 (일반적으로 사용됨)
int[]a = {10,20,30,40};

## 3. 선언 후 초기화할 때는 new연산자를 사용하고 int[5]이런식으로 숫자를 넣지 않는다
int[]a;
a = **new** int[]{1,2,3,4,5};
```

- 객체배열초기화

```java
Book[]b = new Book[3]; // 객체배열

b[0] = new Book();
b[0].title = "book1";

b[1] = new Book();
b[1].title = "book2"; 

b[2] = new Book();
b[2].title = "book3"; 

for(int i=0; i<b.length; i++{
	System.out.println(b[i].title)
}
```

### 2차원배열 (테이블구조, 행렬)

- 영상에서 이미지 처리시 주로 사용된다
- 2차원배열 생성

```java
int[][]a=new int[2][4]; // int[][]a=new int[행][열];
```

- 행우선(row-major) 메모리 저장 → 2차원배열도 연속적 자료구조(1차원배열)로 저장된다
- length접근

```java
a.length // 2 (2차원배열이다)
a[0].length // 4 -> a의 첫번째 행은 길이가 4개이다
a[1].length // 4 -> b의 첫번째 행은 길이가 4개이다
```

- 접근방법

```java
a[행][열]
```

### 다차원배열

- 다차원배열의 초기

```java
int[][]a = {{1,2,3,4},{5,6,7,8}}
```

- 가변길이의 배열

```java
int[][]b = new int[5][];
        b[0] = new int[1];
        b[1] = new int[2];
        b[2] = new int[3];
        b[3] = new int[4];
        b[4] = new int[5];

for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }

결과
*	
*	*	
*	*	*	
*	*	*	*	
*	*	*	*	*
```


## ch7. 연산자와 명령문
- Scanner활용

    ```java
    import java.util.*;
    public class ScannerTest {
    
        // 키보드 == (스트림, 통로, 빨대) ==> 자바
        // 1. 입력스트림  : System.in(인풋스트림)
        // 2. 출력스트림
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("정수를 입력하세요");
            int num = scan.nextInt(); // 블럭상태
            System.out.println("num = " + num);
    
            System.out.println("실수를 입력하세요");
            float f = scan.nextFloat();
            System.out.println("f = " + f);
    
            System.out.println("문자열를 입력하세요");
            String str = scan.next(); // 공백이 있을 경우 공백앞까지 가져옴
            System.out.println("str = " +str);
    
            // 위의 next()는 공백 앞까지만 가져오기 때문에 스트림(통로)에는 아직 공백 뒤의 문자열과 enter가 남아있다
            // 남은 문자와 enter가 아래의 nextLine()과 만나면 의도치 않게 남아있는 문자가 출력되어버리므로 버퍼 비우기
            scan.nextLine();
    
            System.out.println("문자열를 입력하세요");
            String str2 = scan.nextLine(); // 문자열 한줄을 가져옴
            System.out.println("str2 = " +str2);
    
            scan.close();
        }
    }
    ```


- **연산자의 종류**
    - 단항 연산자 (증가연산자++, 감소연산자 --)
      전위(++a, --a) : 증감 후 값을 사용
      후외(a++, b--) : 값을 사용한 후 증감
    - 이항 연산자 a+b
    - 삼항 연산자 a>0 ? true일 경우 값 : false일 경우
    - 산술연산자 + - * / %  // 실습 ArithmeticOperTest.java
    - 관계연산자 < >  >= == !== instanceof // 좌항과 우항의 대소관계를 비교한다, 결과는 true 또는 false
    - 논리연산자

        ```java
            && 논리곱 연산 : 둘 다 참이어야 참
            || 논리합 연산 : 하나라도 참이면 참
            !(NOT) 논리부정 연산 : 참이면 거짓, 거짓이면 참
        ```

    - 복합대입(*)연산자 +=, -=, *=, /=, %= //산술연산자+대입연산자, 자신과 값을 연산 후 대입 (누적)
- **명령문의 종류**
    - if  : 조건식이 참이면 블럭의 코드가 실행
    - if-else : 조건식이 참이면 if블럭의 코드가 거짓이면 else블럭의 코드가 실행
    - if(a)-else if(b)-else if(c)-else : 조건식a가 참이면 if블럭, 조건식 a가 거짓이고 b가 참일때 else if(b)블럭, 조건식 a,b가 거짓이고 c가 참일때 else if(c)블럭, 모두 거짓일 때 else블럭 실행
    - switch-case : 주로 다중 선택에 사용, 다중 if문보다 간결한 대신, 사용 영역이 if-else에 비해 제한적이다

        ```java
            switch (수식){
                        case "상수1":
                            break; // 탈출, 없을 경우 다음 case문까지 연속 실행
                        
                        case "상수2":
                            // .. 
                            break;
                        
                        default: // 조건과 일치하는 case가 없을 경우 기본 실행 코드
                    }
        ```

    - 반복문(loop)
        - for(초기식; 조건식; 증감식) {..} : 조건식이 참일동안 블럭 내 코드 반복
        - for(변수 : 컬렉션){..} : 데이터를 하나씩 꺼내온다

            ```java
                int[] nums = {1,2,3,4,5};
                
                for(int su : nums) {
                	System.out.print(su); //12345 
                }
            ```

        - while : 먼저 조건식 검사 후 반복할 문장을 실행

            ```java
                int i = 0; // 초기식;
                
                while(i <= 5){ //조건식
                	System.out.print(i);
                	i++; //증감식;
                } // 조건이 거짓이면 탈
            ```

        - do-while : 반복할 문장을 한 번 실행 후 조건식에 따라 반복

            ```java
                초기식;
                
                do{
                ...
                } while(조건식);
            ```

        - 이중 for문 : 반복문 안에 또다른 반복문, 중첩반복

            ```java
                for (int i = 0; i < b.length; i++) {
                        for (int j = 0; j < b[i].length; j++) {
                            System.out.print("*"+"\t");
                        }
                    } 
            ```

    - break, continue (반복문의 실행 상태를 제어)
        - break : 반복문을 중단하고 반복문 바깥으로 이동

            ```java
                //Q. char[ ] c={‘s’,’h’,’u’,’t’,’d’,’o’,’w’,’n’};
                // 위 배열의 값을 출력 중 ‘o’라는 문자를 만나면 반복을 중지하세요.
                
                        char[ ] c={'s','h','u','t','d','o','w','n'};
                        for (int i = 0; i < c.length; i++) {
                            if(c[i] =='o') break;
                            System.out.print(c[i]); // shutd
                        }
            ```

        - continue : 현재 반복문에서 처리를 중단하고 다음 조건값에 대한 반복문 처리를 수행

            ```java
                //Q. 1~10까지의 수 중 3의 배수의 개수를 구하여 출력하세요.
                        int count=0;
                        for (int i = 1; i <= 10; i++) {
                            if(i%3 != 0) continue;
                            count++;
                        }
                        System.out.println("count : " + count); // 3
            ```

## ch8. 메소드

### 메소드란?
(실습 MethodMakeTest.java)
- **객체가 가지고 있는 동작**(기능)
- 반복적인 동일작업을 메소드를 만들어 사용하면 편리하다
- 객체지향 프로그램은 객체가 가지고 있는 메소드는 각각 독립적이나 데이터를 서로 주고받으며 상호작용을 한다
- 메소드는 크게 API에서 제공해주는 메소드와 사용자 정의 메소드 두종류로 구분
- 메소드는 **정의**하고 **호출**을 하여 사용된다
- 작은단위(모듈)로 만들어 추후 통합하여 사용하는것이 좋다 → 유지보수에 용이

    ```jsx
      public    int     add   (int x, inty) { // **정의부(Head) / 원형(prototype)**
    접근제한자 리턴타입 메소드명  입력값
    		...수행작업(블랙박스)             // **구현부(Body)**
    		return
    }
    ```

- 함수 이름이 변수 역할을 한다 (처리 후 결과값을 담는다)
- 실인수(호출쪽)과 가인수(선언쪽)는 타입과 갯수가 같아야 한다
- 클래스 내에서 독립적으로 만들어야 한

### 매개변수 전달기법 (parameter passing)
(실습 CallByReference.java)
- Call By Value(값 전달)
    - 변수의 값을 **복사**하여 함수의 인자로 전달
    - 기본 자료형 (int, short, long, float, double, char, boolean)
- Call By Reference(번지 전달)
  - 함수 안에서 인자의 값이 변경되면, 원 변수들도 값이 바뀐다.
  - 참조 자료형 (Array, Class Instance)

### 메소드의 오버로딩(Overloading)
(실습 OverloadingTest.java)
- 하나의 클래스 내에서 동일한 이름의 메소드를 여러개 사용할 수 있다
- 전제조건 → 시그니처(매개변수의 갯수 또는 타입)달라야 한다
- 컴파일 시점에서 여러 같은 이름의 메소드 중 사용될(호출될) 메소드가 결정(연결)되는 **정적 바인딩**을 사용하므로 성능 저하되지 않는다
- 예를들어 System.out.println()의 매개변수로 int, float, string등 다양한 타입의 매개변수를 넣어도 동일하게 콘솔에 출력되는 이유는 오버로딩으로 각 타입별 함수를 미리 정의해두었기 때문 → **사용이 편리해진다** (만약 오버로딩이 되지 않는다면 각각 다른 메소드명으로 호출해야 하므로 번거로움)

---
# 객체지향 프로그래밍

## ch1. 클래스로 객체 모델링

- 객체 = Model = Value Object = Data Transfer Object
    - 사용자정의 모델(데이터)을 변수에 저장하기 위해서는 사용자정의 자료형이 필요하다
    - 객체는 Heap Memory에 저장된다
- 클래스 = 객체를 설계, 모델링하는 도구
    - **자료형 측면** : 새로운 자료형을 만드는 도구
    - **객체지향 측면** : 현실세계에 있는 객체를 객체지향 프로그램에 사용하기 위해 객체의 상태정보(멤버변수)와 행위정보(멤버메서드)를 뽑아서 설계하는 도구, 캡슐화 도구
- 객체 생성 과정의 이해
    - 모델링 된 객체를 사용하기 위해서는 메모리에 객체를 생성 해야한다
    - 1.변수를 선언. 객체 자료형은 4byte로 정해져있으며 객체 변수에는 **번지가 저장**된다

        ```java
        Person P;
        4byte  번지가 저장
        ```

    - 2.객체를 생성 (메모리에 저장) : new연산자와 생성자 메소드를 이용

        ```java
             new Person(); // 인스턴스(instance)
        new연산자 생성자메소드
        ```

    - 3.생성된 객체를 변수에 할당

        ```java
        Person p = new Person();
         p가 인스턴스변수가 됨
        ```

- 생성자메소드
    - 객체의 초기화를 위해 사용된다
    - 모든 클래스는 생성자를 만들지 않더라도 기본생성자(default constructor)를 가지고 있다. 보이지 않더라도 생략이 되어있는 것
    - new 연산자에 의해 호출된다
    - 자신이 가지고 있는 멤버들을 **메모리에 저장(생성)하는 역할**을 한다
    - 리턴타입이 없다
    - 메소드 이름은 클래스명과 동일해야한다
    - 접근제한자가 public인 경우에만 호출된다
- this
    - 객체가 생성되면 this도 자동으로 생성된다. 자기 자신의 번지를 가리키는 객체변수, 참조변수, 포인터변수

## ch2. 클래스의 종류 (클래스로 만들 수 있는 모델의 종류)

(실습 BookTest.java)

- 모델이란?
    - 클래스를 역할에 따라 부르는 이름
    - 역할에 따라 다양한 모델을 만들어 사용할 수 있다

    0.  시작클래스 : main클래스

    1. DTO, VO 모델 : 데이터를 담는 모델
    2. DAO 모델 : 데이터를 처리(DB)하는 모델, CRUD역할
    3. Utility 모델 (Helper model): DTO와 DAO이외 필요에 의해 추가로 만든 모델
- **DTO, VO 모델**
    - 객체 데이터를 하나로 수집하는 역할
    - DTO나 VO를 사용하지 않으면 매개변수 여러개를 보낼 때 비효율적
    - DB에 있는 데이터를 프로그램에서 가져와서 사용할 경우 유용
    - call by reference에 이용됨 (**DTO객체를 함수의 매개 변수로 넘길 경우, 해당 DTO객체는 힙 영역의 객체를 가리키고 있으며 함수내에서 객체를 조작할 경우 힙영역의 객체를 조작하는 것이 된다)
- **DAO 클래스 (Data Access Object)**
    - CRUD동작을 가지고 있는 클래스, 비즈니스 로직을 처리한다 (≠ DTO는 로직이 없다)
- **Utility 클래스**
    - 반복적으로 사용되는 기능을 별도의 클래스로 만들어놓는것
    - 예를들면 java.util 패키지
    - 날짜, 통화, 시간정보, 인코딩, DAO이외의 별도기능(→main메서드와 분리해서 별도의 클래스로 만든다 → 다른 클래스에서도 사용 가능 )

## ch3. 접근권한

- 접근제어란 (Access Modifier)
    - 객체(클래스) 상호간에 접근을 제어하는 방법
    - 클래스와 클래스 내부의 멤버에 접근 제한자를 사용할 수 있다
    - **public** : 모든 패키지에서 접근가능 (클래스나 메서드(행위정보는 상호작용을 해야하기 때문에)는 public이 일반적)
    - **private** : 모든 패키지에서 접근불가 (자기 자신만 접근 가능, 일반적으로 멤버변수(상태정보)는 private, 다른 클래스에서 사용하려고 하면 에러, 같은 클래스에 메소드를 만들어 다른 클래스에서 private변수를 제어할 수 있다)
    - **protected** 상속관계에서 하위클래스에서 상위클래스 접근가능
    - **default** 동일한 패키지에서만 접근가능 (접근제어자 생략시 기본값)
- **패키지란**
    - 서로기능이 비슷한 클래스들끼리 모아서 관리를 쉽게 하기 위해서 사용(폴더개념)
    - 패키지 외부에서 클래스의 접근을 할 수 없도록 하기 위해서 사용(보안측면)
    - 자바에서 제공해주는 API도 패키지의 형태로 배포된다.
    - 자바에서 제공해주는 대표적인 패키지들
        - java.lang (default package)
        - 자바에서 자주 사용하는 클래스(String, System 등)
        - [java.io](http://java.io/) 입출력 관련 클래스(InputStream 등)
        - [java.net](http://java.net/) 네트워킹 관련 클래스
        - java.util 도움을 주는 클래스(Scanner 등)
        - java.sql 데이터베이스 관련 클래스, SQL
        - java.math 수학관련 클래스
- 클래스 접근 방법
    1. class full-name 이 (java.lang.String)
    2. import를 이용 (import java.lang.*; )

## ch4. VO클래스

- **정보은닉이란?** 다른 객체에게 자신의 정보를 숨기고 자신의 동작, 기능, 연산만을 통해 접근을 허용하는 것, 클래스 외부에서 특정 정보 (상태정보)에 접근을 막는다는 의미
- 은닉된(private) 멤버에 접근하는 방법
    1. private으로 은닉된 변수는 **setter/getter메소드로 접근**이 가능하다
        - 메소드를 사용하는 이유 : 로직 수행을 통해 데이터 검증이 가능하다
    2. **생성자 메소드**를 이용한 객체 초기화
        1. default 생성자
        2. 생성자 메소드 오버로딩Overloading을 이용하여 객체 생성시 원하는 값으로 초기화하기 , ** default생성자는 원래 클래스 생성시 자동으로 만들어진다. 다만, 오버로딩된 생성자메소드를 선언할 경우 기본생성자는 자동 생성 되지 않는다 → 필요할 경우 기본생성자를 선언하여 사용, 일반적으로 만들어놓는 것이 좋다
    3. **toString() 메소드** - 객체가 가진 모든 변수의 값을 문자열로 출력하는 용도
        1. 변수만 호출해도 toString(); 리턴값이 출력됨 (단, VO내 toString()이라는 이름의 메소드가 있을 경우만) (vo.toString() == vo)

    ```java
    public class PersonVO {
        private String name;
        private int age;
        private String phone;
    
    		// 1. getter and setter
        public String getName() {
            return name; // this.name; // 중복되는 변수가 없을 경우 this는 생략 가능
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        .. more getter and setter
    
        // 2-a. default 생성자
        public PersonVO(){
            // 초기화 동작을 넣어준다
            this.name = "홍길동";
            this.age = 30;
            this.phone = "010-0000-0000";
        }
    
        // 2-b. 생성자메소드를 오버로딩 - 원하는 값으로 초기화
        public PersonVO(String name, int age, String phone){
            this.name = name;
            this.age = age;
            this.phone = phone;
        }
    		
    		// 3. toString()
        public String toString() {
            return "name='" + name + "', age=" + age + ", phone='" + phone +"'";
        }
    }
    ```

    ```java
    import fc.java.model.PersonVO;
    
    public class Person {
        public static void main(String[] args) {
    
            // vo.name // 에러. PersonVO의 멤버변수 name은 private으로 선언되었기 때문에 직접 접근이 되지 않음(정보은닉)
            // 1. getter와 setter를 사용한 private변수 접근
    				PersonVO testVO = new PersonVO();
            testVO.setName("김테스트");
            System.out.println("name : "+ testVO.getName());
    
            // 2-a. default 생성자메소드를 이용한 초기화
    				PersonVO vo = new PersonVO();
            System.out.println("2-a. default 생성자메소드를 이용한 초기화 : " + vo.getName());
    
            // 2-b. 생성자 메소드 오버로딩
            PersonVO vo1 = new PersonVO("은비",2,"010-0000-0000");
            PersonVO vo2 = new PersonVO("까비",2,"010-1111-1111");
    
            System.out.println("2-b. vo1.getName() = " + vo1.getName());
            System.out.println("2-b. vo2.getName() = " + vo2.getName());
    
            // 3. toString() 메소드 (strVO.toString() == strVO)
            PersonVO strVO = new PersonVO();
            System.out.println("3-1. stVO.toString() = " + strVO.toString());
            System.out.println("3-2. strVO : " + strVO); 
    
        }
    }
    
    결과
    // 1. name : 김테스트
    // 2-a. default 생성자메소드를 이용한 초기화 : 홍길동
    // 2-b. vo1.getName() = 은비
    // 2-b. vo2.getName() = 까비
    // 3-1. stVO.toString() = name='홍길동', age=30, phone='010-0000-0000'
    // 3-2. strVO : name='홍길동', age=30, phone='010-0000-0000'
    ```

- 잘 설계된 VO클래스
    1. 모든 상태 정보를 정보 은닉 (private)한다
    2. 디폴트 생성자를 만드는게 좋다
    3. 생성자 메소드를 오버로딩하여 객체를 초기화한다
    4. setter/getter메소드를 만든다
    5. toString()메소드를 만든다

## ch5. 배열과 클래스의 관계

배열(Array)과 클래스(class)는 데이터를 담는 역할에는 같지만 만들어지는 구조는 서로 다르다. **배열은 동일한 데이터를 담는 구조**이며 **클래스는 서로 다른 데이터를 담는 구조**

- 일반배열과 객체배열의 초기화

```java
int[] a = new int[2];
a[0] = 1;
a[1] = 2;

Student[] s = new Student[2];
s[1] = new Student("학생1","컴공",22,"one@mail.com");
s[0] = new Student("학생2","피아노",23,"two@mail.com");
```

## ch6. static과 JVM메모리 모델

- **main클래스 동작 방식**
    1.  JVM이 실행할 클래스를 찾는다.
    2. static 키워드가 붙어있는 멤버들(예를들면 메인메소드)을 클래스를 사용하는 시점에 Method area → static-zone에 딱 한 번 자동으로 로딩한다
    3. JVM이 static-zone에서 main()메서드를 호출한다.
    4. 호출된 메서드를 Call Stack Frame Area(Stack Area)에 push(기계어코드를 넣고) 한 뒤 동작을 시작한다.

    ```java
    public class StaticTest{
                public **static** void main(string[] args){
                    int a=10;
                    int b=20;
                    int sum= StaticTest.hap(a,b);
                    System.out.println(sum);
    
                }
                public **static** int hap(int a, int b){
                    int v=a+b;
                    return v;
                }
            }
    ```

  ** 같은 area에 있는 메소드만 호출이 가능하다 (위의 예제에서는 메인메소드와 hap메소드가 static으로 선언되어 같은 static-zone에 있기 때문에 메인에서 hap호출이 가능하다. hap();이 static으로 선언되지 않았다면(non-static) main();에서 사용 불가)

- **non-static메소드 접근 방법**
    - 객체를 생성하여 메모리에 로딩시킨다 (new연산자로 Heap area에 생성하고 그 번지를 Method area내의 non-static-zone에 저장한다)
        - Heap area : 생성된(new) 객체 저장
        - Method Area
            - static area : static멤버가 저장
            - non-static area : Heap area에 저장된 객체 멤버 메소드의 번지를 저장
        - Stack area : 메소드가 호출되면 수행에 필요한 만큼(지역, 매개변수)의 메모리를 임시 할당, LIFO

```java
public class NoneStaticTest{
            public **static** void main(string[] args){
                int a=10;
                int b=20;

								// 1. 같은 클래스의 인스턴스 메소드 호출
								NoneStaticTest st = **new NoneStaticTest();** // 객체를 heap에 저장하고 멤버 메소드의 번지를 Method area에 저장
                int sum= NoneStaticTest.hap(a,b); // Method area > non-static area의 hap 메소드를 호출
                System.out.println(sum);
								
								// 2. 다른 클래스의 클래스 메소드(static) 호출 
								int sum= MyUtil.hap(a,b); // new연산으로 인스턴스화 하지 않음 

								// 3. 다른 클래스의 인스턴스 메소드 호출 
								MyUtil1 my=new MyUtil1();
								int sum= MyUtil.minus(a,b);
            }

            public int hap(int a, int b){
                int v=a+b;
                return v;
            }
        }
--------------------------------------------------------------
public class MyUtil{
            public **static** int hap(int a, int b){ // 클래스 메소드 
                int v=a+b;
                return v;
            }

            public int minus(int a, int b){ // 인스턴스 메소드  
                int v=a-b;
                return v;
            }
        }
```

정리 : 자주 사용하는 메소드의 경우 static으로 선언하여 클래스를 인스턴스화하지 않고 바로 사용할 수 있다. static으로 선언되지 않은 메소드의 경우 new연산을 이용하여 객체를 생성 후 멤버 메소드 사용이 가능하다

- **JVM이 사용하는 메모리 영역**
    - Method Area
        - 메서드의 바이트코드(기계어 코드)가 할당되는 공간
          static-zone과 none-static-zone으로 나누어진다.
          static멤버들은 static-zone에 할당된다.
    - Heap Area
        - 객체가 생성되는 메모리 공간(new연산자)
        - 스택 영역은 함수 실행이 끝나면 자동으로 청소가 되지만 Heap영역은 자동 정리되지 않는다. 사용되지 않는 객체는 주기적으로 가비지 컬렉터(garbage collector)가 정리 해준다
    - Stack Area (Call Stack Frame Area) - thread마다 독립된 Stack영역이 존재
        - 메서드가 호출 되면 메서드의 기계어코드를 할당 받고(Native Method Area) 메서드가 실행 되는 메모리공간(Call Stack Frame Area)
          ( 지역변수, 매개변수들이 만들어지는 공간)
        - PC(Program Counter)에 의해서 현재 실행중인 프로그램의 위치가 관리된다.
        - LIFO구조로 운영이 되는 메모리공간 (메서드의 호출 순서를 알 수 있다)
    - Constant Pool(Literal Pool) - Runtime시점
        - 상수 값 할당이 되는 메모리 공간
        - 문자열 중 문자열 상수(Literal : 리터럴)가 할당 되는 메모리 공간
          -생성자를 private으로 선언할 경우 객체를 생성할 수 없다. **모든 멤버가 static인 경우**는 객체를 생성하지 않아도 멤버에 접근 할 수 있기 때문에 **객체 생성을 막고 싶을 경우 생성자를 private으로 선언**한다. (예를들면 Math, System클래스)

```java
    public class MyUtil{
    		// 생성자를 private으로 선언
    		**private MyUtil(){ }**
    
        public **static** int hap(int a, int b){ 
            int v=a+b;
            return v;
        }
    
        public **static** int minus(int a, int b){ 
            int v=a-b;
            return v;
        }
    }
    
    --------------------------------------------------------------
    
    public class NoneStaticTest{
        public static void main(string[] args){
            int a=10;
            int b=20;
    
            // MyUtil1 my = new MyUtil1(); // 생성자가 private이기 때문에 객체 생성이 안된다 
            int sum= MyUtil.hap(a,b); // 객체를 생성하지 않았지만 static 메소드는 접근이 가능하다  
      }
```

- **Class, Object, Instance의 관계 (모두 객체를 나타냄)**
    - 클래스(Class) : 객체를 모델링 하는 도구(설계도), 새로운 자료
    - 객체 변수(Object) : 클래스를 통해서 선언되는 변수, 아직 가리키지 않은 상태
    - 인스턴스 변수(Instance) : 구체적인 실체를 가리키는 상태, 객체가 서로 구분 되는 시점