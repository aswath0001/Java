public class Challenge3 {
 public static void main(String[] args) {
   /*int count =0;
   int a=0;
    for(int i= 1; i<=10;i++){
     if(i%2==0){
     a++;
     System.out.println("even number:"+i);
     }else{
      System.out.println("odd number:"+i);
     count++;
     
     }
     
    }
    System.out.println("odd count:"+count);
    System.out.println("even count :"+a);*/

    for(int i=1;i<=100;i++){
      if(i%3==0 && i%5==0){
         System.out.println(i);
      }
    }
 }
}
