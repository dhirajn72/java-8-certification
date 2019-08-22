/*
 * All Rights Reserved @Dhiraj
 */

package com.medlife;

import java.util.List;

/**
 * @author Dhiraj
 * @date 16/08/19
 */
public class DiscountServiceImpl implements DiscountService {
    @Override
    public List discountsAppliedOrdersList() {
        List<Discount> discounts= DataUtils.getDiscountList();
        List<Orders> orders= DataUtils.getOrders();
        for(Orders order:orders){
            for (Discount discount:discounts){
                if (order.getBill_amount()>discount.getMin_bill_amount()
                        && order.getOrder_time().isAfter(discount.getStart_time_of_day())
                        && order.getOrder_time().isBefore(discount.getEnd_time_of_day())
                        && order.getPayment_method().equals(discount.getPayment_method())){
                    System.out.println(order.getOrder_id()+" "+discount.getMax_discount()+" "+discount.getDiscount_code());

                }
                else if (order.getBill_amount()<discount.getMin_bill_amount()
                        && order.getOrder_time().isAfter(discount.getStart_time_of_day())
                        && order.getOrder_time().isBefore(discount.getEnd_time_of_day())){
                    System.out.println(order.getOrder_id()+" "+discount.getMax_discount()+" "+discount.getDiscount_code());
                }
            }
        }
        return null;
    }
}
