package 자료구조;

public class 퀵정렬 {

	public static void main(String[] args) {
		
		int[] arr = {3,2,4,5,7,1,6,9,8};
		
		
		int p = arr[4];
		
		int end = -1;
		int start = -1;
		
		int sindex = -1;
		int eindex = -1;
		
		
		for(int i=0;i<arr.length;i++) {
			 start = arr[i];
			
			if(start > p) {
				sindex = i;
				break;
			}
		}
		
		
		System.out.println("start : " + start + " index : " + sindex);
		

		for(int i=arr.length-1;i>0;i--) {
			 end = arr[i];
			
			if(end < p) {
				eindex = i; 
				break;
			}
		}
		
		System.out.println("end : " + end + " eindex : " + eindex);
		
		

	}
	
	public void swap() {
		
	}

}
