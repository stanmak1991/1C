package ru.openbank.marketplace.front.controller;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.openbank.marketplace.front.types.GetSettingsResponseType;
import ru.openbank.marketplace.front.types.LogonResponseType;
import ru.openbank.marketplace.front.types.Packet;
import ru.openbank.marketplace.front.types.ResultBank;
import ru.openbank.marketplace.front.types.SuccessResultType;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.GregorianCalendar;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_XML_VALUE)
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
        return resultBank;
    }

    @RequestMapping(value = "/GetSettings", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE)
    public ResultBank GetSettings(@RequestHeader(name = "CustomerID") String customerId,
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
        getSettingsResponse.setFormatVersion("2.2.1");
        getSettingsResponse.setId("502036");
        SuccessResultType type = new SuccessResultType();
        type.setGetSettingsResponse(getSettingsResponse);
        ResultBank bank = new ResultBank();
        bank.setSuccess(type);
        return bank;
    }

    @RequestMapping(value = "/SendPack", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE)
    public ResultBank SendPack(@RequestHeader(name = "CustomerID", required = true) String customerId,
                               @RequestHeader(name = "SID", required = true) String sid,
                               @RequestHeader(name = "ApiVersion", required = true) String apiVersion,
                               @RequestBody Packet packet) {
        return new ResultBank();
    }
}
