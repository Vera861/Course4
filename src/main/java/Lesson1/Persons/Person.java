package Lesson1.Persons;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private String gender;
    private int age;

    public Person() {
    }

    public Person(String firstName,
                  String lastName,
                  String middleName,
                  String country,
                  String address,
                  String phone,
                  String gender,
                  int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public static Builder newBuilder() {
        return new Person().new Builder();
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + " " + lastName + " " + middleName + '\n' +
                "Пол: " + gender + '\n' +
                "Адрес: " + country + ", " + address + '\n' +
                "Телефон: " + phone + '\n' +
                "Возраст: " + age;
    }

    public class Builder {

        private String buildFirstName;
        private String buildLastName;
        private String buildMiddleName;
        private String buildCountry;
        private String buildAddress;
        private String buildPhone;
        private String buildGender;
        private int buildAge;

        private Builder() {

        }

        public Builder setBuildFirstName(String buildFirstName) {
            this.buildFirstName = buildFirstName;
            return this;
        }

        public Builder setBuildLastName(String buildLastName) {
            this.buildLastName = buildLastName;
            return this;
        }

        public Builder setBuildMiddleName(String buildMiddleName) {
            this.buildMiddleName = buildMiddleName;
            return this;
        }

        public Builder setBuildCountry(String buildCountry) {
            this.buildCountry = buildCountry;
            return this;
        }

        public Builder setBuildAddress(String buildAddress) {
            this.buildAddress = buildAddress;
            return this;
        }

        public Builder setBuildPhone(String buildPhone) {
            this.buildPhone = buildPhone;
            return this;
        }

        public Builder setBuildGender(String buildGender) {
            this.buildGender = buildGender;
            return this;
        }

        public Builder setBuildAge(int buildAge) {
            this.buildAge = buildAge;
            return this;
        }

        public Person build() {
            return new Person(buildFirstName,
                    buildLastName,
                    buildMiddleName,
                    buildCountry,
                    buildAddress,
                    buildPhone,
                    buildGender,
                    buildAge);
        }

    }

}