package heimC;
import heimA.A;

public class subA extends A {
    private A a;

    public subA(A a) {
        this.a = a;
    }

    public void methodeSubA() {
//        a.privateInt++;
        a.publicInt++;
        this.protectedInt++;
//        a.protectedInt++;
//        a.nixInt++;
    }
}
