package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName() {
            return "Cat";
        }

        public Pet getChild(){

            return new Cat();
        }

    }

    public static class Dog extends Pet {
        public String getName() {
            return "Dog";
        }

        public Pet getChild(){

            return new Dog();
        }

    }

}

/*Кошки не должны быть абстрактными!
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы.
Классы Cat и Dog не должны быть абстрактными.


Требования:
1. Класс Pet должен быть абстрактным.
2. Класс Dog не должен быть абстрактным.
3. Класс Cat не должен быть абстрактным.
4. Класс Dog должен реализовать абстрактные методы из класса Pet.
5. Класс Cat должен реализовать абстрактные методы из класса Pet.*/
