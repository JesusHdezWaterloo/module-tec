/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.module.util.tec;

import com.root101.clean.swing.app.AbstractSwingApplication;
import com.root101.clean.swing.app.DefaultAbstractSwingMainModule;
import com.root101.clean.swing.app.dashboard.DashBoardSimple;
import com.root101.clean.swing.app.dashboard.DashboardConstants;
import com.root101.swing.material.standards.MaterialIcons;
import com.root101.swing.util.AbstractActionUtils;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
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
                AbstractActionUtils.from("Gradle 5.4.1 (Automatización de compilación)", MaterialIcons.TEC_GRADLE));
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
                AbstractActionUtils.from("Google (Material Design)", MaterialIcons.TEC_MATERIAL_DESIGN));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("JSON (Ficheros)", MaterialIcons.TEC_JSON));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("WhatsApp (Contacto: +53 5 4268660)", MaterialIcons.TEC_WHATSAPP));
        dash.addKeyValue(DashboardConstants.DOWN_ELEMENT,
                AbstractActionUtils.from("Telegram (Contacto: +53 5 4268660)", MaterialIcons.TEC_TELEGRAM));

    }

}
