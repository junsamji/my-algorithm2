package algorithm2;

public class solution {

	public static void main(String[] args) {
		int[] event = {5, 1, 9, 8, 10, 5};
		int K = 3;
		
		long start = System.currentTimeMillis();
		int result = solution(event, K);
		long end = System.currentTimeMillis();
		
		System.out.println("result = "+result);
		System.out.println("[실행시간: "+(end-start)/1000.0+"sec.]");

	}
	
	private static int solution(int[] event, int K) {
		int answer = 0;
		
		for (int i=0; i<=event.length - K; i++) {
			int count = 0;
			int tempSum = 0;
			
			for (int j=i; count<K; j++) {
				tempSum += event[j];
				
				count++;
			}
			
			if (tempSum > answer) answer = tempSum;
		}
		
		
		return answer;
	}

}
