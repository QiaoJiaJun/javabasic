package cn.jbit.test04;

import java.util.Scanner;

public class code02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������ڼ�:");
		int week = input.nextInt();
		switch(week){
		case 1:
		case 3:
		case 5:
			System.out.println("ѧϰ���");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("ѧϰӢ��");
			break;
		case 7:
			System.out.println("��Ϣ");
			break;
		default:
			System.out.println("�����������������");
			break;	
		}
		{
			input.close();
		}
		
	}
}
