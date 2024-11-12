package org.example;

public class ComputerBuilderTests {

    public static void testGamingComputerBuilder() {
        ComputerBuilder builder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        Computer gamingPC = director.constructComputer();

        System.out.println("Testing GamingComputerBuilder...");
        if (gamingPC != null && gamingPC.getComponents().size() == 4) {
            System.out.println("Gaming PC has 4 components: PASS");
        } else {
            System.out.println("Gaming PC component count test: FAIL");
        }
    }

    public static void testOfficeComputerBuilder() {
        ComputerBuilder builder = new OfficeComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        Computer officePC = director.constructComputer();

        System.out.println("Testing OfficeComputerBuilder...");
        if (officePC != null && officePC.getComponents().size() == 4) {
            System.out.println("Office PC has 4 components: PASS");
        } else {
            System.out.println("Office PC component count test: FAIL");
        }
    }

    public static void testBudgetComputerBuilder() {
        ComputerBuilder builder = new BudgetComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        Computer budgetPC = director.constructComputer();

        System.out.println("Testing BudgetComputerBuilder...");
        if (budgetPC != null && budgetPC.getComponents().size() == 4) {
            System.out.println("Budget PC has 4 components: PASS");
        } else {
            System.out.println("Budget PC component count test: FAIL");
        }
    }
}
