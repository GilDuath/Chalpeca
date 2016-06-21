package de.dieter.midgard.MidChar;

import android.content.Context;

/**
 * Project:  Chalpeca
 * Package:  de.dieter.midgard.MidChar
 * <p/>
 * Created by Dieter on 05.06.2016.
 */
public class Gottheit {
    private String name;
    private String beschreibung;
    private String pantheon;
    private String aspekt;
    private String symbol;
    private String farbe;
    private String tier;
    private Context context;

    public Gottheit(Context context) {
        this.context = context;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getPantheon() {
        return pantheon;
    }

    public void setPantheon(String pantheon) {
        this.pantheon = pantheon;
    }

    public String getAspekt() {
        return aspekt;
    }

    public void setAspekt(String aspekt) {
        this.aspekt = aspekt;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
