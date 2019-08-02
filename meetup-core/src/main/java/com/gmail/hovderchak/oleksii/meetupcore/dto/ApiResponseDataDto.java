package com.gmail.hovderchak.oleksii.meetupcore.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ApiResponseDataDto {

    private String logo;
    private String header;

    public ApiResponseDataDto(String logo, String header) {
        this.logo = logo;
        this.header = header;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ApiResponseDataDto that = (ApiResponseDataDto) o;

        return new EqualsBuilder()
                .append(logo, that.logo)
                .append(header, that.header)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(logo)
                .append(header)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("logo", logo)
                .append("header", header)
                .toString();
    }
}
