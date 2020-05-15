
public class Q2_309_teacher {
	private int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};
	private int brr[] = null;
	Q2_309_teacher(){
		
		int arr_length = arr.length;
		brr = new int[arr[arr_length].length];
		for(int i = 0; i< arr[arr_length].length;i++) {
			brr[i] = arr[arr_length][i];
		}
		for(int i = arr_length; i>0;i--) {
			arr[3] = arr[2];
		}
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		//위에 private변수때문에 만듦
		// Q2T는 참조변수 <-this라는 키워드가 만들어짐
		Q2_309_teacher Q2T = new Q2_309_teacher();
		
	}
}
/*
 public class Q2_309_teacher {
	private int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};
	Q2_309_teacher(){
		System.out.println(this.arr);
	}
	public static void main(String[] args) {
		
		new Q2_309_teacher();
		
	}
}
출력: 주소값 출력(해쉬태그)
 */
