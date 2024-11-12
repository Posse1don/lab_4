package org.example;

public class Storage implements Component {
    private final String type;
    private final int capacity;

    public Storage(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String getDescription() {
        return "Storage: " + type + ", Capacity: " + capacity + "GB";
    }
}
