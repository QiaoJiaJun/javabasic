package cn.jbit.test04;

import java.util.Scanner;

public class code05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ����������");
		double num1 = input.nextDouble();
		
		System.out.print("�����������(+,-,*,/,%):");
		char opr = input.next().charAt(0);
		
		System.out.print("������ڶ�����������");
		double num2 = input.nextDouble();
		double result = 0.0;
		
		switch(opr){
			case '+':
				result = num1+num2;
				break;
				
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if(num2 == 0){
					System.out.println("��������Ϊ0��");
				}else{
					result = num1 / num2;
				}
				break;
			case '%':
				if(num2 == 0){
					System.out.println("��������Ϊ0��");
				}else{
					result = num1 % num2;
				}
				break;
			default :
				break;
		}
		
		System.out.printf("������Ϊ��%.2f %c %.2f = %.2f",num1,opr,num2,result);
	}

}
