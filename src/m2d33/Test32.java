package m2d33;
import java.util.Arrays;//�������з������Ǿ�̬��
public class Test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr= {313,22,11,412};
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++) {
		  		System.out.println(arr[i]); 
		  }
		  int index= Arrays.binarySearch(arr,313);
		  //System.out.println("�±���"+index);
		  System.out.println(index==-1? "��Ԫ�ز�����":"��Ԫ�ش��ڣ��±���"+index);

	}

}
