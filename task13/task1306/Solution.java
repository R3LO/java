package com.javarush.task.task13.task1306;

/* 
Баг в initializeIdAndName
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
//        {
//            this.id = id;
//            this.name = name;
//            return this;
//        }
    }

    static class User implements DBObject {

        long id;
        String name;
        @Override
        public User initializeIdAndName(long id, String name) { //
            this.id = id;
            this.name = name;
            return this; //

        } //

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }

}

/*Баг в initializeIdAndName
2. Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Поправить программу, чтобы компилировалась и работала.


Требования:
4. Метод initializeIdAndName должен присваивать значения полям id и name объекта типа User в соответствии с переданными ему параметрами
и возвращать этот объект.*/