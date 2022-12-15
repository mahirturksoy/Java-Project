package arraysDemo;

public class main {
    
    public static void main(String[] args) {
        
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Berke";
        ogrenciler[1] = "Mustafa";
        ogrenciler[2] = "Elif";
        ogrenciler[3] = "Emine";

       /* for(int i = 0; i< ogrenciler.length; i++)
            System.out.println(ogrenciler[i]);
        */
        for(String ogrenci : ogrenciler)
            System.out.println(ogrenci);
    }
}
