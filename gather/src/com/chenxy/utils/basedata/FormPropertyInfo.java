package com.chenxy.utils.basedata;

/**
 * Created by admin on 2016/10/24.
 */
public class FormPropertyInfo {

    private String propertyName;
    private String propertyType;
    private Integer propertyLength;
    private String propertydefault;
    private Boolean isReadable;
    private String propertyDoc;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public Integer getPropertyLength() {
        return propertyLength;
    }

    public void setPropertyLength(Integer propertyLength) {
        this.propertyLength = propertyLength;
    }

    public String getPropertydefault() {
        return propertydefault;
    }

    public void setPropertydefault(String propertydefault) {
        this.propertydefault = propertydefault;
    }

    public Boolean getIsReadable() {
        return isReadable;
    }

    public void setIsReadable(Boolean isReadable) {
        this.isReadable = isReadable;
    }

    public String getPropertyDoc() {
        return propertyDoc;
    }

    public void setPropertyDoc(String propertyDoc) {
        this.propertyDoc = propertyDoc;
    }
}
