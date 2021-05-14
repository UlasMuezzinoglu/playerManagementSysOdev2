package com.playerManagementSysOdev.Entities;

import java.time.LocalDate;

public class Campaign {
    private int id;
    private String campaignName;
    private double discountRate;
    private LocalDate startDate;
    private LocalDate endDate;

    public Campaign() {

    }

    public Campaign(int id, String campaignName, double discountRate, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.campaignName = campaignName;
        this.discountRate = discountRate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
