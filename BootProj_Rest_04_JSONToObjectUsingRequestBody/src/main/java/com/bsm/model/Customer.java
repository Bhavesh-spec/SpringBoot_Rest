package com.bsm.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;
@Data
public class Customer{
private Integer cno;
private String cname;
private String[] favColors;
private List<String> academics;
private Set<Long> phoneNumbers;
private Map<String,Double> billDetails;
private Address addrs;

//<Customer>
//<cno>123</cno>
//<cname>John Doe</cname>
//<favColors>
//    <favColors>Blue</favColors>
//    <favColors>Green</favColors>
//    <favColors>Red</favColors>
//</favColors>
//<academics>
//    <academics>Mathematics</academics>
//    <academics>Physics</academics>
//    <academics>Chemistry</academics>
//</academics>
//<phoneNumbers>
//    <phoneNumbers>1234567890</phoneNumbers>
//    <phoneNumbers>0987654321</phoneNumbers>
//</phoneNumbers>
//<billDetails>
//    <billDetails>
//        <Description>Electricity</Description>
//        <Amount>100.50</Amount>
//    </billDetails>
//    <billDetails>
//        <Description>Water</Description>
//        <Amount>30.25</Amount>
//    </billDetails>
//</billDetails>
//<addrs>
//   <houseNo>34 MN Nayar</houseNo>
//    <streetName>Main Street 123</streetName>
//    <location>Sample City</location>      
//    <pinCode>12345</pinCode>
//</addrs>
//</Customer>
}
