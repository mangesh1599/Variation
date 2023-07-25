Count the given numbers on your fingers and find the correct finger on which the number ends.

The first number starts from the thumb, second on the index finger, third on the middle finger, fourth on the ring finger and fifth on the little finger.
Again six comes on the ring finger and so on.
Input:
N = 3
Output:
3
Explanation:
3 ends on the finger 3.
input : n=20;
output : 2

package variation;

public class finger_prbm {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=20;

		int finger=n%8;

		if(finger==1)
			System.out.println("thumb finger");

		if(finger==0 || finger==2)
			System.out.println("index finger");

		if(finger==3 || finger==7)
			System.out.println("middle finger");

		if(finger==4 || finger==6)
			System.out.println("ring finger");

		if(finger==5)
			System.out.println("little finger");


	}

}




Output-
	ring finger
