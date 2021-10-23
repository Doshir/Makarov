
import java.util.Objects;

public class Contact {
    private String name;
    private String surName;
    private int number;
    private String theNote;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getNumber() {
        return number;
    }

    public String getTheNote() {
        return theNote;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTheNote(String theNote) {
        this.theNote = theNote;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", number=" + number +
                ", theNote=" + theNote +
                '}';
    }

    public Contact(String name, String surName, int number, String theNote) {
        this.name = name;
        this.surName = surName;
        this.number = number;
        this.theNote = theNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return number == contact.number && theNote == contact.theNote && Objects.equals(name, contact.name) && Objects.equals(surName, contact.surName);
    }



}
