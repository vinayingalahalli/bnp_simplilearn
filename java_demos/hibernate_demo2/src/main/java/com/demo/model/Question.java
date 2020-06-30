package com.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int qid;
	private String question;
	@OneToMany(mappedBy = "a_qid"/* ,fetch = FetchType.EAGER */ )
	List<Answers> answers=new ArrayList<>();
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	public Question(String question, List<Answers> answers) {
		super();
		this.question = question;
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", answers=" + answers + "]";
	}
	public Question() {
		// TODO Auto-generated constructor stub
	}
	
}
