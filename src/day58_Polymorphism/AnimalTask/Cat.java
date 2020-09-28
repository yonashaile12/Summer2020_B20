package day58_Polymorphism.AnimalTask;
/*
2. create subclass of Animal named Cat
            variable: catName
            methods: scratch, toString
 */
public class Cat extends Animal{

    public String catName;

    public Cat(String catName, int age, char gender) {
        super(age, gender);
        this.catName = catName;
    }

    public void scratch(){
        System.out.println("Cat "+catName+" is scratching");
    }

    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
