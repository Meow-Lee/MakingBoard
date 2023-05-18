package com.example.MakingBoard;

import com.example.MakingBoard.Answer.Answer;
import com.example.MakingBoard.Question.Question;
import com.example.MakingBoard.Answer.AnswerRepository;
import com.example.MakingBoard.Question.QuestionRepository;
import com.example.MakingBoard.Question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MakingBoardApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private QuestionService questionService;

	@Autowired
	private AnswerRepository answerRepository;

//	@Test
//	void testJpa(){
//		Question q1 = new Question();
//		q1.setSubject("게시판이 무엇인가요?");
//		q1.setContent("잘모르겠어요");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//
//		Question q2 = new Question();
//		q2.setSubject("스프링 어려워요?");
//		q2.setContent("흑흑");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
//	}
//
//	@Test
//	void test1(){
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size());
//
//		Question q = all.get(0);
//		assertEquals("게시판이 무엇인가요?", q.getSubject());
//	}

//	@Test
//	void test2(){
//		Optional<Question> oq = this.questionRepository.findById(1);
//		if(oq.isPresent()){
//			Question q= oq.get();
//			assertEquals("게시판이 무엇인가요?", q.getSubject());
//		}
//	}
//
//	@Test
//	void test3(){
//		Question q = this.questionRepository.findBySubject("게시판이 무엇인가요?");
//		assertEquals(1, q.getId());
//	}

//	@Test
//	void test4(){
//		Question q = this.questionRepository.findBySubjectAndContent("게시판이 무엇인가요?", "잘모르겠어요");
//		assertEquals(1, q.getId());
//	}

//	@Test
//	void test5(){
//		List<Question> qList = this.questionRepository.findBySubjectLike("게시판%");
//		Question q = qList.get(0);
//		assertEquals("게시판이 무엇인가요?", q.getSubject());
//	}

//	@Test
//	void test6(){
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);
//	}

//	@Test
//	public void test7(){
//	    assertEquals(2, this.questionRepository.count());
//	    Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(1, this.questionRepository.count());
//	}

//	@Test
//	public void test8(){
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//
//		Answer a = new Answer();
//		a.setContent("글 올리는 곳이죠");
//		a.setQuestion(q);
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);
//	}

//	@Test
//	public void test9(){
//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//
//		Answer a = oa.get();
//		assertEquals(2, a.getQuestion().getId());
//	}

//	@Transactional
//	@Test
//	public void test10(){
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//
//		List<Answer> answerList = q.getAnswerList();
//		assertEquals(1, answerList.size());
//		assertEquals("글 올리는 곳이죠", answerList.get(0).getContent());
//	}

	@Test
	void test11(){
		for(int i=1; i<=300; i++){
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content);
		}
	}
}
