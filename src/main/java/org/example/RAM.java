package org.example;

public class RAM implements Component {
    private final String type;
    private final int size;

    public RAM(String type, int size) {
        this.type = type;
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "RAM: " + type + ", Size: " + size + "GB";
    }
}

