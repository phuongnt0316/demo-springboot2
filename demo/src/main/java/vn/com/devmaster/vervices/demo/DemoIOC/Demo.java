package vn.com.devmaster.vervices.demo.DemoIOC;

import org.springframework.stereotype.Component;

@Component
public class Demo {
    private  Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
