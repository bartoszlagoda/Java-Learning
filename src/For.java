public class For {
    public static void main(String[] args) {
        int number = 100;
        // i specjalna zmienna sterująca
        for (int i = 0; i < number; i = i + 2){
            System.out.println(i);
        }
        // i specjalna zmienna sterująca
        for (int i = 0; i < number; i++){
            if(i%5==0)
                System.out.println(i);
        }
        for(int j=0;j<number;j++){
            if (j==0){
                continue;
            }
            System.out.println(j + ". " + "Bede robil prace domowe");
        }
    }
}
