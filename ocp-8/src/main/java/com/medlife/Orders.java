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
public class Orders {
    private int order_id;
    private double bill_amount;
    private LocalDateTime order_time;
    private PaymentMethods payment_method;

    public Orders(int order_id, double bill_amount, LocalDateTime order_time, PaymentMethods payment_method) {
        this.order_id = order_id;
        this.bill_amount = bill_amount;
        this.order_time = order_time;
        this.payment_method = payment_method;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public double getBill_amount() {
        return bill_amount;
    }

    public void setBill_amount(double bill_amount) {
        this.bill_amount = bill_amount;
    }

    public LocalDateTime getOrder_time() {
        return order_time;
    }

    public void setOrder_time(LocalDateTime order_time) {
        this.order_time = order_time;
    }

    public PaymentMethods getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(PaymentMethods payment_method) {
        this.payment_method = payment_method;
    }
}

