public class InkrementacjaDekrementacja {

    public static void main(String[] args) {
        System.out.println("Inkrementacja:\n-------------------------------");
        int a = 0;
        System.out.println("Wartość a:" + a); // 0
        int b = a++; // postinkrementacja wartości a
        System.out.println("Wartość b:" + b);// 0
        System.out.println("Wartość a:" + a); // 1
        int c = ++a; // preinkrementacja wartości a
        System.out.println("Wartość c:" + c); // 2
        System.out.println("Wartość a:" + a); // 2

        //dekrementacja zmniejszenie wartości o jeden
        System.out.println("Dekrementacja:\n-------------------------------");
        int d = 0;
        System.out.println("Wartość d : " + d); //0
        int e = d--;
        System.out.println("Wartość e : " + e); //0
        System.out.println("Wartość d : " + d); //-1
        int f = --d;
        System.out.println("Wartość f:" + f);//-2
        System.out.println("Wartość d:" + d);//-2

    }
}
