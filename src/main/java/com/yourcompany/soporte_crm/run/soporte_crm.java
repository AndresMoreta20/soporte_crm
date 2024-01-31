package com.yourcompany.soporte_crm.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con OpenXava Studio/Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class soporte_crm {

	public static void main(String[] args) throws Exception {
		DBServer.start("soporte_crm-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("soporte_crm"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
