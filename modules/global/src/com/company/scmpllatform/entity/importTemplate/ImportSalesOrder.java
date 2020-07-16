package com.company.scmpllatform.entity.importTemplate;


import com.alibaba.excel.annotation.ExcelProperty;

import java.io.Serializable;
import java.util.Date;

public class ImportSalesOrder implements Serializable {

    @ExcelProperty(index = 0)
    private String salesDoc;

    @ExcelProperty(index = 1)
    private Integer quantity;

    @ExcelProperty(index = 2)
    private String klu;
    @ExcelProperty(index = 3)
    private String materialNumber;
    @ExcelProperty(index = 4)
    private String type;
    @ExcelProperty(index = 5)
    private Date reqDelivDate;
    @ExcelProperty(index = 6)
    private String purchaseOrderNumber;
    @ExcelProperty(index = 7)
    private String orderKind;
    @ExcelProperty(index = 8)
    private Date oneDel;
    @ExcelProperty(index = 9)
    private Date DeliveryDate;
    @ExcelProperty(index = 10)
    private Date nextPossibleDeliveryDate;
    @ExcelProperty(index = 11)
    private Date assemblyDate;
    @ExcelProperty(index = 12)
    private Integer ban;
    @ExcelProperty(index = 13)
    private Integer vfm;
    @ExcelProperty(index = 14)
    private Date vfmDate;
    @ExcelProperty(index = 15)
    private Date vfmbDate;
    @ExcelProperty(index = 16)
    private Integer vku;
    @ExcelProperty(index = 17)
    private Date vkuDate;
    @ExcelProperty(index = 18)
    private Integer ges;
    @ExcelProperty(index = 18)
    private String deliveryBlock;
    @ExcelProperty(index = 19)
    private String plant;
    @ExcelProperty(index = 20)
    private String finalCustomer;
    @ExcelProperty(index = 21)
    private String bonded;
    @ExcelProperty(index = 22)
    private String transport;
    @ExcelProperty(index = 23)
    private String oneStDestination;
    @ExcelProperty(index = 24)
    private String twoNdDestination;
    @ExcelProperty(index = 25)
    private Date pickUpPlandate;
    @ExcelProperty(index = 26)
    private Integer pickUpPlanqty;
    @ExcelProperty(index = 27)
    private Date pickUpActDate;
    @ExcelProperty(index = 28)
    private Integer pickUpctQty;
    @ExcelProperty(index = 29)
    private Date requestETA;
    @ExcelProperty(index = 30)
    private Date forecastETA;
    @ExcelProperty(index = 31)
    private String advanceDelay;
    @ExcelProperty(index = 32)
    private String uploadedBC;
    @ExcelProperty(index = 33)
    private String uploadedBL;
}