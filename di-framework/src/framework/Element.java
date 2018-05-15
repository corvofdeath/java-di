package framework;

public class Element<T> implements IElement<T> {

    private Class<T> classDefinition;
    private Types type;
    private T element;

    public Element(Class<T> classDefinition, Types type) {
        this.classDefinition = classDefinition;
        this.type = type;
    }

    @Override
    public T getElement() {

        if (this.type == Types.singleton)
            return resolveSingleton();
        else
            return resolveNewInstance();
    }

    private T resolveSingleton() {
        if (this.element == null)
            this.element = resolveNewInstance();

        return element;
    }

    private T resolveNewInstance() {

        try {
            return this.classDefinition.newInstance();
        } catch (Exception e) {}

        return null;
    }
}
