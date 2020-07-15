package com.jhw.modules.tec;

import com.clean.swing.app.AbstractSwingApplication;
import com.clean.swing.app.AbstractSwingModule;
import com.clean.swing.app.dashboard.DashBoardSimple;
import com.clean.swing.app.dashboard.DashboardConstants;
import com.jhw.swing.material.standars.MaterialIcons;
import com.jhw.swing.util.AbstractActionUtils;

public class TecSwingModule implements AbstractSwingModule {

    @Override
    public void register(AbstractSwingApplication app) {
        System.out.println("Creando 'Tecnologias'");
        registerTecnologyElements(app);
    }

    private void registerTecnologyElements(AbstractSwingApplication app) {
        DashBoardSimple dash = app.rootView().dashboard();

        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("JAVA 1.8.60(Lenguaje de programación)", MaterialIcons.TEC_JAVA));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("NetBeans 8.0(IDE)", MaterialIcons.TEC_NB));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("MySql 10.4.8 (BD)", MaterialIcons.TEC_MYSQL));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("XAMPP 3.2.4 (Cliente Servicios)", MaterialIcons.TEC_XAMPP));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("Git 2.20.1 (Control de versiones)", MaterialIcons.TEC_GIT));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("GitKraken 6.4.0 (Cliente Git)", MaterialIcons.TEC_GITKRAKEN));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("GitHub (Servidor Git)", MaterialIcons.TEC_GITHUB));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("Flaticon (Iconos)", MaterialIcons.TEC_FLATICON));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("Freepick (Diseños)", MaterialIcons.TEC_FREEPICK));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("Adobe (Ai y Ps para el diseño de imágenes)", MaterialIcons.TEC_ADOBE));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("Google (Material Design)", MaterialIcons.TEC_GOOGLE));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("JSON (Ficheros)", MaterialIcons.TEC_JSON));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("WhatsApp (Contacto: +53 5 4268660)", MaterialIcons.TEC_WHATSAPP));

    }

    /**
     * Dont need navigation
     *
     * @param string
     * @param o
     */
    @Override
    public void navigateTo(String string, Object... o) {
    }

}
