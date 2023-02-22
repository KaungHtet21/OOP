package PackageA;

public class ClassA {
    String defaultVar = "default";
    public String publicVar = "public";
    private String privateVar = "private";
    protected String protectedVar = "protected";

    void defaultMethod() {
        System.out.println("This is Default Method");
    }

    public void publicMethod() {
        System.out.println("This is public Method");
    }

    private void privateMethod() {
        System.out.println("This is private Method");
    }

    protected void protectedMethod() {
        System.out.println("This is protected Method");
    }
}
