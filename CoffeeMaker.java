//Exercise

public class CoffeeMaker extends SmartKitchen {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
}
