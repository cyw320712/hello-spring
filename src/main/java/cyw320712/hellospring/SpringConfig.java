package cyw320712.hellospring;

import cyw320712.hellospring.aop.TimeTraceAop;
import cyw320712.hellospring.repository.JpaMemberRepository;
import cyw320712.hellospring.repository.MemberRepository;
import cyw320712.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private  final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    @Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }
//    @Bean
//    public MemberRepository memberRepository(){
//        return new MemoryMemberRepositor();
//        return new JpaMemberRepository(em);
//    }
}
