package object.oriented;

public abstract class AbstractTest {
    public int abstractValue;

    public AbstractTest(int abstractValue) {
        this.abstractValue = abstractValue;
    }

    public int getAbstractValue() {
        return abstractValue;
    }

    public void setAbstractValue(int abstractValue) {
        this.abstractValue = abstractValue;
    }
}
