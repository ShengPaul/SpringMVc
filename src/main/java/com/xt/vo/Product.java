package com.xt.vo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Integer proId;

    private String proName;

    private BigDecimal proPrice;

    private String proUnit;

    private Date createdate;

    private BigDecimal taxrate;

    private Integer producttypeId;

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proPrice=" + proPrice +
                ", proUnit='" + proUnit + '\'' +
                ", createdate=" + createdate +
                ", taxrate=" + taxrate +
                ", producttypeId=" + producttypeId +
                '}';
    }

    public Product() {
    }

    public Product(Integer proId, String proName, BigDecimal proPrice, String proUnit, Date createdate, BigDecimal taxrate, Integer producttypeId) {
        this.proId = proId;
        this.proName = proName;
        this.proPrice = proPrice;
        this.proUnit = proUnit;
        this.createdate = createdate;
        this.taxrate = taxrate;
        this.producttypeId = producttypeId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public BigDecimal getProPrice() {
        return proPrice;
    }

    public void setProPrice(BigDecimal proPrice) {
        this.proPrice = proPrice;
    }

    public String getProUnit() {
        return proUnit;
    }

    public void setProUnit(String proUnit) {
        this.proUnit = proUnit == null ? null : proUnit.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public BigDecimal getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(BigDecimal taxrate) {
        this.taxrate = taxrate;
    }

    public Integer getProducttypeId() {
        return producttypeId;
    }

    public void setProducttypeId(Integer producttypeId) {
        this.producttypeId = producttypeId;
    }
}