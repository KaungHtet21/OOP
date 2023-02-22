package PackageB;

import PackageA.ClassA;

public class ClassC extends ClassA {
    public ClassC() {
        publicMethod();
//        defaultMethod();
        protectedMethod();
//        privateMethod();
    }
}
