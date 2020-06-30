package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Answers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String answer;
	private String answeredBy;
	@ManyToOne
	@JoinColumn(name = "qid")
	private Question a_qid;
	public Question getA_qid() {
		return a_qid;
	}

	public void setA_qid(Question a_qid) {
		this.a_qid = a_qid;
	}

	public Answers() {
		// TODO Auto-generated constructor stub
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnsweredBy() {
		return answeredBy;
	}

	public void setAnsweredBy(String answeredBy) {
		this.answeredBy = answeredBy;
	}

	public Answers(String answer, String answeredBy) {
		super();
		this.answer = answer;
		this.answeredBy = answeredBy;
	}

	@Override
	public String toString() {
		return "Answers [aid=" + aid + ", answer=" + answer + ", answeredBy=" + answeredBy + ", a_qid=" + a_qid + "]";
	}

	
}
