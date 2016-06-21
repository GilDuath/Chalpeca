package de.dieter.midgard.MidChar;

import android.content.Context;

/**
 * Project:  Chalpeca
 * Package:  de.dieter.midgard.MidChar
 * <p/>
 * Created by Dieter on 05.06.2016.
 */
public class BaseChar {
    private String charName;
    private String herkunft;
    private String spezialisierung;
    private Integer grad;
    private Integer alter;
    private Context context;

    public Characterklasse charKlasse = new Characterklasse(context);
    public Religion glaube = new Religion(context);
    public GStand stand = new GStand(context);
    public Koerper gestalt = new Koerper(context);
    public Grundwert staerke = new Grundwert(context,"St");
    public Grundwert geschicklichkeit = new Grundwert(context,"Gs");
    public Grundwert gewandheit = new Grundwert(context,"Gw");
    public Grundwert konstitution = new Grundwert(context,"Ko");
    public Grundwert intelligenz = new Grundwert(context,"In");
    public Grundwert zaubertalent = new Grundwert(context,  "Zt");
    public Grundwert aussehen = new Grundwert(context,"Au");
    public Grundwert persAustrahlung = new Grundwert(context,"pA");
    public Grundwert willenskraft = new Grundwert(context,"Wk");
    public Grundwert bewegungsWeite = new Grundwert(context, "B");

    public Energiewert lebensPunkte = new Energiewert(context,"LP");
    public Energiewert ausdauerPunkte = new Energiewert(context, "AP");

    public BaseChar(Context context) {
        this.context = context;
        lebensPunkte = new Energiewert(context, "LP");
        ausdauerPunkte = new Energiewert(context,"AP");

        staerke = new Grundwert(context, "St");
    }

    public void loadFromFile(){
        // TODO: 06.06.2016 Filehandling zum einlesen eines bestehenden Chars

        //  Zunächst,  zur besseren Visualisierung mal einen CHAR generieren
        generiereRatwanati();

    }

    private void generiereRatwanati(){
        //  Standard Eigenschaften
        charName = "Ratwanati Basabi";
        herkunft = "Rawindra: Kanpur";
        spezialisierung = "Tempeltänzerin";
        grad = 6;
        alter = 22;

        //  Charakterklasse
        charKlasse.setTitel("Priester");
        charKlasse.setUnterKlasse("Beschützer");
        charKlasse.setBeschreibung("");

        //  Religion
        glaube.setTitel("Samsara (Kreislauf des Lebens)");
        glaube.setBeschreibung("Ewige wiedergeburt der Seele.  Nach dem Tod wird anhand des Karmas (Tatenregister) festgelegt in welchen Stand man wiedergeboren wird");
        glaube.gott.setName("Jellama");
        glaube.gott.setBeschreibung("Göttin des Tanzes, der Musik, der Lustbarkeit und Leidenschaft");
        glaube.gott.setAspekt("Fruchtbarkeit");
        glaube.gott.setTier("Katze");

        //  Gesellschaftlicher Stand
        stand.setTitel("Brahmane (Mittelschicht)");

        //  Körper
        gestalt.setGestalt("Schlank");
        gestalt.setGewicht(53f);
        gestalt.setGroesse(161f);
        gestalt.setMerkmale("");

        //  Grundwerte
        staerke.setWert(64);
        geschicklichkeit.setWert(92);
        gewandheit.setWert(98);
        konstitution.setWert(78);
        aussehen.setWert(82);
        persAustrahlung.setWert(84);
        willenskraft.setWert(54);
        intelligenz.setWert(43);
        zaubertalent.setWert(47);
        bewegungsWeite.setWert(22);

        //  Energiewerte
        lebensPunkte.setMaxWert(14);
        lebensPunkte.add(10);
        ausdauerPunkte.setMaxWert(30);
        ausdauerPunkte.add(25);
    }

    public Characterklasse getCharKlasse() {
        return charKlasse;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getHerkunft() {
        return herkunft;
    }

    public void setHerkunft(String herkunft) {
        this.herkunft = herkunft;
    }

    public String getSpezialisierung() {
        return spezialisierung;
    }

    public void setSpezialisierung(String spezialisierung) {
        this.spezialisierung = spezialisierung;
    }

    public Integer getGrad() {
        return grad;
    }

    public void setGrad(Integer grad) {
        this.grad = grad;
    }

    public Integer getAlter() {
        return alter;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }
}
