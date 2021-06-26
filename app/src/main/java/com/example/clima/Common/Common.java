package com.example.clima.Common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static String API_KEY = "458b60e19aa93e660167b8bc69c4948e";
    public static String API_LINK = "http://api.openweathermap.org/data/2.5/wather";

    public static String apiRequest(String lat, String lng){
        StringBuilder sb = new StringBuilder(API_LINK);
        sb.append(String.format("?lat=%s&lon=%s&APPID=%s&units=metric",lat,lng,API_KEY));
        return sb.toString();
    }

    public static String unixTiempoHastaLaFecha(double unixTiempo){
       DateFormat fechaFormato = new SimpleDateFormat("HH:mm");
       Date fecha = new Date();
       fecha.setTime((long)unixTiempo*1000);
       return fechaFormato.format(fecha);
    }

    public static String getImage(String icon){
        return String.format("http://api.openweathermap.org/img/w/%s.png",icon);
    }

    public static String getNuevaFecha(){
        DateFormat formatoFecha = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        Date fecha = new Date();
        return formatoFecha.format(fecha);
    }


}
