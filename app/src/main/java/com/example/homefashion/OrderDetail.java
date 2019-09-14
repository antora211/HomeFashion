package com.example.homefashion;

public class OrderDetail {

    private String phone;
   private String order,cname;

    public OrderDetail(){}

    public OrderDetail(String phone, String order, String name) {
        this.phone = phone;
        this.order = order;
        this.cname = name;
    }

    public void setOrder(String order) {
        this.order = order;
    }
    public String getOrder() {
        return order;
    }

    public String getName() {
        return cname;
    }

    public void setName(String name) {
        this.cname = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
