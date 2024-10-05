public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", "Иванов", 18);
        Place place = new Place("Coffee like", "Университетская 1");
        PersonInPlace personInPlace = new PersonInPlace(person, place);

        System.out.println(personInPlace);
    }
}