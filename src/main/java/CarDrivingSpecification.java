public interface CarDrivingSpecification {
    void startEngine();
    void pressGas();
    int getGasLeftInTank();
    // can the car go for the kilometers provided, taking into consideration the gas left in the tank
    boolean canGoForGivenKms(float kms);
}
