import java.util.*;
class LearnYard {
    public static void main(String[] args) {
        // you code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int row = 1;row<=N;row++){
			for(int sp = 1;sp<=N-row;sp++){
				System.out.print(" ");
			}
			for(int str = 1;str<=row;str++){
				System.out.print("*");
			}
			System.out.println("");
		}

    }
}

Input:-5
Output:-
    *
   **
  ***
 ****
*****
