package org.example;

public class GPU implements Component {
    private final String model;

    public GPU(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return "GPU: " + model;
    }
}

