package com.javarush.task.task13.task1301;

/* 
Пиво
*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {
        public void sleepOnTheFloor (){

        }
        public void askForMore(String message) {

        }

        public void sayThankYou (){

        }
        @Override
        public boolean isReadyToGoHome(){
            return READY_TO_GO_HOME;
        }
    }
}

/*Пиво
1. Подумай, какой из двух интерфейсов нужно реализовать в классе BeerLover.
2. Добавь к классу BeerLover этот интерфейс и реализуй все его методы.
3. Подумай, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.


Требования:
3. В классе BeerLover должны быть реализованы все методы интерфейса Alcoholic.
4. В классе BeerLover должны быть реализованы все методы интерфейса Drinker.
5. Метод isReadyToGoHome должен возвращать значение переменной READY_TO_GO_HOME.*/