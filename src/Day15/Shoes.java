package Day15;

public class Shoes {
    private String name;
    private int size;
    private int number;

    public Shoes(String name, int size, int number) {
        this.name = name;
        this.size = size;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", number=" + number +
                '}';
    }
}
