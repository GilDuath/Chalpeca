package de.dieter.midgard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import de.dieter.midgard.MidChar.BaseChar;

public class CharacterMain extends AppCompatActivity {

    private BaseChar baseChar;

    //  Charakter
    TextView charakter;
    TextView grad;
    TextView typ;
    TextView lpMax;
    TextView lpAkt;
    TextView apMax;
    TextView apAkt;

    //  Energiewerte
    ProgressBar lpBar;
    ProgressBar apBar;

    //  Grundwerte
    TextView staerke;
    TextView geschick;
    TextView gewandheit;
    TextView konst;
    TextView intelligenz;
    TextView aussehen;
    TextView persA;
    TextView selbstB;
    TextView willensK;
    TextView zauberT;
    TextView bewegung;


    TextView gg;
    TextView sg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_main);


        setCharacter();

        //  ein paar LP verlieren
        baseChar.lebensPunkte.add(-1);
        baseChar.ausdauerPunkte.addFull();

        this.refreshEnergie();


    }



    private void setCharacter()
    {
        charakter = (TextView) findViewById(R.id.tvCharakter);
        grad = (TextView) findViewById(R.id.tvGrad);
        typ = (TextView) findViewById(R.id.tvTyp);

        lpMax = (TextView) findViewById(R.id.tvLpMax);
        lpAkt = (TextView) findViewById(R.id.tvLpAkt);
        apMax = (TextView) findViewById(R.id.tvApMax);
        apAkt = (TextView) findViewById(R.id.tvApAkt);
        lpBar = (ProgressBar) findViewById(R.id.pbLP);
        apBar = (ProgressBar) findViewById(R.id.pbAP);

        staerke = (TextView) findViewById(R.id.tvSt);
        geschick = (TextView) findViewById(R.id.tvGs);
        gewandheit = (TextView) findViewById(R.id.tvGw);
        konst = (TextView) findViewById(R.id.tvKo);
        intelligenz = (TextView) findViewById(R.id.tvIntelligenz);
        aussehen = (TextView) findViewById(R.id.tvAu);
        persA = (TextView) findViewById(R.id.tvpA);
        willensK = (TextView) findViewById(R.id.tvWk);
        zauberT = (TextView) findViewById(R.id.tvZau);
        bewegung = (TextView) findViewById(R.id.tvBew);

        baseChar = new BaseChar(this.getBaseContext());
        baseChar.loadFromFile();

        this.refresh();


    }

    private void refresh() {
        refreshKopf();
        refreshGrundwerte();
        refreshEnergie();
    }

    private void refreshKopf() {
        charakter.setText(baseChar.getCharName());
        grad.setText(baseChar.getGrad().toString());
        typ.setText(baseChar.charKlasse.getTitel());
        if (baseChar.charKlasse.getUnterKlasse().length() >0){
            typ.setText(baseChar.charKlasse.getTitel() + ": " + baseChar.charKlasse.getUnterKlasse());
        }
    }

    private void refreshGrundwerte() {
        //  Grundwerte
        staerke.setText(baseChar.staerke.getWert().toString());
//        staerke.setHint(baseChar.bewegungsWeite.toString());
        geschick.setText(baseChar.geschicklichkeit.getWert().toString());
        gewandheit.setText(baseChar.gewandheit.getWert().toString());
        konst.setText(baseChar.konstitution.getWert().toString());
        intelligenz.setText(baseChar.intelligenz.getWert().toString());
        zauberT.setText(baseChar.zaubertalent.getWert().toString());
        aussehen.setText(baseChar.aussehen.getWert().toString());
        persA.setText(baseChar.persAustrahlung.getWert().toString());
        willensK.setText(baseChar.willenskraft.getWert().toString());
        bewegung.setText(baseChar.bewegungsWeite.getWert().toString());
        //      bewegung.setHint(baseChar.bewegungsWeite.toString());

    }

    private void refreshEnergie() {
        lpMax.setText(baseChar.lebensPunkte.getMaxWert().toString());
        lpAkt.setText(baseChar.lebensPunkte.getAktWert().toString());
        lpBar.setMax(baseChar.lebensPunkte.getMaxWert());
        lpBar.setProgress(baseChar.lebensPunkte.getAktWert());

        apMax.setText(baseChar.ausdauerPunkte.getMaxWert().toString());
        apAkt.setText(baseChar.ausdauerPunkte.getAktWert().toString());
        apBar.setMax(baseChar.ausdauerPunkte.getMaxWert());
        apBar.setProgress(baseChar.ausdauerPunkte.getAktWert());
    }


}
