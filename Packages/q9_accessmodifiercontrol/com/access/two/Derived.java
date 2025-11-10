package com.access.two;
import com.access.one.Base;

public class Derived extends Base {

    public void checkAccess() {
        System.out.println("\n--- Inside Derived Class (Different Package) ---");

        // Accessible
        publicMethod();
        protectedMethod(); // Accessible because Derived is subclass of Base

        // Not Accessible (Different package and not inherited)
        // defaultMethod();
        // privateMethod();
    }
}
