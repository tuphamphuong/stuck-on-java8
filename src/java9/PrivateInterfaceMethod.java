package java9;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public interface PrivateInterfaceMethod {
    void normalInterfaceMethod();

    default void interfaceMethodWithDefault() {  init(); }

    default void anotherDefaultMethod() { init(); }

    // This method is not part of the public API exposed by MyInterface
    private void init() { System.out.println("Initializing"); }
}
