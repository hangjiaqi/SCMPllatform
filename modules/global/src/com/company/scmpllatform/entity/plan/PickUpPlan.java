package com.company.scmpllatform.entity.plan;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "TRIPARTITELOGISTICS_PICK_UP_PLAN")
@Entity(name = "tripartitelogistics_PickUpPlan")
public class PickUpPlan extends StandardEntity {
    private static final long serialVersionUID = -7106190557148746982L;

    @Column(name = "SALES_ORDER_NR")
    protected String salesOrderNr;

    /**
     * 计划日期
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "PLANNED_TIME")
    protected Date plannedTime;
    /**
     * 计划数量
     */
    @Column(name = "PLANNED_QTY")
    protected Integer plannedQty;
    /**
     * 实际数量
     */
    @Column(name = "ACTUAL_QTY")
    protected Integer actualQty;
    /**
     * 实际日期
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "ACTUAL_TIME")
    protected Date actualTime;
    /**
     * 生成日期
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "GENERATE_TIME")
    protected Date generateTime;

    public Date getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(Date generateTime) {
        this.generateTime = generateTime;
    }

    public Date getActualTime() {
        return actualTime;
    }

    public void setActualTime(Date actualTime) {
        this.actualTime = actualTime;
    }

    public Integer getActualQty() {
        return actualQty;
    }

    public void setActualQty(Integer actualQty) {
        this.actualQty = actualQty;
    }

    public Integer getPlannedQty() {
        return plannedQty;
    }

    public void setPlannedQty(Integer plannedQty) {
        this.plannedQty = plannedQty;
    }

    public Date getPlannedTime() {
        return plannedTime;
    }

    public void setPlannedTime(Date plannedTime) {
        this.plannedTime = plannedTime;
    }

    public String getSalesOrderNr() {
        return salesOrderNr;
    }

    public void setSalesOrderNr(String salesOrderNr) {
        this.salesOrderNr = salesOrderNr;
    }
}