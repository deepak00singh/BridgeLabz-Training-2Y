import com.access.one.Base;
import com.access.two.Derived;

public class MainApp {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();

        base.showAccess();      // Shows access within Base
        derived.checkAccess();  // Shows access from subclass in another package

        System.out.println("\n--- Access from MainApp (non-subclass, different package) ---");
        base.publicMethod(); // Accessible
        // base.protectedMethod(); // ❌ Not accessible (different package, not subclass)
        // base.defaultMethod();   // ❌ Not accessible (different package)
        // base.privateMethod();   // ❌ Not accessible (private)
    }
}
