package exemples;

public class ExempleTransient implements IExempleTransient {

    private int number;

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }
}
