package classes;


import org.springmodules.validation.bean.conf.loader.annotation.handler.InThePast;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Size;

import java.util.Date;

/**
 * Created by Oleg on 2/14/2017.
 */
public class Payments {

    @InThePast
    private Date creationDate;

    @NotNull
    private double accrual;

    @NotNull
    private double reminder;

    private String comment;

    private double coef;
}
