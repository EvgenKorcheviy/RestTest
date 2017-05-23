package entity;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Evgen on 22.05.2017.
 */
public class Profile {
    private String name;

    public Profile(String name) {
        this.name = name;
    }

    public Profile() {
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "name='" + name + '\'' +
                '}';
    }
}
