package heimA;

public class B {
    private A a;

    public B(A a) {
        this.a = a;
    }

    public void methodeB() {
        //a.privateInt++;
        a.publicInt++;
        a.protectedInt++;   // FEHLER, dürfte nicht passieren !!
        a.nixInt++;         // FEHLER, dürfte nicht passieren !!
    }
}
