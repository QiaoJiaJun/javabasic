package cn.jbit.test04;

import java.util.Scanner;

public class code04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������java���Է�����1~100����");
		int score = input.nextInt();
		switch  (score/10) {
		case 10:
			System.out.println("�ְָ�����������");
			break;
		case 9:
			System.out.println("ĸ�׸�����һ���ʼǱ����ԡ�");
			break;
		case 6:	
		case 7:
		case 8:
			System.out.println("ĸ�׸�����һ���ֻ���");
			break;
		default:
			System.out.println("ʲô������");
		}
	}

}
