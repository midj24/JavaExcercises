public class Main {
    public static void main(String[] args) {
        // 1) Student
        Student s = new Student("Milos", "Djordjevic", "008/25");
        System.out.println(s.informacija()); // -> "Student: Tom Davis 555/55"

        // 2) Predmet
        Predmet p = new Predmet("Programiranje 1");
        System.out.println("Predmet: " + p.getNazivPredmeta());

        // 3) Ispit
        Ispit i = new Ispit("Programiranje 1", "22.12.2025.");
        // Poziv preko posebnih gettera:
        System.out.println("Ispit iz: " + i.getNazivPredmeta() + ", datum: " + i.getDatumOdrzavanja());
    }
}
