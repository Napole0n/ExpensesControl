/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mgsoft.excontrol.util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author murilo.goedert
 */
public class DataUtil {

    public Date stringToDate(String str) {
        Calendar cal = Calendar.getInstance();
        String[] vet = str.split("/");
        cal.set(Calendar.DATE, Integer.parseInt(vet[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(vet[1]) - 1);
        cal.set(Calendar.YEAR, Integer.parseInt(vet[2]));
        return cal.getTime();
    }

    public String dateToString(Date dat) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dat);
        return cal.get(Calendar.DATE) + "/" + cal.get(Calendar.MONTH) + 1 + "/" + cal.get(Calendar.YEAR);
    }

}
