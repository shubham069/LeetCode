import java.util.Scanner;

public class AddDigit {
    public int addDigits(int num) {
        int sum=0;
        while(num!=0){
            sum=0;
        while (num!=0){
            sum+=num%10;
            num=num/10;
            }
            if (sum>=10)
            num=sum;
        }
        return sum;
    }
    
    public static void main (String [] args){
    	AddDigit addDigit = new AddDigit();
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter a number");
    	System.out.println(addDigit.addDigits(scan.nextInt()));
    }
}