package project2;

public class Pro2 {

    public static void main(String[] args) {
        Person dude = new Person("Jimmy");
        System.out.println(dude.getName());
        dude.setName("Brendan");
        System.out.println(dude.getName());

        Person gal = new Person();
        System.out.println(gal.getName());
        gal.setName("Lisa");
        gal.setAge(48);
        System.out.println(gal.getAge());
        gal.happyBirthday();
        System.out.println(gal.getAge());

        Dog rooster = new Dog("Rooster", "Rottie");
        gal.setDog(rooster);

        System.out.println(gal.getDog());
    }
}
