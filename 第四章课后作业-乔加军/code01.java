package cn.jbit.test04;

import java.util.Scanner;

public class code01 {
	public static void main(String[] args) {
		System.out.println("\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t1.��½ϵͳ\n");
		System.out.println("\t\t2.�˳�\n");
		System.out.println("*********************************");
		System.out.print("��ѡ��,��������:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num){
			case 1:
				System.out.println("1.�ͻ���Ϣ����");
				System.out.println("2.�������");
				System.out.println("3.�������");
				System.out.println("4.ע��");
				break;
				
			case 2:
				System.out.println("лл����ʹ�ã�");
				break;
			default :
				System.out.println("�������");
				break;
		}
		
	}

}
