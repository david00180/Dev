
public class GCD {
	public static void main(String[] args) {
		
		for (int i = 50; i > i/2; i--) {
			int[] arr = new int[i];
			for (int j = 1; j < i; j++) 
				if(Gcd(i,j))
					arr[j] = j;
			
			if(Check(arr))
				System.out.println(i);
		}
	}
	public static boolean Gcd(int A, int B) {
		if(A%B == 1)
			return true;
		if(A%B == 0)
			return false;
		return Gcd(B, A%B);
	}

	public static boolean PrimeNum(int n) {
		for (int i = 2; i < n; i++) 
			if(n%i == 0)
				return false;
		return true;
	}
	
	public static boolean Check(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			if(arr[i] != 0)
			if(!(PrimeNum(arr[i])))
				return false;
		return true;
	}

}
