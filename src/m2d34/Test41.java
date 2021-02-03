package m2d34;

//二分查找建议在排序的基础上
public class Test41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		
		int ret=binarySearch(arr,5);
		if(ret==-1) {
			System.out.println("找不到");
		}else {
			System.out.println("找到了，下标是"+ret);
		}
	}
	
	public static int binarySearch(int[] arr,int ele) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==ele) {
				return mid;
			}else if(arr[mid]<ele) {
				left=mid+1;
			}
			else{
				right=mid-1;
			}		
		}
		return -1;
	}
}
