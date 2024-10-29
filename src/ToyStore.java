public class ToyStore {

    public static void main(String[] args) {
    ToyStore myToyStore = new ToyStore();
}


    public ToyStore(){

        Bear bear1; //declare bear1
        bear1 = new Bear(); //construct bear1
        bear1.color = "brown";
        bear1.price = 8;
        bear1.hasBow = false;
        bear1.printInfo();//methods have parentheses
        HotWheel car1; //declare cat1
        car1 = new HotWheel(); //construct cat1
        car1.color = "hot pink";
        car1.speed = 50;
        car1.isRaceCar = true;
        car1.printInfo();//methods have parentheses


    }

}
