package interfaces;

import java.util.Date;

/**
 * Created by Oleg on 2/14/2017.
 */
public interface PaymentsServiceInterface {

   /* void setCreationDate(Date creationDate);

    void setAccrual(double accrual);

    void setReminder(double reminder);

    void setCoef(double coef);*/



   void loadFromDataBase();

   Date getCreationDate();

   double getAccrual();

   double getReminder();

   String getComment();

   void buildComment();

   void setComment(String comment);





}
