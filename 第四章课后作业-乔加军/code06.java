package cn.jbit.test04;

import java.util.Scanner;

public class code06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������ѽ�");
		double price;
		double money = input.nextDouble();
		System.out.println("�Ƿ�μ��Żݻ����:");
		System.out.println("1:��50Ԫ����2Ԫ�������¿�������1ƿ");
		System.out.println("2:��100Ԫ����3Ԫ����500ml����1ƿ");
		System.out.println("3:��100Ԫ����10Ԫ����5kg���");
		System.out.println("4:��200Ԫ����10Ԫ����1���ղ������˹�");
		System.out.println("5:��200Ԫ����20Ԫ����ŷ����ˬ��ˮ1ƿ");
		System.out.println("0:������.");
		System.out.print("��ѡ��:");
		int num = input.nextInt();
		switch(num){
		case 0:
			System.out.println("���������ܽ�"+money);
			System.out.println("�����뻻��");
			break;
		case 1:
			if(money>=50){
				price = money+2;
				System.out.println("���������ܽ�"+price);
				System.out.println("�ɹ�����:1ƿ�¿�������");
			};
			break;
		case 2:
			if(money>=100){
				price = money+3;
				System.out.println("���������ܽ�"+price);
				System.out.println("�ɹ�����:1ƿ500ml����");
			};
			break;
		case 3:
			if(money>=100){
				price = money+10;
				System.out.println("���������ܽ�"+price);
				System.out.println("�ɹ�����:1��5kg���");
			};
			break;
		case 4:
			if(money>=200){
				price = money+10;
				System.out.println("���������ܽ�"+price);
				System.out.println("�ɹ�����:1���ղ������˹�");
			};
			break;
		case 5:
			if(money>=200){
				price = money+20;
				System.out.println("���������ܽ�"+price);
				System.out.println("�ɹ�����:1ƿŷ����ˬ��ˮ");
			};
			break;
		default:
				System.out.println("�����������������");
			break;
		
		
		
		}	
	}

}
