package classes;

import org.springmodules.validation.bean.conf.loader.annotation.handler.InThePast;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotNull;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Size;

import java.awt.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Oleg on 2/14/2017.
 */
public class Ticket {

    @InThePast
    private Date creationDate;

    @Size(max = 500,min = 0)
    private String messageHeader;

    @Size(max = 2500,min = 13)
    private String messageBody;

    @NotNull
    private String messageType;

    //private List <Image> images;

}
