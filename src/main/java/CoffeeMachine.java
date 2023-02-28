public class CoffeeMachine {

    Coffee createCoffee(CoffeeType type){
        if (type == CoffeeType.AMERICANO) {
            Americano americano = new Americano();
            return americano;
        }

        else if (type == CoffeeType.CAPUCCINO){
            Capuccino capuccino = new Capuccino();
            return capuccino;
        }

        else if (type == CoffeeType.ESPRESSO) {
            Espresso espresso = new Espresso();
            return espresso;
                            }
        else {
            return null;
        }
    }
}
