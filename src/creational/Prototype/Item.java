package creational.Prototype;

public abstract class Item {
    protected String name;

    public abstract Item clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
