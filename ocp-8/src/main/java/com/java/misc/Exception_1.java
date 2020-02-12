/*
 * All Rights Reserved @Dhiraj
 */

package com.java.misc;

/**
 * @author Dhiraj
 * @date 19/08/19
 */
public class Exception_1 {
    public static void main(String[] args) {
        String str=getLastFourMonths(4,4);
        System.out.println(str);
    }


    public static final String getLastFourMonths(int editMonth, int scenarioStartMonth) {
        StringBuilder months = new StringBuilder();
        if (editMonth == 1) {
            if (editMonth == scenarioStartMonth) return "";
            int m = 13 - 4;
            for (int i = m; i < 13; i++) {
                months = getString(scenarioStartMonth, months, i);
            }
        } else if (editMonth == 2) {
            if (editMonth == scenarioStartMonth) return "";
            int m = 14 - 4;
            int count = 0;
            if (scenarioStartMonth == 1) {
                return "1";
            } else {
                for (int i = m; i < 14; i++) {
                    if (i >= scenarioStartMonth) {
                        if (i > 12)
                            months.append(++count).append(",");
                        else
                            months.append(i).append(",");
                    }
                }
            }
        } else if (editMonth == 3) {
            if (editMonth == scenarioStartMonth) return "";
            int m = 15 - 4;
            int count = 0;
            if (scenarioStartMonth == 1) {
                return "1,2";
            }
            if (scenarioStartMonth == 2) return "2";
            else {
                for (int i = m; i < 15; i++) {
                    if (i >= scenarioStartMonth) {
                        if (i > 12)
                            months.append(++count).append(",");
                        else
                            months.append(i).append(",");
                    }
                }
            }
        } else {
            if (editMonth == scenarioStartMonth) return "";
            int m = editMonth - 4;
            for (int i = m; i < editMonth; i++) {
                months = getString(scenarioStartMonth, months, i);
            }
        }
        return months.deleteCharAt(months.length() - 1).toString();
    }

    private static StringBuilder getString(int scenarioStartMonth, StringBuilder months, int i) {
        if (i >= scenarioStartMonth)
            months.append(i).append(",");
        return months;
    }
}