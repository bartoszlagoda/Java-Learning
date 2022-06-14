package interview;

public class Palindrom {

    public static void main(String[] args) {
        System.out.println(isPallindrom("kajak"));
        System.out.println(isPallindrom("Owoc"));
        System.out.println(isPallindrom("ala"));
    }

    public static boolean isPallindrom(String word){
        // ile znaków ma dane słowo
        int n = word.length();

        for(int i = 0; i < (n/2); i++){
            // sprawdzenie indeksu chara
            // length wskazuje dokładną ilość liter, ale iterujemy od 0
            if(word.charAt(i) != word.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
