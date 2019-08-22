/*
 * All Rights Reserved @Dhiraj
 */

package com.medlife;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 16/08/19
 */
public class TestClass {
    public static void main(String[] args) {
        DiscountService service=new DiscountServiceImpl();
        List results=service.discountsAppliedOrdersList();
    }
}
