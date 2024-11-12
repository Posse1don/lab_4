package org.example;

import java.util.Random;

public class GamingComputerBuilder implements ComputerBuilder {
    private final Computer computer = new Computer();
    private final Random random = new Random();

    @Override
    public void addCPU() {
        String[] cpuModels = {"Intel Core i7 14700 3.4 GHz", "Intel Core i9 14900 3.2 GHz", "AMD Ryzen 7 7800X3D 4.2 GHz", "AMD Ryzen 9 5950X 3.4 GHz"};
        computer.addComponent(new CPU(cpuModels[random.nextInt(cpuModels.length)]));
    }

    @Override
    public void addRAM() {
        int[] ramOptions = {16, 32, 64};
        computer.addComponent(new RAM("DDR4", ramOptions[random.nextInt(ramOptions.length)]));
    }

    @Override
    public void addStorage() {
        int[] storageOptions = {1024, 2048};
        computer.addComponent(new Storage("SSD", storageOptions[random.nextInt(storageOptions.length)]));
    }

    @Override
    public void addGPU() {
        String[] gpuModels = {"GeForce RTX 4060 8 GB", "GeForce RTX 4060 Ti Gaming X 16GB", "AMD RX 7800 XT 16 GB"};
        computer.addComponent(new GPU(gpuModels[random.nextInt(gpuModels.length)]));
    }

    @Override
    public Computer build() {
        return computer;
    }
}


