package com.quiz.model;

public class McqModel {
	private int mcqId;
	private String questions;
	private String option_a;
	private String option_b;
	private String option_c;
	private String option_d;
	private int cAns;
	public McqModel(int mcqId, String questions, String option_a, String option_b, String option_c, String option_d,
			int cAns) {
		super();
		this.mcqId = mcqId;
		this.questions = questions;
		this.option_a = option_a;
		this.option_b = option_b;
		this.option_c = option_c;
		this.option_d = option_d;
		this.cAns = cAns;
	}
	public int getMcqId() {
		return mcqId;
	}
	public void setMcqId(int mcqId) {
		this.mcqId = mcqId;
	}
	public String getQuestions() {
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
	}
	public String getOption_a() {
		return option_a;
	}
	public void setOption_a(String option_a) {
		this.option_a = option_a;
	}
	public String getOption_b() {
		return option_b;
	}
	public void setOption_b(String option_b) {
		this.option_b = option_b;
	}
	public String getOption_c() {
		return option_c;
	}
	public void setOption_c(String option_c) {
		this.option_c = option_c;
	}
	public String getOption_d() {
		return option_d;
	}
	public void setOption_d(String option_d) {
		this.option_d = option_d;
	}
	public int getcAns() {
		return cAns;
	}
	public void setcAns(int cAns) {
		this.cAns = cAns;
	}
	@Override
	public String toString() {
		return "McqModel [mcqId=" + mcqId + ", questions=" + questions + ", option_a=" + option_a + ", option_b="
				+ option_b + ", option_c=" + option_c + ", option_d=" + option_d + ", cAns=" + cAns + "]";
	}
	
	
}
