package edu.example.adorahelen.springbootdeveloper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
// 스프링부트 애플리케이션이 있는 클래스를 찾고, 클래스에 있는 빈을 찾고, 테스트용 컨텍스트를 생성
@AutoConfigureMockMvc
// 서버에 배포하지 않고, 테스트용 환경을 만들어 요청/전송/응답 기능 제공함 (컨트롤러 테스트용)
class TestControllerTest {
// MVC처럼, 3패턴 구성으로 테스트 코드를 작성한다. Given-When-then
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext context;
    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    public void mockMvcSetup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build(); }

    @AfterEach
    public void cleanup() {
        memberRepository.deleteAll();
    }


    @DisplayName("getAllMembers : Is that success SELECT Article")
    @Test
    public void getAllMembers() throws Exception {
        // Given
        final String url = "/test";
        Member saveMember = memberRepository.save(new Member(1L, "홍길동"));

        // When
        final ResultActions result
                = mockMvc.perform(get(url).accept(MediaType.APPLICATION_JSON));

        // then
        result
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(saveMember.getId()))
                .andExpect(jsonPath("$[0].name").value(saveMember.getName()));
    }
}