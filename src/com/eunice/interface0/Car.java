package com.eunice.interface0;

public interface Car {//인터페이스 선언->인터페이스는 생성자 불가/일반메서드 불가-> 추상메서드만 가능

	String carName = "소나타";
	
	public void excelPedal();//인터페이스 내에서는 메소드의 이름만 선언이 가능!!(내용안됨!)/매개변수 선언은 가능
	public void breakPedal();
	public void handle();
		
	
	
}
