package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.QuestionService;


@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
    	for(int i=1; i<300; i++) {
    		this.questionService.create(String.format("%d번째 제목 테스트데이터입니다", i), String.format("%d번째 내용 테스트데이터입니다", i), null);
    	}
    }
}