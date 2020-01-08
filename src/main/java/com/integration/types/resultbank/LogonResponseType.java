package com.integration.types.resultbank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogonResponseType", propOrder = {
        "SID"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogonResponseType {

    @XmlElement(name = "SID")
    protected String SID;
}
