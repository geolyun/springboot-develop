package org.geolyun.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}

// 이 인터페이스는 DB에서 데이터를 가져오는 퍼시스턴트 계층 역할