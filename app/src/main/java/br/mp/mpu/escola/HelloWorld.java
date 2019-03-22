package br.mp.mpu.escola;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.apache.commons.lang3.StringUtils;

@ManagedBean(name = "helloWorld")
@SessionScoped
public class HelloWorld {
    private String name;
    private String nameReversed;

    static String greetings = "Bem-vindo ao curso de deploy automático e padrões de qualidade!";

    public void clean() {
        this.name = this.nameReversed = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.nameReversed = StringUtils.reverse(name);
    }

    public String getNameReversed() {
        return nameReversed;
    }
}