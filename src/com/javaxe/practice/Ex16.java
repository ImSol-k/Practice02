package com.javaxe.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		float num, result;
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자 : ");
		num = in.nextFloat();
		
		if(num <= 0) {
			result = (num * num * num) - (9 * num) + 2;
		}
		else {
			result = (7 * num) + 2;
		}
		
		System.out.println("계산결과는 " + result + " 입니다.");
		
		in.close();

	}

}
