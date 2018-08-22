package org.vaadin.elmot.v10osgi.hack;

import com.vaadin.flow.server.VaadinServlet;
import com.vaadin.flow.server.VaadinServletConfiguration;

import javax.servlet.annotation.WebServlet;

@WebServlet(asyncSupported = true, urlPatterns = { "/view/*" })
@VaadinServletConfiguration(productionMode = false)
public class ViewTestServlet extends VaadinServlet {

}
