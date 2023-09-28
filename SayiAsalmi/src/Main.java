public class Main {
    public static void main(String[] args) {
      int num=13;
      int remainder=num % 2 ;
      System.out.println(remainder);
      boolean isPrime =true;

      for (int i=2;i<num;i++){
          if(num % i ==0){
              isPrime =false;
          }

      }
      if (isPrime){
          System.out.println("Sayi Asaldir !");
      }else {
          System.out.println("Sayi asal değildir...");
      }
    }
}