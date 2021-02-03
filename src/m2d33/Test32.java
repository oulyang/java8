package m2d33;
import java.util.Arrays;//类中所有方法都是静态的
public class Test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] arr= {313,22,11,412};
		 Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++) {
		  		System.out.println(arr[i]); 
		  }
		  int index= Arrays.binarySearch(arr,313);
		  //System.out.println("下标是"+index);
		  System.out.println(index==-1? "该元素不存在":"该元素存在，下标是"+index);

	}

}
