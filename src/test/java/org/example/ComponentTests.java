package org.example;

public class ComponentTests {

    public static void testCPUDescription() {
        CPU cpu = new CPU("Intel Core i5");
        if ("CPU: Intel Core i5".equals(cpu.getDescription())) {
            System.out.println("CPU description: PASS");
        } else {
            System.out.println("CPU description: FAIL");
        }
    }

    public static void testRAMDescription() {
        RAM ram = new RAM("DDR4", 16);
        if ("RAM: DDR4, Size: 16GB".equals(ram.getDescription())) {
            System.out.println("RAM description: PASS");
        } else {
            System.out.println("RAM description: FAIL");
        }
    }

    public static void testStorageDescription() {
        Storage storage = new Storage("SSD", 512);
        if ("Storage: SSD, Capacity: 512GB".equals(storage.getDescription())) {
            System.out.println("Storage description: PASS");
        } else {
            System.out.println("Storage description: FAIL");
        }
    }

    public static void testGPUDescription() {
        GPU gpu = new GPU("NVIDIA GTX 1050");
        if ("GPU: NVIDIA GTX 1050".equals(gpu.getDescription())) {
            System.out.println("GPU description: PASS");
        } else {
            System.out.println("GPU description: FAIL");
        }
    }
}
