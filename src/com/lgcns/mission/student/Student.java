package com.lgcns.mission.student;

public class Student {
	private String id;
	private int java;
	private int sql;
	private int math;
	private int chinese;
	private int rank;
	
	public Student(String id) {
		this.id = id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setScores (int java,int sql,int math,int chinese) {
		this.java=java;
		this.sql=sql;
		this.math=math;
		this.chinese=chinese;
	}
	public double calculateAverage() {
		return (java + sql + math +chinese)/4;
		
	}
	
	public void printScoreInfo() {
		System.out.println("ID :" + id);
		System.out.println("Java :" + java);
		System.out.println("SQL :" + sql);
		System.out.println("Math :" + math);
		System.out.println("Chinese :" + chinese);
		System.out.println("Nilai rata - rata :" + calculateAverage());
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
}
