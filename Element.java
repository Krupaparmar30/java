

import java.util.Scanner;

public class Element {
    public static void main(String[] args)
    {

       // int n;

//        Scanner scanner=new Scanner(System.in);


        int a[]= {10,20,30,40,50};
        System.out.println("{10,20,30,40,50}");
        int max=0;

        for(int i=0;i<a.length;i++)
        {
           if(a[i]>max)
           {
               max=a[i];

           }

        }
        System.out.println("The Large Value");
        System.out.println(max);


    }
}