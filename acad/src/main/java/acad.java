import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.BigInteger;

public class acad {


   /* public static void main(String args[])
    {
        //Task1 -- Write a java code with the class named ‘acad’ and a method ‘main’. Hard Code the program
with two integers and print the sum of those two.
        /*int x,y,z;
        x=10;
        y=20;
        z=x+y;
        System.out.println("sum of x+y="+z);*/

    //Task2 -- Rewrite the above code, where, inputs are provided by the user at runtime and the output is printed.
       /* String number1, number2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first large number");
        number1 = in.nextLine();

        System.out.println("Enter second large number");
        number2 = in.nextLine();

        BigInteger first  = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;

        sum = first.add(second);

        System.out.println("Result of addition = " + sum);

    }*/
    //Task3 -- Write a program with method name sum() that accepts two parameters from user and print
    //the sum of two numbers. Output format should be as:
     /*   int c;
        void addition(int x,int y)
        {
            c=x+y;
        }
        public static void main(String[] arg)
        {
            int a,b;
            Scanner sc=new Scanner(System.in);
            System.out.println("First number is:");
            a=sc.nextInt();
            System.out.println("Second number is:");
            b=sc.nextInt();
            acad r=new acad();
            r.addition(a,b);
            System.out.println("Sum is : "+r.c);
        }*/

    //Task 4 --  Write a program to accepts two numbers from stdin and find all the odd as well as even
    //numbers present in between them.
    /* public static void main(String args[])
     {
         String number1, number2;
         Integer intNumber1, intNumber2;
         List<Integer> oddList = new ArrayList<Integer>();
         List<Integer> evenList = new ArrayList<Integer>();

         Scanner in = new Scanner(System.in);

         System.out.println("Enter first large number");
         intNumber1 = Integer.parseInt(in.nextLine());

         System.out.println("Enter second large number");
         intNumber2 = Integer.parseInt(in.nextLine());

         for(int i=intNumber1; i<=intNumber2; i++)
         {
             //even numbers
             if(i%2 == 0)
             {
                 oddList.add(i);
             } else { //odd numbers
                 evenList.add(i);
             }
         }
         System.out.println("Odd numbers list:");
         for (Integer odd: oddList){
             System.out.println(odd);
         }
         System.out.println("Even numbers list:");
         for(Integer even: evenList){
             System.out.println(even);
         }
     }*/

    //Task 5 -- 5) Joe is scared to go to school. When her dad asked the reason, joe said she is unable to
   // complete the task given by her teacher. The task was to find the “first 10 multiples” of the
    //number entered from stdin .
    /*public static void main(String args[]) {

        String number1;

        Integer intNumber1;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number to print the multiples:");
        intNumber1 = Integer.parseInt(in.nextLine());

        for (int i=1; i<=10;i++ ){
            System.out.printf("%d * %d = %d\n",intNumber1, i, intNumber1*i);
        }
    }*/

    //Task6 -- Write a program consisting method sum() and demonstrate the concept of method
    //overloading using this method.
    /*static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println(acad.add(11, 11));
        System.out.println(acad.add(12.3, 12.6));
    }*/

    //Task 7 -- Can you overload a method with same return type.? Explain your answer with proper logic.
    //Overloaded methods in java may have different return types given that the argument lists are also different.
    // The compiler does not consider return type when differentiating methods, so you cannot declare two methods with
    // the same signature even if they have a different return type

    //Java are only allowed for methods with different signatures.

    //The return type is not part of the method signature, hence cannot be used to distinguish overloads.

    //Task 8 -- Write a program in java using Arrays, that sorts the element in descending order.
    public static void main(String[] args)
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}

