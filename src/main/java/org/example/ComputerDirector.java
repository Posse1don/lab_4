package org.example;

public class ComputerDirector {
    private final ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer constructComputer() {
        builder.addCPU();
        builder.addRAM();
        builder.addStorage();
        builder.addGPU();
        return builder.build();
    }
}


