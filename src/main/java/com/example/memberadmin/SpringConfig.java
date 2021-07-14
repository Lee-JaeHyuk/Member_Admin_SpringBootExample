package com.example.memberadmin;

import com.example.memberadmin.repository.JpaMemberRepository;
import com.example.memberadmin.repository.MemberRepository;
import com.example.memberadmin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {


    // 1. JPA 활용
    /*
    private final DataSource dataSource;
    private final EntityManager em;

    @Autowired
    public SpringConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }*/


    // 2. Spring Data JPA 활용
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) { this.memberRepository = memberRepository; }

    @Bean
    public MemberService memberService(){return new MemberService(memberRepository);}


}
