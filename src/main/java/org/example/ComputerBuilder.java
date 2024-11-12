package org.example;

public interface ComputerBuilder {
    void addCPU();
    void addRAM();
    void addStorage();
    void addGPU();
    Computer build();
}


