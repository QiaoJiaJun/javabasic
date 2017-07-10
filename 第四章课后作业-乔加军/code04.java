package cn.jbit.test04;

import java.util.Scanner;

public class code04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入java考试分数（1~100）：");
		int score = input.nextInt();
		switch  (score/10) {
		case 10:
			System.out.println("爸爸给她买辆车。");
			break;
		case 9:
			System.out.println("母亲给她买一部笔记本电脑。");
			break;
		case 6:	
		case 7:
		case 8:
			System.out.println("母亲给她买一部手机。");
			break;
		default:
			System.out.println("什么都不买");
		}
	}

}
