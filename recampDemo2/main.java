package recampDemo2;

public class main {
    public static void main(String[] args) {
        double[] myList = {2.4,5.2,3.7,6.4,8.5};
        double total = 0;
        double max = myList[0];

        for(double number : myList){
            if(max<number){
                max = number;
            }
            System.out.println(number);
            total = total + number;
        }
        System.out.println("Toplam: " + total);
        System.out.println("En Buyuk: " + max);

    }
}
