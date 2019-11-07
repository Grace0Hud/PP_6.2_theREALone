import java.util.Scanner;
public class countingInts
{
    public static void main(String [] args)
    {
        int[] fancyArray = new int[51];
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your string of numbers (1,50): ");
       while(num <= 50 && num >= 0)
        {
            num = scan.nextInt();
            if(num <= 50 && num >= 0)
            fancyArray[num]++;
        }//end of while
        for(int i = 0; i < 51; i++)
        {
            System.out.println(i + "\t" + fancyArray[i]);
        }//end of for loop for printing out array
    }//end of main method
}//end of countingInts
