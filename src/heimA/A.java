package heimA;

public class A {
    private   int privateInt;
    public    int publicInt;
    protected int protectedInt;
    /* nix */ int nixInt;           // package-scope/package-private

    public A() {
        this.privateInt   = 10;
        this.publicInt    = 20;
        this.protectedInt = 30;
        this.nixInt       = 40;
    }

    public void methodeA() {
        privateInt++;
        publicInt++;
        protectedInt++;
        nixInt++;
    }
}
