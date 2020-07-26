package kr.or.connect.diexam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired // 너가 알아서 이 타입의 객체가 생성되어 있으면 넣어줘.
	private Engine v8;
	
	public Car() {
		System.out.println("Car 생성");
	}
	
	public void setEngine(Engine e) {
		this.v8 = e;
	}
	
	public void run() {
		System.out.println("엔진을 이용하여 달립니다.");
		v8.exec();
	}
	
	
}
