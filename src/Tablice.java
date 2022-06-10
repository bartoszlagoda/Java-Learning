public class Tablice {
    public static void main(String[] args) {
        /*
        // deklaracja nowej tablicy 3 elementowej
        String[] winterMonths = new String[3];
        winterMonths[0] = "grudzien"; // przypisanie wartości do tablicy
        winterMonths[1] = "styczen";
        winterMonths[2] = "luty";

        System.out.println(winterMonths[0]); // wywołanie pierwszej wartości z tablicy o indeksie 0
        System.out.println(winterMonths[1]);
        System.out.println(winterMonths[2]);*/

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
/*
        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

        System.out.println("Ilość elementów w tablicy lottoNumbers to: " + lottoNumbers.length);
        // elementów jest 6 i zaczynają się od indeksu 0*/

        for(int i = 0; i < lottoNumbers.length; i++){
            System.out.println(lottoNumbers[i]);
        }
    }
}
