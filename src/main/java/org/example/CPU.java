package org.example;

public class CPU implements Component {
    private final String model;

    public CPU(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return "CPU: " + model;
    }
}

