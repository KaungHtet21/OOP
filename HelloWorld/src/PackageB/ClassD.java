package PackageB;

import PackageA.ClassA;

public class ClassD {
    private ClassA a;
    public ClassD() {
        a = new ClassA();
        a.publicMethod();
    }
}
