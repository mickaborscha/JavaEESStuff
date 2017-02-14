package classes;

import com.sun.istack.internal.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Length;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Size;

import java.util.List;

/**
 * Created by Oleg on 2/14/2017.
 */
public class Client  {


    private int identification_number;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;

    //@Constraint(validatedBy = {TariffValidator.class})
    private String  tariff;

   // @Length
    private List<Payments> paymentsList;



}
