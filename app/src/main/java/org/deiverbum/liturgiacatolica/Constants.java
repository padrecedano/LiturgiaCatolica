package org.deiverbum.liturgiacatolica;

/**
 * Created by cedano on 25/7/16.
 */
public final class Constants {
    public static final String HOY = "20160729";
    public static final String OL_URL = "http://www.deiverbum.org/api/v1/h1.php?fecha=";
    public static final String LA_URL = "http://www.deiverbum.org/api/v1/h2.php?fecha=";
    public static final String HI1_URL = "http://www.deiverbum.org/api/v1/h31.php?fecha=";
    public static final String H4_URL = "http://www.deiverbum.org/api/v1/h4.php?fecha=";
    public static final String CSS_RED_A = "<font color=\"#A52A2A\">";
    public static final String CSS_RED_Z = "</font>";
    public static final String OL_TITULO = "<h2>" + CSS_RED_A + "OFICIO DE LECTURAS" + CSS_RED_Z + "</h2>";
    public static final String LA_TITULO = "<h2>" + CSS_RED_A + "LAUDES" + CSS_RED_Z + "</h2>";
    public static final String VI_TITULO = "<h2>" + CSS_RED_A + "VÍSPERAS" + CSS_RED_Z + "</h2>";
    public static final String HI_TITULO = "<h2>" + CSS_RED_A + "HORA INTERMEDIA" + CSS_RED_Z + "</h2>";
    public static final String CO_TITULO = "<h2>" + CSS_RED_A + "COMPLETAS" + CSS_RED_Z + "</h2>";
    public static final String BRS = "<br /><br />";
    public static final String BR = "<br />";
    public static final String CSS_SM_A = "<small>";
    public static final String CSS_SM_Z = "</small>";
    public static final String CSS_B_A = "<b>";
    public static final String CSS_B_Z = "</b>";
    public static final String HIMNO = BRS + CSS_RED_A + "HIMNO" + CSS_RED_Z + BRS;
    public static final String SALMODIA = BRS + CSS_RED_A + "SALMODIA" + CSS_RED_Z + BRS;
    public static final String PRIMERA_LECTURA = BRS + CSS_RED_A + "PRIMERA LECTURA" + CSS_RED_Z + BRS;
    public static final String SEGUNDA_LECTURA = BRS + CSS_RED_A + "SEGUNDA LECTURA" + CSS_RED_Z + BRS;
    public static final String RESP_UPPER = CSS_RED_A + "RESPONSORIO" + CSS_RED_Z;
    public static final String RESP_LOWER = "Responsorio";
    public static final String RESP_BREVE = CSS_RED_A + "RESPONSORIO BREVE" + CSS_RED_Z;
    public static final String LECTURA_BREVE = BRS + "LECTURA BREVE";
    public static final String PRE_ANT = CSS_RED_A + "Ant. " + CSS_RED_Z;
    public static final String NBSP_2 = " &nbsp;&nbsp;";
    public static final String NBSP_4 = " &nbsp;&nbsp;&nbsp;&nbsp;";
    public static final String NBSP_SALMOS = BR + "&nbsp;&nbsp;";
    public static final String RESP_V = CSS_RED_A + "V. " + CSS_RED_Z;
    public static final String RESP_A = CSS_RED_A + " * " + CSS_RED_Z;
    public static final String RESP_R = CSS_RED_A + "R. " + CSS_RED_Z;
    public static final String CE = BR + CSS_RED_A + "CÁNTICO EVANGÉLICO" + CSS_RED_Z + BRS + PRE_ANT;
    public static final String PRECES = BR + CSS_RED_A + "PRECES" + CSS_RED_Z + BRS;
    public static final String PRECES_IL = BRS + CSS_RED_A + "Se pueden añadir algunas intenciones libres." + CSS_RED_Z + BRS;
    public static final String OBIEN = BRS + CSS_RED_A + "O bien:" + CSS_RED_Z + BRS;

    public static final String PRECES_R = NBSP_SALMOS + CSS_RED_A + "– " + CSS_RED_Z;
    public static final String ORACION = BRS + CSS_RED_A + "ORACIÓN" + CSS_RED_Z + BRS;
    //Mensajes de error
    public static final String ERR_RESPONSORIO = CSS_RED_A + "¡ERROR! " + CSS_RED_Z + BR + "Hay un error en el responsorio de este día, " +
            "por favor comunícalo al desarrolador a la dirección siguiente: " + "a.cedano@deiverbum.org";

    private Constants() {
        // restrict instantiation
    }


}