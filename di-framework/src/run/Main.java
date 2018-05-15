package run;

import exemples.ExempleSingleton;
import exemples.ExempleTransient;
import exemples.IExempleSingleton;
import exemples.IExempleTransient;
import framework.DependencyInjection;

public class Main {

    public static void main (String[] args) {

        DependencyInjection.addSingleton(IExempleSingleton.class, ExempleSingleton.class);
        DependencyInjection.addTransient(IExempleTransient.class, ExempleTransient.class);

        IExempleSingleton singletonInstance = DependencyInjection.resolve(IExempleSingleton.class);
        IExempleTransient transientInstance = DependencyInjection.resolve(IExempleTransient.class);

        singletonInstance.setNumber(10);
        System.out.println("\nSingleton Instance value: " + singletonInstance.getNumber());

        transientInstance.setNumber(20);
        System.out.println("\nTransient Instance value: " + transientInstance.getNumber());

        System.out.println("\n======== Get new instances ========");

        IExempleSingleton singletonInstance2 = DependencyInjection.resolve(IExempleSingleton.class);
        IExempleTransient transientInstance2 = DependencyInjection.resolve(IExempleTransient.class);

        singletonInstance2.setNumber(15);
        System.out.println("\nSingleton Instance value: " + singletonInstance.getNumber());
        System.out.println("Singleton Instance 2 value: " + singletonInstance2.getNumber());

        transientInstance2.setNumber(10);
        System.out.println("\nTransient Instance value: " + transientInstance.getNumber());
        System.out.println("Transient Instance 2 value: " + transientInstance2.getNumber());
    }
}
