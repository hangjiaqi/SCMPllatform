package com.company.scmpllatform.entity.salesOrder;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "TRIPARTITELOGISTICS_SALES_ORDER")
@Entity(name = "tripartitelogistics_SalesOrder")
public class SalesOrder extends StandardEntity {
    private static final long serialVersionUID = 7120381090767621148L;
    /**
     * 工厂订单号
     */
    @Column(name = "SALES_DOC")
    protected String salesDoc;
    /**
     * 订单数量
     */
    @Column(name = "QUANTITY")
    protected Integer quantity;
    /**
     * 工厂物料号
     */
    @Column(name = "MATERIAL_NUMBER")
    protected String materialNumber;
    /**
     * 机型
     */
    @Column(name = "TYPE_")
    protected String type;
    /**
     * kluNumber
     */
    @Column(name = "KLU")
    protected String klu;
    /**
     * 客户要求工厂发运时间
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "REQ_DEL")
    protected Date reqDel;
    /**
     * 贸易商采购订单号
     */
    @Column(name = "PO_NR")
    protected String poNr;
    /**
     * 工厂最初确认发货日期
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "ONE_DEL")
    protected Date oneDel;
    /**
     * 工厂最+J22新预计发货日期
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "LATEST_DEL")
    protected Date latestDel;

    /**
     * 错过后下一次预计发货日期
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "NEXT_DEL")
    protected Date nextDel;
    /**
     * 工厂最新预计上线生产日期
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "ASSEMBLY_DATE")
    protected Date assemblyDate;
    /**
     * 实际已上线数量
     */
    @Column(name = "BAN")
    protected Integer ban;
    /**
     * 主机下线数量
     */
    @Column(name = "VFM")
    protected Integer vfm;
    /**
     * 疑似主机及附件包发往stute日期
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "VFMB_DATE")
    protected Date vfmbDate;
    /**
     * 货代已提走数量
     */
    @Column(name = "VKU")
    protected Integer vku;
    /**
     * 货代已全部提走日期
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "VKU_DATE")
    protected Date vkuDate;
    /**
     * 可用数
     */
    @Column(name = "AVAILABLE")
    protected Integer available;

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Date getVkuDate() {
        return vkuDate;
    }

    public void setVkuDate(Date vkuDate) {
        this.vkuDate = vkuDate;
    }

    public Integer getVku() {
        return vku;
    }

    public void setVku(Integer vku) {
        this.vku = vku;
    }

    public Date getVfmbDate() {
        return vfmbDate;
    }

    public void setVfmbDate(Date vfmbDate) {
        this.vfmbDate = vfmbDate;
    }

    public Integer getVfm() {
        return vfm;
    }

    public void setVfm(Integer vfm) {
        this.vfm = vfm;
    }

    public Integer getBan() {
        return ban;
    }

    public void setBan(Integer ban) {
        this.ban = ban;
    }

    public Date getAssemblyDate() {
        return assemblyDate;
    }

    public void setAssemblyDate(Date assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    public Date getNextDel() {
        return nextDel;
    }

    public void setNextDel(Date nextDel) {
        this.nextDel = nextDel;
    }

    public Date getLatestDel() {
        return latestDel;
    }

    public void setLatestDel(Date latestDel) {
        this.latestDel = latestDel;
    }

    public Date getOneDel() {
        return oneDel;
    }

    public void setOneDel(Date oneDel) {
        this.oneDel = oneDel;
    }

    public String getPoNr() {
        return poNr;
    }

    public void setPoNr(String poNr) {
        this.poNr = poNr;
    }

    public Date getReqDel() {
        return reqDel;
    }

    public void setReqDel(Date reqDel) {
        this.reqDel = reqDel;
    }

    public String getKlu() {
        return klu;
    }

    public void setKlu(String klu) {
        this.klu = klu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSalesDoc() {
        return salesDoc;
    }

    public void setSalesDoc(String salesDoc) {
        this.salesDoc = salesDoc;
    }
}