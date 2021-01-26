package day48_Inheritance.AnimalTask;

public class Dog extends Animal{
    //      sub(child)          super(parent)

    /*
    variables: 4
    method: 4
     */
    public Dog(String name, String size, int age, char gender, String breed, int weight){
        setInfo(name,size,age,gender,breed,weight);
    }
    public void bark(){
        System.out.println(name + " is barking");
    }
}
