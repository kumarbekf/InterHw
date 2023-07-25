public class Flat implements RentAble {
    private int Person;

    public Flat(int person) {
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
        System.out.println(12000 + " мин сомдон Услуга толойт");
    }
}
