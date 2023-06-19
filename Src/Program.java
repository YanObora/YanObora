class Person {

    public Person(String name, String surname, String city, String phone) {

        this.name = name;

        this.surname = surname;

        this.city = city;

        this.phone = phone;

    }

    // "Позвонить гражданину + ИМЯ ФАМИЛИЯ + из города + ГОРОД можно по номеру + ТЕЛЕФОН"

    public String personInfo() {

        return "Позвонить гражданину " + name + " " + surname + " из города " + city + " можно по номеру " + phone;

    }

    private String name;

    private String surname;

    private String city;

    private String phone;

}