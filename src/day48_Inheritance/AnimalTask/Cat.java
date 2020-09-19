package day48_Inheritance.AnimalTask;

public class Cat extends Animal{

      /*
    variables: 4
    methods: 6
     */

    public Cat(String name, String size, int age, char gender, String breed, int weight) {
        setInfo(name,size,age,gender,breed,weight);
    }

    public void meow(){
        System.out.println(name + " meowing");
    }
}
