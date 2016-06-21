package de.dieter.midgard.MidChar;

import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;

import de.dieter.midgard.CharacterMain;
import de.dieter.midgard.R;

/**
 * Project:  Chalpeca
 * Package:  de.dieter.midgard.MidChar
 * <p>
 * Created by Dieter on 07.06.2016.
 */
public class Energiewert {
    private String name;
    private Integer maxWert = 0;
    private Integer aktWert = 0;
    private Context context;

    private TextView textView;
    private ProgressBar progBar;



    public Energiewert(Context context, String name)
    {
        this.context=context;
        this.name = name;
    }


    public void add(int value){
        //  Erhöht oder verringert den aktWert
        aktWert += value;
        if (aktWert > maxWert) {
            aktWert=maxWert;
        } else if (aktWert<0) {
            aktWert=0;
        }
    }

    public void addFull(){
        //  Setzt den aktWert auf maxWert
        aktWert = maxWert;
    }



    public String getName() {
        return name;
    }

    public Integer getMaxWert() {
        return maxWert;
    }

    public void setMaxWert(Integer maxWert) {
        this.maxWert = maxWert;
    }

    public Integer getAktWert() {
        return aktWert;
    }


    private void valueChanged()
    {

    }
}
