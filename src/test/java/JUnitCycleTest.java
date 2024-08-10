import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll // 테스트를 시작하기 전에 처음으로 한번만 실행
    // 데이터베이스 연결, 테스트 환경 초기화시 사용
    static void beforeAll() {
        System.out.println("@BeforeAll");
    }
    @BeforeEach
    // 테스트 케이스를 시작하기 전에 ㅁ매번 실행된다.
    // 메서드에 사용하는 객체를 초기화하거나 테스트에 필요한 값을 미리 넣을 떄 사용
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }
    @Test
    public void test1() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
    @Test
    public void test3() {
        System.out.println("test3");
    }

    @AfterAll
    // 전체 테스트를 마치고 종료하기 전에 한번만 실행한다.
    // 데이터베이스 연결을 종료할떄나 공통적으로 사용하는 자원을 해제할 때 사용한다.
    static void afterAll() {
        System.out.println("@AfterAll");
    }
    @AfterEach
    // 각 테스트 케이스를 종료하기 전 매번 실행한다.
    public void afterEach() {
        System.out.println("@AfterEach");
    }

    // 비포 이치랑, 애프터 이치는 테스트 개수만큼 반복하고  (테스트 어노테이션 3개니까 세번)
    // 비포 올이랑 애프터 올은 테스트 3개 돌리기 전과 후에 딱 한번씩만 수행되고 끝
}
//@BeforeAll
//@BeforeEach
//test1
//@AfterEach
//@BeforeEach
//        test2
//@AfterEach
//@BeforeEach
//test3
//@AfterEach
//@AfterAll