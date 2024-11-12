package org.example;

import java.util.Random;

public class BudgetComputerBuilder implements ComputerBuilder {
    private final Computer computer = new Computer();
    private final Random random = new Random();

    @Override
    public void addCPU() {
        String[] cpuModels = {"Intel Pentium", "AMD Athlon", "Intel Celeron"};
        computer.addComponent(new CPU(cpuModels[random.nextInt(cpuModels.length)]));
    }

    @Override
    public void addRAM() {
        int[] ramOptions = {4, 8};
        computer.addComponent(new RAM("DDR3", ramOptions[random.nextInt(ramOptions.length)]));
    }

    @Override
    public void addStorage() {
        int[] storageOptions = {128, 256};
        computer.addComponent(new Storage("HDD", storageOptions[random.nextInt(storageOptions.length)]));
    }

    @Override
    public void addGPU() {
        String[] gpuModels = {"Integrated Graphics", "NVIDIA GT 710", "AMD Radeon R5"};
        computer.addComponent(new GPU(gpuModels[random.nextInt(gpuModels.length)]));
    }

    @Override
    public Computer build() {
        return computer;
    }
}

