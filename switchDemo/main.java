public class main {
    public static void main(String[] args) {
        
        char grade = 'A';

        switch (grade) {

            case 'A' :
            System.out.println("En iyi derece ile geçtiniz!");
            break; 
            case 'B' :
            System.out.println("İyi derece ile geçtiniz!");
            break;
            case 'C' :
            System.out.println("İyi derece ile geçtiniz!");
            break;
            case 'D' :
            System.out.println("Geçtiniz!");
            break;
            case 'F' :
            System.out.println("Maalesef Kaldiniz!");
            break; 
            default :
            System.out.println("Hatali Not Girdiniz!");
        }
    }
}