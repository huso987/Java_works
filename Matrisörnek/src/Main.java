public class Main {
    public static void main(String[] args) {

        String[][] şehirler=new String[2][2];
        şehirler[0][0]="İstanbul";
        şehirler[0][1]="Ankara";
        şehirler[1][0]="çankri";
        şehirler[1][1]="adiyaman";

        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.println(şehirler[i][j]);
            }
        }
    }
}