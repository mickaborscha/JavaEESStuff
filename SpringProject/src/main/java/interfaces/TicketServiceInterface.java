package interfaces;

/**
 * Created by Oleg on 2/14/2017.
 */
public interface TicketServiceInterface {

    void setMessageHeader(String messageHeader);

    void setMessageBody(String messageBody);

    void setMessageType(String messageType);

    String getMessageHead();

    String getMessageBody();

    String getMessageType();

}
