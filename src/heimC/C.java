package heimC;

import heimA.A;

public class C {
    private A a;

    public C(A a) {
        this.a = a;
    }

    public void methodeC() {
//        a.privateInt++;
        a.publicInt++;
//        a.protectedInt++;
//        a.nixInt++;
    }

}
