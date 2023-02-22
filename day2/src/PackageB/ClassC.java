package PackageB;

import PackageA.ClassA;

public class ClassC extends ClassA {
    public ClassC() {
        publicVar = "asdf";
//        defaultVar = "asdf";
//        privateVar = "asdf";
        protectedVar = "asdf";
    }
}