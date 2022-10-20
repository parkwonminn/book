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


        //back-end

        // Interface Mapper : Mapping 파일에 기재된 SQL 을 호출하기 위한 인터페이스
        // Mapping 파일에 있는 SQL 을 자바 인터페이스를 통하여 호출할 수 있도록 해준다.

        // MyBatis Mapper XML (SQL Mapping XML) File 은 실행할 SQL 문을 정의해 놓은 파일.
        // SQL문 실행을 위해 Parameter Object 를 받아오거나 SQL 문 실행 결과를 Result Obejct 에 자동 바인딩하는 기능 등을 제공한다.

        // @Autowired : 의존성 주입을 할 때 사용하는 Annotation 으로 의존 객체의 타입에 해당하는 bean 을 찾아 주입하는 역할을 한다.

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
