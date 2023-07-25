public class Hotel implements RentAble {
    private int Person;

    public Hotel(int person) {
        Person = person;
    }

    public int getPerson() {
        return Person;
    }

    public void setPerson(int person) {
        Person = person;
    }

    @Override
    public void Rent() {
        System.out.println(10000 + " мин сомдон Аренда толойт");

    }
}
