package de.dieter.midgard.MidChar;

import android.content.Context;

/**
 * Project:  Chalpeca
 * Package:  de.dieter.midgard.MidChar
 * <p/>
 * Created by Dieter on 05.06.2016.
 */
public class GStand {
    private String titel;
    private String beschreibung;
    private Integer initialGold;
    private Float initialWeaponVal;
    private Float initialArmorVal;
    private Float initialHorseVal;
    private Float initialToolVal;
    private Context context;

    public GStand(Context context) {
        this.context = context;
    }

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

    public Integer getInitialGold() {
        return initialGold;
    }

    public void setInitialGold(Integer initialGold) {
        this.initialGold = initialGold;
    }

    public Float getInitialWeaponVal() {
        return initialWeaponVal;
    }

    public void setInitialWeaponVal(Float initialWeaponVal) {
        this.initialWeaponVal = initialWeaponVal;
    }

    public Float getInitialArmorVal() {
        return initialArmorVal;
    }

    public void setInitialArmorVal(Float initialArmorVal) {
        this.initialArmorVal = initialArmorVal;
    }

    public Float getInitialHorseVal() {
        return initialHorseVal;
    }

    public void setInitialHorseVal(Float initialHorseVal) {
        this.initialHorseVal = initialHorseVal;
    }

    public Float getInitialToolVal() {
        return initialToolVal;
    }

    public void setInitialToolVal(Float initialToolVal) {
        this.initialToolVal = initialToolVal;
    }
}
