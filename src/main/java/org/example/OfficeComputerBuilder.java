package org.example;

import java.util.Random;

public class OfficeComputerBuilder implements ComputerBuilder {
    private final Computer computer = new Computer();
    private final Random random = new Random();

    @Override
    public void addCPU() {
        String[] cpuModels = {"Intel Core i3-12100 3.3 GHz", "Intel Core i5-12400 2.5GHz", "AMD Ryzen 5 5600 3.5GHz", "AMD Ryzen 5 5500 3.6GHz"};
        computer.addComponent(new CPU(cpuModels[random.nextInt(cpuModels.length)]));
    }

    @Override
    public void addRAM() {
        int[] ramOptions = {4, 8, 16};
        computer.addComponent(new RAM("DDR4", ramOptions[random.nextInt(ramOptions.length)]));
    }

    @Override
    public void addStorage() {
        int[] storageOptions = {256, 512, 1024};
        computer.addComponent(new Storage("HDD", storageOptions[random.nextInt(storageOptions.length)]));
    }

    @Override
    public void addGPU() {
        String[] gpuModels = {"NVIDIA GTX 1050", "AMD Radeon RX 550", "Integrated Graphics"};
        computer.addComponent(new GPU(gpuModels[random.nextInt(gpuModels.length)]));
    }

    @Override
    public Computer build() {
        return computer;
    }
}

