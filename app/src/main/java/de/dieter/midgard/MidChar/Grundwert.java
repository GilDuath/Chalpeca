package de.dieter.midgard.MidChar;

import android.content.Context;
import android.widget.Toast;

import de.dieter.midgard.CharacterMain;

/**
 * Project:  Chalpeca
 * Package:  de.dieter.midgard.MidChar
 * <p/>
 * Created by Dieter on 06.06.2016.
 */
public class Grundwert {
    private String name;
    private Integer wert;
    private Integer bonus;
    private Integer buff;
    private Context context;

    public Grundwert(Context context, String name)
    {
        this.context = context;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWert() {
        return wert;
    }

    public void setWert(Integer wert) {
        //  Validierung
        //      Wert darf nicht kleiner 1 oder größer 100 sein
        if (wert < 1) {
            //// TODO: 06.06.2016 Toast aus untergeordneter Klasse an das Activity übergeben
            String msg = "Wert " + wert + " zu klein.  Darf nicht kleiner als 1 sein";
            Toast warning = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
            warning.show();
            System.out.println(msg);
        } else if (wert > 100) {
            String msg = "Wert " + wert + " zu groß.  Darf nicht größer als 100 sein";
            Toast warning = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
            warning.show();
            System.out.println(msg);
        } else {
            //  Ein neuer Wert wurde übergeben
            this.wert = wert;
            //   Gegebenenfalls Bonus eintragen
            if (wert <= 5) {
                this.bonus = -2;
            } else if (wert <= 20) {
                this.bonus = -1;
            } else if (wert > 95) {
                this.bonus = 2;
            } else if (wert > 80) {
                this.bonus = 1;
            }
        }
    }

    @Override
    public String toString(){
        return this.name + ": " + this.wert + "  Bonus: " + this.bonus + "  Buff: " + this.buff;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getBuff() {
        return buff;
    }

    public void setBuff(Integer buff) {
        this.buff = buff;
    }
}
