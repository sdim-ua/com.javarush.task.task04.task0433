/* 
Гадание на долларовый счет

Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
      int a = 0;
      String str = "S";
      while(a < 10){
          int b = 0;
           while(b < 9 ){
               System.out.print(str);
               b++;
           }
          System.out.println(str);
          a++;
          
      }
        

    }
    
    
}
