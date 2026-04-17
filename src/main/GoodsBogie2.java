package main;

public class GoodsBogie2 {

    String type;   // Cylindrical / Rectangular
    String cargo;

    public GoodsBogie2(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    public void assignCargo(String cargo) {
        try {
            // Rule: Rectangular cannot carry Petroleum
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            this.cargo = cargo;

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempted for: " + type);
        }
    }
}
