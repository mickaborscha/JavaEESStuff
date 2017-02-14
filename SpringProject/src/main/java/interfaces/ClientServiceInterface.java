package interfaces;

import classes.Payments;

import java.util.List;

/**
 * Created by Oleg on 2/14/2017.
 */
public interface ClientServiceInterface {

    void setFirstName(String firstName);

    void setLastName(String lastName);

    void setTariff(String tariff);

    String getFirstName();

    String getLastName();

    String getTariff();

    List<Payments> getAllPayments();


}
