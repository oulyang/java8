package m2d34;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,1,2,6,4};
		
		int ret=arraySearch(arr,6);
		if(ret==-1) {
			System.out.println("�Ҳ���");
		}else {
			System.out.println("�ҵ��ˣ��±���"+ret);
		}
	}

		
		
		public static int arraySearch(int[] arr,int ele) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==ele) {
					return i;
				}
			}
			return -1;
	}

}
