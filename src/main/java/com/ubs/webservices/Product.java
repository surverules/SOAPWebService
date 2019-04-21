package com.ubs.webservices;

import com.sun.xml.ws.api.server.WebServiceContextDelegate;
import com.sun.xml.ws.transport.http.servlet.WSServletContextListener;

public class Product {
    public Product(String name, String group) {
        this.name = name;
        this.group = group;
    }

    String name;
    String group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

}
