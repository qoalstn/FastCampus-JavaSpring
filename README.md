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
