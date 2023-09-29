public class Main {
    public static void main(String[] args) {
     int num = 23;
     int total = 0;
     for(int i=1;i<num;i++){
         if(num % i ==0){
             total = total + i;
         }
     }
     if(total==num){
         System.out.println("Sayi mükemel sayidir");
     }
     else{
         System.out.println("Sayi mükemmel değildir");
     }

    }
}