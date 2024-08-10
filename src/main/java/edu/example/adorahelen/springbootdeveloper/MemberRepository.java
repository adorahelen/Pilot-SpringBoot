package edu.example.adorahelen.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface MemberRepository extends JpaRepository<Member, Long> {

    }

// 인터페이스 형식으로 구현되어 있는 이유는 JPA를 사용하고 있기 때문이다.
// 따라서 쿼리를 사용할 필요가 없다. (extends JpaRepository를 보아라)


