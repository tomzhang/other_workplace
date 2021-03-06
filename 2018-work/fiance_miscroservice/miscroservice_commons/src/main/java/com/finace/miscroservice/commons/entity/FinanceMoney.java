package com.finace.miscroservice.commons.entity;

import java.math.BigDecimal;

/**
 * 富有投标记录,用户投资总数实体类
 */
public class FinanceMoney {

    private BigDecimal principal;
    private BigDecimal endProfit;
    private BigDecimal nowProfit;
    private BigDecimal withdrawPrincipal;
    private BigDecimal withdrawProfit;

    //标的名称
    private String borrowName;
    //投资记录状态
    private String bidStatus;

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getEndProfit() {
        return endProfit;
    }

    public void setEndProfit(BigDecimal endProfit) {
        this.endProfit = endProfit;
    }

    public BigDecimal getNowProfit() {
        return nowProfit;
    }

    public void setNowProfit(BigDecimal nowProfit) {
        this.nowProfit = nowProfit;
    }

    public BigDecimal getWithdrawPrincipal() {
        return withdrawPrincipal;
    }

    public void setWithdrawPrincipal(BigDecimal withdrawPrincipal) {
        this.withdrawPrincipal = withdrawPrincipal;
    }

    public BigDecimal getWithdrawProfit() {
        return withdrawProfit;
    }

    public void setWithdrawProfit(BigDecimal withdrawProfit) {
        this.withdrawProfit = withdrawProfit;
    }

    public String getBorrowName() {
        return borrowName;
    }

    public void setBorrowName(String borrowName) {
        this.borrowName = borrowName;
    }

    public String getBidStatus() {
        return bidStatus;
    }

    public void setBidStatus(String bidStatus) {
        this.bidStatus = bidStatus;
    }
}
