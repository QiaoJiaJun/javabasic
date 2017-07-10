package cn.jbit.test04;

import java.util.Scanner;

public class code06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入消费金额：");
		double price;
		double money = input.nextDouble();
		System.out.println("是否参加优惠换购活动:");
		System.out.println("1:满50元，加2元换购百事可乐饮料1瓶");
		System.out.println("2:满100元，加3元换购500ml可乐1瓶");
		System.out.println("3:满100元，加10元换购5kg面粉");
		System.out.println("4:满200元，加10元换购1个苏泊尔炒菜锅");
		System.out.println("5:满200元，加20元换购欧莱雅爽肤水1瓶");
		System.out.println("0:不换购.");
		System.out.print("请选择:");
		int num = input.nextInt();
		switch(num){
		case 0:
			System.out.println("本次消费总金额："+money);
			System.out.println("不参与换购");
			break;
		case 1:
			if(money>=50){
				price = money+2;
				System.out.println("本次消费总金额："+price);
				System.out.println("成功换购:1瓶事可乐饮料");
			};
			break;
		case 2:
			if(money>=100){
				price = money+3;
				System.out.println("本次消费总金额："+price);
				System.out.println("成功换购:1瓶500ml可乐");
			};
			break;
		case 3:
			if(money>=100){
				price = money+10;
				System.out.println("本次消费总金额："+price);
				System.out.println("成功换购:1袋5kg面粉");
			};
			break;
		case 4:
			if(money>=200){
				price = money+10;
				System.out.println("本次消费总金额："+price);
				System.out.println("成功换购:1个苏泊尔炒菜锅");
			};
			break;
		case 5:
			if(money>=200){
				price = money+20;
				System.out.println("本次消费总金额："+price);
				System.out.println("成功换购:1瓶欧莱雅爽肤水");
			};
			break;
		default:
				System.out.println("输入错误，请重新输入");
			break;
		
		
		
		}	
	}

}
