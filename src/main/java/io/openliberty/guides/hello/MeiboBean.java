package io.openliberty.guides.hello;

import javax.enterprise.context.RequestScoped;
import javax.faces.webapp.FacesServlet;
import javax.inject.Named;

@Named
@RequestScoped
public class MeiboBean {

    private Integer number;
    private String name;
    FacesServlet f;

    public void toConsole() {
        System.out.println("number=" + this.number + "/ name=" + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}
