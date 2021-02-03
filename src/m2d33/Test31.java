package m2d33;
//选择排序
public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,1,2,6,4};
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			//假设起点坐标下的元素是最小的
			int min=i;
			
			for(int j=0;j<arr.length-1-i;j++) {
				count++;
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int tmp=0;
				tmp=arr[min];
				arr[min]=arr[i];
				arr[i]=tmp;
			}
		}
		
		System.out.println("比较次数："+count);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
