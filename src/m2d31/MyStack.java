package m2d31;


/**
 * ջ���Դ洢java�κ�������������
 * �ṩpush������ʾѹջ
 * �ṩpop������ʾ��ջ
 * ջĬ������Ϊ10
 * @author yyds
 *
 */
public class MyStack {

	/*
	 * private Object[] elements;
	 * 
	 * public MyStack() { 
	 * super(); 
	 * this.elements=new Object[10]; 
	 * }
	 */ 
	
	private Object[] elements=new Object[10];
	
	//private int index=0;//��ʾջָ֡�򶥲�Ԫ�ص��Ϸ�
	
	private int index=-1;//��ʾջָ֡�򶥲�Ԫ��
	
	
	
	public void push(Object obj) {
		if(this.index>=this.elements.length-1) {
			System.out.println("ѹջʧ�ܣ�ջ��");
			return;
		}
		this.index++;
		this.elements[index]=obj;
		System.out.println("ѹջ"+obj+"�ɹ�,ջָ֡��"+index);//System.out.println������û��Զ��������õ�toString����
	}
	
	
	public void pop(Object obj) {
		if(index<0) {
			System.out.println("��ջʧ�ܣ�ջ��");
			return;
		}
		
		System.out.println("��ջ"+this.elements[index]+"�ɹ�");	
		index--;
		System.out.println("ջָ֡��"+index);	
		
	}
	public MyStack() { 
		 
	 }
	public MyStack(Object[] elements) {
		super();
		this.elements = elements;
	}


	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public Object[] getElements() {
		return elements;
	}


	public void setElements(Object[] elements) {
		this.elements = elements;
	}
	
	
	
}

