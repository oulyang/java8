package m2d32;

import java.util.Scanner;

public class HosptialSystem {

	public static void main(String[] args) {
		
		java.util.Scanner s=new java.util.Scanner(System.in);
		Hosptial h1=new  Hosptial();
		System.out.println("��ӭʹ��");
		System.out.println("1.�鿴���з���״̬   2.����      ");
		System.out.println("3.�˷�               4.�˳�ϵͳ  ");
		
		while(true) {
			System.out.print("�����룺");
			
			int i=s.nextInt();
			if(i==1) {
				h1.print();
			}else if(i==2) {
				System.out.print("�����뷿��ţ�");
				int roomNo=s.nextInt();
				h1.order(roomNo);
				System.out.println("����"+roomNo+"�ɹ�");
			}else if(i==3) {
				System.out.print("�����뷿��ţ�");
				int roomNo=s.nextInt();
				h1.exit(roomNo);
				System.out.println("�˷�"+roomNo+"�ɹ�");
			}else if(i==0) {
				System.out.println("���˳�");
				return;
			}else {
				System.out.println("�������");
			}
		}

		

		
		
	}
}
