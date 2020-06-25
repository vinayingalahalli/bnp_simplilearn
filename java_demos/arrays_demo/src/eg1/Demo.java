package eg1;

public class Demo {

	public static void main(String[] args) {
		int ar[] = new int[6];
		ar[0] = 22;
		ar[1] = 44;
		ar[2] = 55;
		int n = 3;
		System.out.println("Printing contents of array");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		int newele = 100;
		int pos = 4;
		for (int i = n; i >= pos; i--) {
			ar[i] = ar[i - 1];
		}
		ar[pos - 1] = newele;
		n++;
		System.out.println("\nPrinting contents of array");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + " ");
		}
		pos = 2;
		for (int i = pos - 1; i < n; i++) {
			ar[i]=ar[i+1];
		}
		n--;
		
		System.out.println("\nPrinting contents of array");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
