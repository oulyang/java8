package m2d32;

import java.util.Scanner;

public class HosptialSystem {

	public static void main(String[] args) {
		
		java.util.Scanner s=new java.util.Scanner(System.in);
		Hosptial h1=new  Hosptial();
		System.out.println("欢迎使用");
		System.out.println("1.查看所有房间状态   2.订房      ");
		System.out.println("3.退房               4.退出系统  ");
		
		while(true) {
			System.out.print("请输入：");
			
			int i=s.nextInt();
			if(i==1) {
				h1.print();
			}else if(i==2) {
				System.out.print("请输入房间号：");
				int roomNo=s.nextInt();
				h1.order(roomNo);
				System.out.println("订房"+roomNo+"成功");
			}else if(i==3) {
				System.out.print("请输入房间号：");
				int roomNo=s.nextInt();
				h1.exit(roomNo);
				System.out.println("退房"+roomNo+"成功");
			}else if(i==0) {
				System.out.println("已退出");
				return;
			}else {
				System.out.println("输入错误");
			}
		}

		

		
		
	}
}
