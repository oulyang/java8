package m2d34;

//���ֲ��ҽ���������Ļ�����
public class Test41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7};
		
		int ret=binarySearch(arr,5);
		if(ret==-1) {
			System.out.println("�Ҳ���");
		}else {
			System.out.println("�ҵ��ˣ��±���"+ret);
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
