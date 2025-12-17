void main() {

    // Regularni korisnik 1, Admin 2 i Superadmin 4
//    String rezultat = PristupApp.proveriPristup(1);
//    System.out.println(rezultat);
//
//    PristupApp.pokreniTestove();

    BankAccount racun = new BankAccount(500);
    BankAccount racun2 = new BankAccount(4000);

    // System.out.println(racun.balance); ovo ne moze jer je private
    System.out.println(racun.getBalance());
    System.out.println(racun2.getBalance());

    //racun.balance = 10000;  ovo ne moze jer je private
    System.out.println(racun.depozit(500));
    System.out.println(racun.getBalance());

    // preuzimanje novca sa racuna
    racun.withdraw(300);
    System.out.println(racun.getBalance());


    Dog dog = new Dog(); // jedan pas
    Cat cat = new Cat(); // jedna macka

    dog.sound();
    cat.sound();

    BankAccountTests.runAllTests();
}// }
