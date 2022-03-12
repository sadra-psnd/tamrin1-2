import java.util.Scanner;

class FINDINGTHELARGESTVALUEINANINPUTOFANARRAY
{
    public static void main(String[] args)
    {
        int n, i, large;
        Scanner scan = new Scanner(System.in);

        System.out.print(" tell me that your array consist of how many numbers: ");
        n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " +n+ " Numbers: ");
        for(i=0; i<n; i++)
            arr[i] = scan.nextInt();

        large = arr[0];
        for(i=1; i<n; i++)
        {
            if(large<arr[i])
                large = arr[i];
        }

        System.out.println("\nLargest Number is = " +large);
    }
}
