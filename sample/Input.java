package sample;
public class Input
{
    
   int num1; 
   int num2;
   int sum;
    Input(int num1, int num2)
   {
        this.num1 = num1;
        this.num2 = num2;
        setSum(this.num1, this.num2);
   }
   void setSum(int num1,int num2)
   {
        sum = num1 + num2;
   }

   public int getSum()
   {
     return this.sum;
   }

}