package com.jhw.module.util.tec;

import com.clean.swing.app.AbstractSwingApplication;
import com.clean.swing.app.DefaultAbstractSwingMainModule;
import com.clean.swing.app.dashboard.DashBoardSimple;
import com.clean.swing.app.dashboard.DashboardConstants;
import com.jhw.swing.material.standards.MaterialIcons;
import com.jhw.swing.util.AbstractActionUtils;

public class TecSwingModule extends DefaultAbstractSwingMainModule {

    private TecSwingModule() {
    }

    public static TecSwingModule init() {
        return new TecSwingModule();
    }

    @Override
    public void register(AbstractSwingApplication app) {
        System.out.println("Iniciando 'Tecnologias'");
        registerTecnologyElements(app);
    }

    private void registerTecnologyElements(AbstractSwingApplication app) {
        DashBoardSimple dash = app.rootView().dashboard();

        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("JAVA 1.8.60(Lenguaje de programación)", MaterialIcons.TEC_JAVA));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("NetBeans 12.0(IDE)", MaterialIcons.TEC_NB));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("Spring Boot 2.1.7 (Servicio REST)", MaterialIcons.TEC_SPRING));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("Apache Tomcat 9.0.22 (Host servicio REST)", MaterialIcons.TEC_TOMCAT));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("MySql 10.4.11-MariaDB (BD)", MaterialIcons.TEC_MYSQL));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("XAMPP 3.2.4 (Cliente de Servicios)", MaterialIcons.TEC_XAMPP));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("Git 2.20.1 (Control de versiones)", MaterialIcons.TEC_GIT));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("GitKraken 7.0.1 (Cliente Git)", MaterialIcons.TEC_GITKRAKEN));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("GitHub (Servidor Git)", MaterialIcons.TEC_GITHUB));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("Kanban (Organización de proyecto)", MaterialIcons.TEC_KANBAN));
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
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("Telegram (Contacto: +53 5 4268660)", MaterialIcons.TEC_WHATSAPP));

    }

}
