package de.dieter.midgard.MidChar;

import android.content.Context;

/**
 * Project:  Chalpeca
 * Package:  de.dieter.midgard.MidChar
 * <p/>
 * Created by Dieter on 05.06.2016.
 */
public class Religion {

    private String titel;
    private String beschreibung;
    private Context context;

    public Religion(Context context) {
        this.context = context;
    }

    protected Gottheit gott = new Gottheit(context);

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

}
