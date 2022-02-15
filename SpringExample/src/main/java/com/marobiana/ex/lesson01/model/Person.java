package com.marobiana.ex.lesson01.model;

public class Person {
	// 이름, 나이
	private String name;
	private int age;
	
	public String getName() {	// 값 얻어오기
		return this.name;
	}
	
	public void setName(String name) {  // 값 저장
		this.name = name;
	}
	
	public int getAge() {	// 값 얻어오기
		return this.age;
	}
	
	public void setAge(int age) {  // 값 저장
		this.age = age;
	}
}
