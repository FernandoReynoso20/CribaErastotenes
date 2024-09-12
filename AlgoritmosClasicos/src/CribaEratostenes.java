public class CribaEratostenes {

	public static void solution (int n) {
		long startime = System.nanoTime();
		int[] primo = new int[n];
		for(int i=1; i<n; i++) {
			primo[i]= 0;
		}

		primo[0]=primo[1]=1;

		for(int i=2; i*i<n; i++) {
			if(primo[i] == 0) {
				for(int j=i*i; j<n; j+=i) {
					primo[j]=1;
				}
			}
		}
		for(int i=2; i<=n-1; i++) {
			if(primo[i] == 0) {
				System.out.println(i);
			}
		}
		long endtime = System.nanoTime();
		long time = endtime - startime;
		System.out.println("Con n = " + n + " la duracion del programa es de: " + time);

	}
	public static void main(String[] args) {
		int n = 10000000;
		solution(n);
	}
}