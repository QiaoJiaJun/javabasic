package cn.jbit.test04;

import java.util.Scanner;

public class code02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入星期几:");
		int week = input.nextInt();
		switch(week){
		case 1:
		case 3:
		case 5:
			System.out.println("学习编程");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("学习英语");
			break;
		case 7:
			System.out.println("休息");
			break;
		default:
			System.out.println("输入错误，请重新输入");
			break;	
		}
		{
			input.close();
		}
		
	}
}
