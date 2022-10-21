package com.pwm.introspection;

public class Study {
    public static void main(String[] args) {
        // 웹개발 하며 알게된것, 배웠으나 몰랐던것, 까먹었던것 등등

        //Mysql,maria-db

        //Mysql,maria_db - CURRENT_TIMESTAMP() : 특정 행을 입력할때 자동 생성 시간을 넣어 두고 싶을 때 자동으로 입력됨.
        //Mysql,maria_db - unique : 해당 필드에는 더 이상 중복된 값을 저장 x
        //Mysql,maria_db - unsigned : 음수를 포함 x 혹은 양수를 더 넓게 사용 가능하게 만들어줌. 예시: -21억 x , + 42억 O
        // auto-increment(자동으로 num 값 증가) 을 사용할때 쓰기 좋다.
        //Mysql,maria_db - NOW() : 현재 시간을 가져온다.

        //Html

        //th:fragment : header, footer 를 쓰기 위해 사용한 타임리프
        //form : 사용자의 의견이나 정보를 알기 위해 입력할 큰 틀을 만드는데 사용. 폼은 입력된 데이터를 한 번에 서버로 전송.
        //form 의 속성 : id : javascript 에서 접근 목적. 현 페이지에서 한 개만이 유효 == Javascript
        //class : js에서도 접근이 가능하지만, 일단은 css에서 디자인적인 요소인 경우가 많다. == css 쪽에서 주로 사용, 현 페이지에서 다중으로 설정이 가능하다.
        //h2 : 제목

        //back-end

        // Interface Mapper : Mapping 파일에 기재된 SQL 을 호출하기 위한 인터페이스
        // Mapping 파일에 있는 SQL 을 자바 인터페이스를 통하여 호출할 수 있도록 해준다.

        // MyBatis Mapper XML (SQL Mapping XML) File 은 실행할 SQL 문을 정의해 놓은 파일.
        // SQL 문 실행을 위해 Parameter Object 를 받아오거나 SQL 문 실행 결과를 Result Object 에 자동 바인딩하는 기능 등을 제공한다.
        //@RequestMapping : 특정 uri 로 요청을 보내면 Controller 에서 어떠한 방식으로 처리할지 정의를 한다. 이때 들어온 요청을 특정 메서드와 매핑하기 위해 사용하는 것이 @RequestMapping 이다.

        // @Autowired : 의존성 주입을 할 때 사용하는 Annotation 으로 의존 객체의 타입에 해당하는 bean 을 찾아 주입하는 역할을 한다.

        //@SessionAttribute("myData")의 의미 -. 특정 컨트롤러 클래스에 @SessionAttribute 가 선언되어 있으면
        //해당 Controller 클래스의 특정 메소드에서 "myData"라는 이름으로
        // Model 객체에 저장되는 데이터가 있다면 그 데이터를 세션(HttpSession)에도 자동으로 저장하라는 어노테이션이다.

        //@...(required = false) : required 속성을 추가하면 해당 필드가 쿼리스트링에 존재하지 않아도 예외가 발생하지 않습니다.

        //MyBatis Mapper(Mapper.xml) :

        // useGeneratedKeys 속성을 사용할 때 keyColumn, keyProperty 속성이 같이 쓰입니다.
        // useGeneratedKeys : insert(db 값에 넣는) autoincrement 가 걸린 PK(프라이머리) 값을 바로 사용하기 위해 사용.
        // keyColumn : [PK 컬럼명] 예 : index
        // keyProperty : [매핑할 변수명]
        // resultType : select 된 데이터를 반환할 (그릇)을 정해주는것 위의 코드같은경우엔 StockNewsVO 객체에 담긴다
        // (예 : Mapper.xml 에서 select 를 사용 할때)
        //parameterType : 자바에서 String 값이 들어올거란걸 인지시켜주고 , 쿼리에서 자바에서 보낸 stk_nm을 사용한다
        // (예 : Mapper.xml 에서 insert 를 사용할 때)
        // delete : 예) 게시물을 삭제 하고싶을때 사용한다.
    }
}
