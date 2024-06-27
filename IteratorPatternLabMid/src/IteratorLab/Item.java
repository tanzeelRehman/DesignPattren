package IteratorLab;

public class Item {
    private String name;
    private ItemType type;

    public Item(String name, ItemType type) {
        this.setType(type);
        this.name = name;

    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "IteratorLab.Item{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
