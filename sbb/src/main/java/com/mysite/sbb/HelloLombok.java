package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class HelloLombok {
	private String hello;
	private int lombok;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloLombok hb = new HelloLombok();
		hb.setHello("헬로");
		hb.setLombok(5);
		
		System.out.println(hb.getHello());
		System.out.println(hb.getLombok());
	}

}
