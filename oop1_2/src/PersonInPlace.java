public class PersonInPlace extends Person {
    private Place place;

    public PersonInPlace(Person person, Place place){
        super(person.getName(), person.getSurname(), person.getAge());
        this.place = place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }


    @Override
    public String toString() {
        return super.toString() + "\n" + place.toString() ;
    }
}
