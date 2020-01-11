package ru.openbank.marketplace.front.controller;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.openbank.marketplace.front.types.BankPartyType;
import ru.openbank.marketplace.front.types.CustomerPartyType;
import ru.openbank.marketplace.front.types.GetPacketListResponseType;
import ru.openbank.marketplace.front.types.GetSettingsResponseType;
import ru.openbank.marketplace.front.types.LogonResponseType;
import ru.openbank.marketplace.front.types.Packet;
import ru.openbank.marketplace.front.types.ParticipantType;
import ru.openbank.marketplace.front.types.Probe;
import ru.openbank.marketplace.front.types.ResultBank;
import ru.openbank.marketplace.front.types.SendPacketResponseType;
import ru.openbank.marketplace.front.types.SuccessResultType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.GregorianCalendar;

@RestController
@RequestMapping(value = "/1с", produces = MediaType.APPLICATION_XML_VALUE)
public class OneCController {

    @RequestMapping(value = "/Logon", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE)
    public ResultBank logon(@RequestHeader(name = "CustomerID") String customerId,
                            @RequestHeader(name = "ApiVersion") String apiVersion,
                            @RequestHeader(name = "AvailableAPIVersion") String availableAPIVersion) {
        LogonResponseType logonResponse = new LogonResponseType();
        logonResponse.setSID("8867755b6fbb4ae296aa0ac6b179ae88");
        SuccessResultType successResultType = new SuccessResultType();
        successResultType.setLogonResponse(logonResponse);
        ResultBank resultBank = new ResultBank();
        resultBank.setSuccess(successResultType);
        resultBank.setFormatVersion(apiVersion);
        return resultBank;
    }

    @RequestMapping(value = "/GetSettings", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE)
    public ResultBank getSettings(@RequestHeader(name = "CustomerID") String customerId,
                                  @RequestHeader(name = "Account") String account,
                                  @RequestHeader(name = "Inn") String inn,
                                  @RequestHeader(name = "Bic") String bic,
                                  @RequestHeader(name = "SID") String sid,
                                  @RequestHeader(name = "ApiVersion") String apiVersion,
                                  @RequestHeader(name = "AvailableAPIVersion") String availableAPIVersion) {
        SuccessResultType.GetSettingsResponse getSettingsResponse = new SuccessResultType.GetSettingsResponse();
        getSettingsResponse.setData(new GetSettingsResponseType.Data());
        getSettingsResponse.getData().setDockind("06");
        getSettingsResponse.getData().setValue(BytesTemp.bytes);
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(new GregorianCalendar(2015, Calendar.MARCH, 19, 11, 21, 2));
        getSettingsResponse.setCreationDate(calendar);
        getSettingsResponse.setId(customerId);
        SuccessResultType type = new SuccessResultType();
        type.setGetSettingsResponse(getSettingsResponse);
        ResultBank bank = new ResultBank();
        bank.setSuccess(type);
        bank.setFormatVersion(apiVersion);
        return bank;
    }

    @RequestMapping(value = "/SendPack", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE)
    public ResultBank sendPack(@RequestHeader(name = "CustomerID", required = true) String customerId,
                               @RequestHeader(name = "SID", required = true) String sid,
                               @RequestHeader(name = "ApiVersion", required = true) String apiVersion,
                               @RequestBody Packet packet) {
        ResultBank bank = new ResultBank();
        bank.setFormatVersion(apiVersion);
        SendPacketResponseType responseType = new SendPacketResponseType();
        responseType.setID("50214584626");
        SuccessResultType successResultType = new SuccessResultType();
        successResultType.setSendPacketResponse(responseType);
        bank.setSuccess(successResultType);
        return bank;
    }

    @RequestMapping(value = "/GetPackList", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResultBank getPackList(@RequestHeader(name = "CustomerID", required = true) String customerId,
                                  @RequestHeader(name = "SID", required = true) String sid,
                                  @RequestHeader(name = "ApiVersion", required = true) String apiVersion,
                                  @RequestParam(name = "date") String dateTime) {
        GetPacketListResponseType getPacketListResponse = new GetPacketListResponseType();
        getPacketListResponse.setTimeStampLastPacket(
                new XMLGregorianCalendarImpl(new GregorianCalendar(2015, Calendar.FEBRUARY, 19, 11, 15, 42)));
        getPacketListResponse.getPacketID().add("50214585876");
        SuccessResultType successResultType = new SuccessResultType();
        successResultType.setGetPacketListResponse(getPacketListResponse);
        ResultBank bank = new ResultBank();
        bank.setSuccess(successResultType);
        return bank;
    }

    @RequestMapping(value = "/GetPack", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public ResultBank getPack(@RequestHeader(name = "CustomerID", required = true) String customerId,
                              @RequestHeader(name = "SID", required = true) String sid,
                              @RequestHeader(name = "ApiVersion", required = true) String apiVersion,
                              @RequestParam(name = "id") String id) {
        Packet packet = new Packet();
        packet.setUserAgent("Back Office");
        packet.setId(id);
        XMLGregorianCalendar calendar = new XMLGregorianCalendarImpl(new GregorianCalendar(2015, Calendar.FEBRUARY, 19, 11, 15, 42));
        packet.setCreationDate(calendar);
        packet.setFormatVersion(apiVersion);
        BankPartyType bankPartyType = new BankPartyType();
        bankPartyType.setBic("044525888");
        ParticipantType sender = new ParticipantType();
        sender.setBank(bankPartyType);
        packet.setSender(sender);
        ParticipantType recipient = new ParticipantType();
        CustomerPartyType customerPartyType = new CustomerPartyType();
        customerPartyType.setId(customerId);
        recipient.setCustomer(customerPartyType);
        packet.setRecipient(recipient);
        SuccessResultType successResultType = new SuccessResultType();
        successResultType.setGetPacketResponse(packet);
        ResultBank bank = new ResultBank();
        bank.setSuccess(successResultType);
        return bank;
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE)
    public void getPack(@RequestBody Probe probe) {
        return;
    }
}
