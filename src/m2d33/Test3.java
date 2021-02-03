package m2d33;
//冒泡排序

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] arr= {3,5,1,2,6,4};
		int count=0;
		for(int i=0;i<arr.length-1;i++) {	
			for(int j=0;j<arr.length-1-i;j++) {
				count++;
				if(arr[j]<arr[j+1]) {
					int tmp=0;
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}	
			}
		}
		System.out.println("比较次数："+count);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}


	}

}
