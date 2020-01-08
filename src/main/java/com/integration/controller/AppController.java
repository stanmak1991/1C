package com.integration.controller;

import com.integration.types.resultbank.LogonResponseType;
import com.integration.types.resultbank.ResultBank;
import com.integration.types.resultbank.SuccessResultType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_XML_VALUE)
public class AppController {

    @RequestMapping(value = "/success", method = RequestMethod.POST)
    public ResultBank returnSuccess() {
        LogonResponseType logonResponse = new LogonResponseType("8867755b6fbb4ae296aa0ac6b179ae88");
        SuccessResultType successResultType = new SuccessResultType(logonResponse);
        return new ResultBank(successResultType);
    }
}
