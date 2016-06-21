package de.dieter.midgard.MidChar;

import android.content.Context;

/**
 * Project:  Chalpeca
 * Package:  de.dieter.midgard.MidChar
 * <p/>
 * Created by Dieter on 05.06.2016.
 */
public class Koerper {
    private String gestalt;
    private Float gewicht;
    private Float groesse;
    private String merkmale;
    private Context context;

    public Koerper(Context context) {
        this.context = context;
    }

    public String getGestalt() {
        return gestalt;
    }

    public void setGestalt(String gestalt) {
        this.gestalt = gestalt;
    }

    public Float getGewicht() {
        return gewicht;
    }

    public void setGewicht(Float gewicht) {
        this.gewicht = gewicht;
    }

    public Float getGroesse() {
        return groesse;
    }

    public void setGroesse(Float groesse) {
        this.groesse = groesse;
    }

    public String getMerkmale() {
        return merkmale;
    }

    public void setMerkmale(String merkmale) {
        this.merkmale = merkmale;
    }
}
