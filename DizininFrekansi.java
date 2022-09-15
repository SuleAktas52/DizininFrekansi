import java.util.Arrays;

public class DizininFrekansi {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int couter = 1;

        Arrays.sort(dizi);

        System.out.println("Tekrar sayilari");

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((j != i) && (dizi[j] == dizi[i])) {
                    couter++;
                    i++;
                }
            }
            if (couter >= 1) {
                System.out.println(dizi[i] + " sayisi " + couter + " kere tekrar edildi.");
            }
            couter = 1;
        }
    }
}

/*
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */
