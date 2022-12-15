public class main {

    public static void main(String[] args) {
        int sayi1 = 33;
        int sayi2 = 33;
        int sayi3 = 33;

        if(sayi1 < sayi2 && sayi1 < sayi3)
        {
            System.out.println("En kucuk sayi: " + sayi1);
        }
        else if(sayi1 > sayi2 && sayi1 > sayi3)
        {
            System.out.println("En buyuk sayi: " + sayi1);
        }
        else if(sayi2 < sayi1 && sayi2 < sayi3)
        {
            System.out.println("En kucuk sayi: " + sayi2);
        }
        else if(sayi2 > sayi1 && sayi2 > sayi3)
        {
            System.out.println("En buyuk sayi: " + sayi2);
        }
        else if(sayi3 < sayi1 && sayi3 < sayi2)
        {
            System.out.println("En kucuk sayi: " + sayi3);
        }
        else if(sayi3 > sayi1 && sayi3 > sayi2)
        {
            System.out.println("En buyuk sayi: " + sayi3);
        }
        else
        {
            System.out.println("Sayilar Birbirine Esittir!");
        }
        
    }
}