import java.util.Objects;
import java.util.Set;

public class Passport {
    private Set<String> passportNumbers;
    private final String surname;
    private final String name;
    private final String patronymic;
    private final String dateOfBirth;


    public Passport(Set<String> passportNumber, String surname, String name, String patronymic, String dateOfBirth) {
        this.passportNumbers = passportNumber;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public Set<String> getPassportNumbers() {
        return passportNumbers;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String print (Set<String> passportNumber){
        for (String passport1 : passportNumber){
            if (passport1.equals(passportNumber)){
                return passport1;
            }
        }
        return null;
    }

    public boolean issetNumber(String s){
        return passportNumbers.contains(s);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumbers, passport.passportNumbers) && Objects.equals(surname, passport.surname) && Objects.equals(name, passport.name) && Objects.equals(patronymic, passport.patronymic) && Objects.equals(dateOfBirth, passport.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumbers, surname, name, patronymic, dateOfBirth);
    }

    @Override
    public String toString() {
        return surname + " " + name +", дата рождения "+   dateOfBirth+ ", номер паспорта "+ passportNumbers;
    }

}
