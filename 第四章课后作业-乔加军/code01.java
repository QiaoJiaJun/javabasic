package cn.jbit.test04;

import java.util.Scanner;

public class code01 {
	public static void main(String[] args) {
		System.out.println("\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t1.登陆系统\n");
		System.out.println("\t\t2.退出\n");
		System.out.println("*********************************");
		System.out.print("请选择,输入数字:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num){
			case 1:
				System.out.println("1.客户信息管理");
				System.out.println("2.购物结算");
				System.out.println("3.真情回馈");
				System.out.println("4.注销");
				break;
				
			case 2:
				System.out.println("谢谢您的使用！");
				break;
			default :
				System.out.println("输出错误");
				break;
		}
		
	}

}
