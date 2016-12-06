package javahackerrank;

public class DivSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int k = 3;
		int[] a = {1,3,2,6,1,2};
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++){
				if(((a[i]+a[j])%k) == 0){
					count+=1;
//					System.out.println(a[i] +","+a[j]);
				}
			}
		}
		System.out.println(count);

	}

}
