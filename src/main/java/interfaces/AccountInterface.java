package interfaces;

import java.util.ArrayList;

public interface AccountInterface {
    double getBalance();
    int getAccountNumber();
    String getName();
    double addSpending(double spending);
    ArrayList<Double> getSpendings();
}
