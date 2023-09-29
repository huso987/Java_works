public class Main {
    public static void main(String[] args) {
      int[] sayilar=new int[]{1,6,4,8};
      int arancaksayi = 4;
      boolean varmMi=false;

      for (int sayi : sayilar){
          if(sayi==arancaksayi){
              varmMi=true;
              break;
          }
      }
      if (varmMi=true){
          System.out.println("sayi mevcuttur");
      }
      else {
          System.out.println("sayi mevcut değildir");
      }

    }
}