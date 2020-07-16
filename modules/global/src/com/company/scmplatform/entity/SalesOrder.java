package com.company.scmplatform.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|salesDoc")
@Table(name = "SCMPLLATFORM_SALES_ORDER")
@Entity(name = "scmpllatform$SalesOrder")
public class SalesOrder extends StandardEntity {
    private static final long serialVersionUID = 6744920234175725052L;

    @Column(name = "SALES_DOC", columnDefinition = "工厂订单号")
    protected String salesDoc;

    @Column(name = "QUANTITY", columnDefinition = "订单数量")
    protected Integer quantity;

    @Column(name = "MATERIAL_NUMBER", columnDefinition = "工厂物料号")
    protected String materialNumber;

    @Column(name = "TYPE_", columnDefinition = "机型")
    protected String type;

    @Column(name = "KLU", columnDefinition = "klu")
    protected String klu;

    @Temporal(TemporalType.DATE)
    @Column(name = "REQ_DEL", columnDefinition = "客户要求工厂发运时间")
    protected Date reqDel;

    @Temporal(TemporalType.DATE)
    @Column(name = "LATEST_DEL", columnDefinition = "工厂最+J22新预计发货日期")
    protected Date latestDel;

    @Temporal(TemporalType.DATE)
    @Column(name = "NEXT_DEL", columnDefinition = "错过后下一次预计发货日期")
    protected Date nextDel;

    @Column(name = "PO_NR", columnDefinition = "贸易商采购订单号")
    protected String poNr;

    @Temporal(TemporalType.DATE)
    @Column(name = "ONE_DEL", columnDefinition = "工厂最初确认发货日期")
    protected Date oneDel;

    @Temporal(TemporalType.DATE)
    @Column(name = "ASSEMBLY_DATE", columnDefinition = "工厂最新预计上线生产日期")
    protected Date assemblyDate;

    @Column(name = "BAN", columnDefinition = "实际已上线数量")
    protected Integer ban;

    @Column(name = "VFM", columnDefinition = "主机下线数量")
    protected Integer vfm;

    @Temporal(TemporalType.DATE)
    @Column(name = "VFMB_DATE", columnDefinition = "疑似主机及附件包发往stute日期")
    protected Date vfmbDate;

    @Column(name = "VKU", columnDefinition = "货代已提走数量")
    protected Integer vku;

    @Temporal(TemporalType.DATE)
    @Column(name = "VKU_DATE", columnDefinition = "货代已全部提走日期")
    protected Date vkuDate;

    @Column(name = "AVAILABLE", columnDefinition = "可用数")
    protected Integer available;

    public void setSalesDoc(String salesDoc) {
        this.salesDoc = salesDoc;
    }

    public String getSalesDoc() {
        return salesDoc;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setKlu(String klu) {
        this.klu = klu;
    }

    public String getKlu() {
        return klu;
    }

    public void setReqDel(Date reqDel) {
        this.reqDel = reqDel;
    }

    public Date getReqDel() {
        return reqDel;
    }

    public void setLatestDel(Date latestDel) {
        this.latestDel = latestDel;
    }

    public Date getLatestDel() {
        return latestDel;
    }

    public void setNextDel(Date nextDel) {
        this.nextDel = nextDel;
    }

    public Date getNextDel() {
        return nextDel;
    }

    public void setPoNr(String poNr) {
        this.poNr = poNr;
    }

    public String getPoNr() {
        return poNr;
    }

    public void setOneDel(Date oneDel) {
        this.oneDel = oneDel;
    }

    public Date getOneDel() {
        return oneDel;
    }

    public void setAssemblyDate(Date assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    public Date getAssemblyDate() {
        return assemblyDate;
    }

    public void setBan(Integer ban) {
        this.ban = ban;
    }

    public Integer getBan() {
        return ban;
    }

    public void setVfm(Integer vfm) {
        this.vfm = vfm;
    }

    public Integer getVfm() {
        return vfm;
    }

    public void setVfmbDate(Date vfmbDate) {
        this.vfmbDate = vfmbDate;
    }

    public Date getVfmbDate() {
        return vfmbDate;
    }

    public void setVku(Integer vku) {
        this.vku = vku;
    }

    public Integer getVku() {
        return vku;
    }

    public void setVkuDate(Date vkuDate) {
        this.vkuDate = vkuDate;
    }

    public Date getVkuDate() {
        return vkuDate;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getAvailable() {
        return available;
    }


}