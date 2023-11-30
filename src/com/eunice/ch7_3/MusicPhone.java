package com.eunice.ch7_3;

public class MusicPhone extends Phone {
	
	String music;
	
	public void music() {
		System.out.println("음악듣기");
		
	}

	@Override
	public void bell(String bellName) {//부모클래스에서 abstract 메소드를 선언함-> 꼭 오버라이딩해야함!!
		// TODO Auto-generated method stub
		System.out.println("뮤직벨소리");
	}

	// 전원을 끌때 2초간 전원버튼을 눌러야 전원이 꺼짐
	//turnOff 메소드를 오버라이딩 하시오
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		//super.turnOff();
		System.out.println("2초간 꾹 눌러주세요!!");
	}
	
	
	
	
}
