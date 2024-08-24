import java.util.Scanner;

public class even {
    public static void main(String[] arge) {



        System.out.println("enter the a:");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();

      for(int i=0;i<=a;i++)
      {
          if(a%2==0)
          {
              System.out.println(a);
          }
      }




    }
}