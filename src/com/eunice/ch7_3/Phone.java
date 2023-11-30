package com.eunice.ch7_3;

public abstract class Phone {//추상 클래스
	
	String modelName;
	String modelColor;
	
	public void turnOn() {
		System.out.println("전원켜기");
	}
	
	public void turnOff() {
		System.out.println("전원끄기");
	}
	
	public abstract void bell(String bellName);//추상메소드는 내용이 있으면 안되고 메소드의 이름만 선언해 놓음
	//꼭!! 자식클래스에서 오버라이딩해서 쓰게만듦
	
	

}
