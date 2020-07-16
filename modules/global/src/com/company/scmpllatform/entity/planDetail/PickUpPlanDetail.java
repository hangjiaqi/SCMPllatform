package com.company.scmpllatform.entity.planDetail;

import com.company.scmpllatform.entity.plan.PickUpPlan;
import com.company.scmpllatform.entity.salesOrder.SalesOrder;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "TRIPARTITELOGISTICS_PICK_UP_PLAN_DETAIL")
@Entity(name = "tripartitelogistics_PickUpPlanDetail")
public class PickUpPlanDetail extends StandardEntity {
    private static final long serialVersionUID = -7343361159653382989L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SALES_ORDER_ID")
    protected SalesOrder salesOrder;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PICK_UP_PLAN_ID")
    protected PickUpPlan pickUpPlan;
    /**
     * 运输数量
     */
    @Column(name = "TRANSPORT_QUANTITY")
    protected Integer transportQuantity;
    /**
     * 实际运输数量
     */
    @Column(name = "ACTUAL_TRANSPORT_QUANTITY")
    protected Integer actualTransportQuantity;

    public Integer getActualTransportQuantity() {
        return actualTransportQuantity;
    }

    public void setActualTransportQuantity(Integer actualTransportQuantity) {
        this.actualTransportQuantity = actualTransportQuantity;
    }

    public Integer getTransportQuantity() {
        return transportQuantity;
    }

    public void setTransportQuantity(Integer transportQuantity) {
        this.transportQuantity = transportQuantity;
    }

    public PickUpPlan getPickUpPlan() {
        return pickUpPlan;
    }

    public void setPickUpPlan(PickUpPlan pickUpPlan) {
        this.pickUpPlan = pickUpPlan;
    }

    public SalesOrder getSalesOrder() {
        return salesOrder;
    }

    public void setSalesOrder(SalesOrder salesOrder) {
        this.salesOrder = salesOrder;
    }
}