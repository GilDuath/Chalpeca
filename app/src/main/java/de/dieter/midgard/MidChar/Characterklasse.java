package de.dieter.midgard.MidChar;

import android.content.Context;

/**
 * Project:  Chalpeca
 * Package:  de.dieter.midgard.MidChar
 * <p/>
 * Created by Dieter on 05.06.2016.
 */
public class Characterklasse {
    private String titel;
    private String unterKlasse;
    private String beschreibung;
    private Context context;

    public Characterklasse(Context context) {
        this.context = context;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getUnterKlasse() {
        return unterKlasse;
    }

    public void setUnterKlasse(String unterKlasse) {
        this.unterKlasse = unterKlasse;
    }
}
