package cn.jbit.test04;

import java.util.Scanner;

public class code03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入月份:1~12");
		double priceDis=0;
		int month = input.nextInt();
		System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
		int Class = input.nextInt();
		switch(month){
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			if(Class==1){
				priceDis=5000*0.9;
			}else{
				priceDis=5000*0.8;
			}
			break;
		case 11:
		case 12:
		case 1:
		case 2:
		case 3:
			if(Class==1){
				priceDis=5000*0.5;
			}else{
				priceDis=5000*0.4;
			}
			break;
		
		}
		System.out.print("您的机票价格为: "+priceDis);
	}
}
