package multiDimensionalArrayDemo;

public class main {
    
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "Istanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "Izmir";
        sehirler[1][0] = "Kocaeli";
        sehirler[1][1] = "Antalya";
        sehirler[1][2] = "Adana";
        sehirler[2][0] = "Eskisehir";
        sehirler[2][1] = "Canakkale";
        sehirler[2][2] = "Mugla";

        for(int i= 0; i<=2; i++){
            System.out.println("----------------------");
            for(int j=0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }

        
    }
}
