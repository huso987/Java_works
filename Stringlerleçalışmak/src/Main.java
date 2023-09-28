public class Main {
    public static void main(String[] args) {
       String mesaj=" Bugun hava çok güzel";

       System.out.println("metin uzunluk:"+mesaj.length());
       System.out.println("5.eleman:" +mesaj.charAt(4) );
       System.out.println(mesaj.concat("  Çok iyi !!!"));
       System.out.println(mesaj.startsWith("b"));
       System.out.println(mesaj.endsWith("l"));
       char[] karakterler=new char[5];
       mesaj.getChars(0,4,karakterler, 0);
       System.out.println(karakterler);
       System.out.println(mesaj.indexOf('a'));
       System.out.println(mesaj.lastIndexOf('u'));
       String newmesaj=mesaj.replace(' ','-');
       System.out.println(newmesaj);
       System.out.println(mesaj.substring(2,5));
       for (String kelime :mesaj.split(" ")){
           System.out.println(kelime);
       }
       System.out.println(mesaj.toLowerCase());
       System.out.println(mesaj.toUpperCase());
       System.out.println(mesaj.trim());
    }
}