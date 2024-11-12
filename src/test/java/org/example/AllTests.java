package org.example;

public class AllTests {

    public static void main(String[] args) {
        ComputerBuilderTests.testGamingComputerBuilder();
        ComputerBuilderTests.testOfficeComputerBuilder();
        ComputerBuilderTests.testBudgetComputerBuilder();

        ComponentTests.testCPUDescription();
        ComponentTests.testRAMDescription();
        ComponentTests.testStorageDescription();
        ComponentTests.testGPUDescription();
    }
}
