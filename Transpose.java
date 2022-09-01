import java.util.Scanner;
class Transpose{
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int a[][]=new int [2][2];
        int b[][]=new int[2][2];
      
        System.out.println("Enter the numbers");
        try{
            for(int i=0;i<=a.length;i++)
            {
                for(int j=0;j<=a.length;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }

        }finally{
            System.out.println("HAha");
        }
        
       
        System.out.println("The transpose is");
        for(int i=0;i<=a.length;i++)
        {
            for(int j=0;j<=a.length;j++)
            {
                b[i][j]=a[i][j];
                System.out.println("\t" +b[i][j]);
            }
            System.out.println("");
      }
        
    }
}