/*
 * All Rights Reserved @Dhiraj
 */

package com.medlife;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 16/08/19
 */
public class DataUtils {

    public static List<Discount> getDiscountList() {
        /*
        FLAT10 FLAT 10 200 4PM–10PM
        FEST15 PERCENT 15 200 40 6AM–10AM ONLINE
        FEST20 PERCENT 20 500 50 11AM–2PM COD
         */
        Discount discount1=new Discount("FLAT10", "FLAT", 10,200,0,
                LocalDateTime.of(2017,11,1,16,0,0,0),
                LocalDateTime.of(2017,11,1,22,0,0,0) ,null);

        Discount discount2=new Discount("FEST15", "PERCENT", 15,200,40,
                LocalDateTime.of(2017,11,1,6,0,0,0),
                LocalDateTime.of(2017,11,1,10,0,0,0) ,PaymentMethods.ONLINE);

        Discount discount3=new Discount("FEST20", "PERCENT", 20,500,50,
                LocalDateTime.of(2017,11,1,11,0,0,0),
                LocalDateTime.of(2017,11,1,14,0,0,0) ,PaymentMethods.COD);




        List<Discount> discounts= new ArrayList<>();
        discounts.add(discount1);
        discounts.add(discount2);
        discounts.add(discount3);
        return discounts;

    }

    public static List<Orders> getOrders() {

        /*
o1 100 8.15PM PAYTM
o2 501 6.15AM ONLINE
o3 200 2.15PM ONLINE
o4 225 6.30PM CASH
o5 400 7.15AM ONLINE
         */
        Orders orders1= new Orders(1,100, LocalDateTime.of(2017,11,1,8,15,0,0),PaymentMethods.PAYTM);
        Orders orders2= new Orders(2,501, LocalDateTime.of(2017,11,1,6,15,0,0),PaymentMethods.ONLINE);
        Orders orders3= new Orders(3,200, LocalDateTime.of(2017,11,1,14,15,0,0),PaymentMethods.ONLINE);
        Orders orders4= new Orders(4,225, LocalDateTime.of(2017,11,1,18,30,0,0),PaymentMethods.CASH);
        Orders orders5= new Orders(5,400, LocalDateTime.of(2017,11,1,7,15,0,0),PaymentMethods.ONLINE);
        List<Orders> ordersList= new ArrayList<>();
        ordersList.add(orders1);
        ordersList.add(orders2);
        ordersList.add(orders3);
        ordersList.add(orders4);
        ordersList.add(orders5);
        return ordersList;
    }
}
