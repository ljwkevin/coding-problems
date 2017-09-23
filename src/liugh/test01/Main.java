package liugh.test01;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) throws Exception {
	   int count = 0;
       // 在这里加入最大值，和最小值
       int max = 999999;
       int min = 1;
       //生成1－999999之间的随机数
       Random rand = new Random();
       int mid = 0;
       // 键盘录入数据
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入你要猜的数据：(" + min + "~" + max + ")");
       int myInputGuessNumber =0;
       try {
      	 myInputGuessNumber = sc.nextInt();//58
           while(myInputGuessNumber>max||myInputGuessNumber<min){
          	 System.out.println("请输入1~999999范围内的数");
          	 myInputGuessNumber = sc.nextInt();//58
           }
		} catch (InputMismatchException e) {
			System.out.println("your enter is a error number!");
			e.printStackTrace();
		}
      // System.out.println(number);
       int computerNum = rand.nextInt(999998)+1;//100
       for(;;){
      	 System.out.println(computerNum);
      	//计数
           count++;
           if(computerNum>myInputGuessNumber){//假如猜的数myInputGuessNumber =10000   电脑随机生成的数 computerNum =20000    所以下来猜10000-15000
          	 System.out.println("Larger");
          	 mid=(computerNum+myInputGuessNumber)/2;
          	 computerNum= rand.nextInt(mid+1-myInputGuessNumber)+myInputGuessNumber;
           }
           if(computerNum<myInputGuessNumber){//假如猜的数myInputGuessNumber =10000   电脑随机生成的数 computerNum =5000    所以下来猜7500-10000
          	 System.out.println("Smaller");
          	 mid=(computerNum+myInputGuessNumber)/2;
          	 computerNum= rand.nextInt(myInputGuessNumber+1-mid)+mid;  
           }
           if(computerNum==myInputGuessNumber && count<=18){
          	 System.out.println("Congratulations on the computer!");
          	 break;
           }
           if(count>18){
          	 System.out.println("Sorry, the computer is lost.");
          	 break;
           }
       }

   }
}




