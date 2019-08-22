/*
 * All Rights Reserved @Dhiraj
 */

package com.medlife;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Dhiraj
 * @date 16/08/19
 */
public class Discount {
    private String discount_code;
    private String discount_type;
    private int discount ;
    private double min_bill_amount;
    private double max_discount;
    private LocalDateTime start_time_of_day;
    private LocalDateTime end_time_of_day;
    private PaymentMethods payment_method;

    public Discount(String discount_code, String discount_type, int discount, double min_bill_amount, double max_discount, LocalDateTime start_time_of_day, LocalDateTime end_time_of_day, PaymentMethods payment_method) {
        this.discount_code = discount_code;
        this.discount_type = discount_type;
        this.discount = discount;
        this.min_bill_amount = min_bill_amount;
        this.max_discount = max_discount;
        this.start_time_of_day = start_time_of_day;
        this.end_time_of_day = end_time_of_day;
        this.payment_method = payment_method;
    }

    public String getDiscount_code() {
        return discount_code;
    }

    public void setDiscount_code(String discount_code) {
        this.discount_code = discount_code;
    }

    public String getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(String discount_type) {
        this.discount_type = discount_type;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getMin_bill_amount() {
        return min_bill_amount;
    }

    public void setMin_bill_amount(double min_bill_amount) {
        this.min_bill_amount = min_bill_amount;
    }

    public double getMax_discount() {
        return max_discount;
    }

    public void setMax_discount(double max_discount) {
        this.max_discount = max_discount;
    }

    public LocalDateTime getStart_time_of_day() {
        return start_time_of_day;
    }

    public void setStart_time_of_day(LocalDateTime start_time_of_day) {
        this.start_time_of_day = start_time_of_day;
    }

    public LocalDateTime getEnd_time_of_day() {
        return end_time_of_day;
    }

    public void setEnd_time_of_day(LocalDateTime end_time_of_day) {
        this.end_time_of_day = end_time_of_day;
    }

    public PaymentMethods getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(PaymentMethods payment_method) {
        this.payment_method = payment_method;
    }
}
