import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      int result = GreatestOfTwoNumbers(n1, n2);
      System.out.print(GreatestOfTwoNumbers(result, n3));
      
	}
  public static int GreatestOfTwoNumbers(int num1, int num2)
  {
    int BigNo = 0;
    if (num1 >  num2){
      BigNo = num1;
    }
    else{
      BigNo = num2;
    }
    return BigNo;
  }
}