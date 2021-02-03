package m2d31;


/**
 * 栈可以存储java任何引用类型数据
 * 提供push方法表示压栈
 * 提供pop方法表示弹栈
 * 栈默认容量为10
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
	
	//private int index=0;//表示栈帧指向顶部元素的上方
	
	private int index=-1;//表示栈帧指向顶部元素
	
	
	
	public void push(Object obj) {
		if(this.index>=this.elements.length-1) {
			System.out.println("压栈失败，栈满");
			return;
		}
		this.index++;
		this.elements[index]=obj;
		System.out.println("压栈"+obj+"成功,栈帧指向"+index);//System.out.println输出引用会自动调用引用的toString方法
	}
	
	
	public void pop(Object obj) {
		if(index<0) {
			System.out.println("弹栈失败，栈空");
			return;
		}
		
		System.out.println("弹栈"+this.elements[index]+"成功");	
		index--;
		System.out.println("栈帧指向"+index);	
		
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

