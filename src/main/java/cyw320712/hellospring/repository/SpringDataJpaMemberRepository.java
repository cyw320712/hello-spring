package cyw320712.hellospring.repository;

import cyw320712.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //JPQL: select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
