package StudentFile;

import StudentFile.Student;

public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni; // wywołanie pola statycznego dla dla całej klasy Student
        Student.infoUczelni(); // wywołanie metody statycznej dla całej klasy Student

        Student azarzycki = new Student();
        azarzycki.imie = "Antoni";
        azarzycki.nazwisko = "Zarzycki";
        azarzycki.nick = "azarzyc06";
        azarzycki.numerIndeksu = 606123;
        azarzycki.email = "azarzycki@gmail.com";
        String uczelniaAntoniego = azarzycki.nazwaUczelni; // wywołanie pola statycznego dla obiektu
        //azarzycki.infoUczelni(); // wywołanie metody statycznej dla obiektu azarzycki

        Student btomaszewska = new Student();
        btomaszewska.imie = "Barbara";
        btomaszewska.nazwisko = "Tomaszewska";
        btomaszewska.nick = "btomaszew09";
        btomaszewska.numerIndeksu = 606125;
        btomaszewska.email = "btomaszewska@onet.pl";

        Student bgur = new Student();
        bgur.imie = "Borys";
        bgur.nazwisko = "Gur";
        bgur.nick = "bgur01";
        bgur.numerIndeksu = 606129;
        bgur.email = "bgur@wp.pl";

        Student[] personTable = new Student[] {azarzycki, btomaszewska, bgur};

        for(int i = 0; i < personTable.length; i++){
            System.out.println((i+1) + " Osoba: ");
            personTable[i].przedstawSie();
            personTable[i].podajNrIndeksu();
            personTable[i].podajEmail();
            personTable[i].zalogujSie();
        }
    }
}
