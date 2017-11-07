package org.deiverbum.liturgiacatolica;

/**
 * Created by cedano on 25/7/16.
 */
public final class Constants {
    public static final int MY_DEFAULT_TIMEOUT = 15000;

    public static final String HOY = "20160729";
    public static final String URL_API = "http://deiverbum.org/api/v1/";

    public static final String OL_URL = URL_API + "oficio/";
    public static final String LA_URL = URL_API + "laudes/";
    public static final String HI1_URL = URL_API + "tercia/";
    public static final String H4_URL = URL_API + "visperas/";
    public static final String URL_HOMILIAS = URL_API + "homilias/";
    public static final String URL_EVANGELIO = URL_API + "evangelio/";

    public static final String URL_SANTO = "http://www.deiverbum.org/api/beta/santo/";

    public static final String CSS_RED_A = "<font color=\"#A52A2A\">";
    public static final String INVISIBLE_A = "<span style=\"width: 0.1px;\">";
    public static final String INVISIBLE_Z = "</span>";
    public static final String SEPARADOR = "≡";


    public static final String CSS_RED_Z = "</font>";
    public static final String OL_TITULO = "<h2>" + CSS_RED_A + "OFICIO DE LECTURA" + CSS_RED_Z + "</h2>";
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
    public static final String SALUDO_OFICIO = CSS_RED_A + "V." + CSS_RED_Z + " Señor, abre mis labios." + BR +
            CSS_RED_A + "R." + CSS_RED_Z + " Y mi boca proclamará tu alabanza." + BRS;
    public static final String INVITATORIO = "<h3>invitatorio</h3>";
    public static final String HIMNO = BRS + CSS_RED_A + "HIMNO" + CSS_RED_Z + BRS;
    public static final String SALMODIA = BRS + CSS_RED_A + "SALMODIA" + CSS_RED_Z + BRS;
    public static final String FIN_SALMO = "Gloria al Padre, y al Hijo, y al Espíritu Santo." + BRS
            + "Como era en el principio ahora y siempre, por los siglos de los siglos. Amén.";

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
    public static final String PRECES_IL = BRS + CSS_RED_A + "Se pueden añadir algunas intenciones libres." + CSS_RED_Z+BRS;
    public static final String PADRENUESTRO = BRS + CSS_RED_A + "PADRE NUESTRO" + CSS_RED_Z + BRS;
    public static final String OBIEN = BRS + CSS_RED_A + "O bien:" + CSS_RED_Z + BRS;

    public static final String PRECES_R = NBSP_SALMOS + CSS_RED_A + "– " + CSS_RED_Z;
    public static final String ORACION = BRS + CSS_RED_A + "ORACIÓN" + CSS_RED_Z + BRS;
    //Mensajes de error
    public static final String ERR_RESPONSORIO = CSS_RED_A + "¡ERROR! " + CSS_RED_Z + BR + "Hay un error en el responsorio de este día, " +
            "por favor comunícalo al desarrollador a la dirección siguiente: " + "padre.cedano@gmail.com" + BRS;

    public static final String ERR_CONEXION = CSS_RED_A + "¡ERROR! " + CSS_RED_Z + BR + "No estás conectado a internet." + BR +
            "En esta primera etapa de desarrollo la conexión a internet es necesaria para utilizar la aplicación. " +
            "En un futuro, D.M., implementaremos la posiblidad de utilizar la aplicación sin conexión.";

    public static final String ERR_GENERAL = CSS_RED_A + "¡ERROR! " + CSS_RED_Z + BR + "Lamentablemente ha ocurrido un error... " +
            "«El que esté sin pecado que tire la primera piedra.» " + BRS + "Es posible que " +
            "la liturgia de hoy aún no haya sido introducida. Intenta más tarde. Si el error persiste te ruego que me lo " +
            "comuniques a la dirección siguiente: " + CSS_RED_A + CSS_B_A + "padre.cedano@gmail.com " + CSS_RED_Z + CSS_B_Z + BRS +
            "Gracias por la paciencia y espero resolverlo pronto.";

    //Otros mensajes
    public static final String PACIENCIA = "La paciencia todo lo alcanza. Por favor espere ...";

    private Constants() {
        // restrict instantiation
    }


}