import com.garden.*;

public class Garden_App {
    public static void main(String[] args) {

        Garden newGarden = new Garden;

        Flower myFlower1 = new Flower("yellow");
        Flower myFlower2 = new Flower("blue");
        Tree myTree1 = new Tree("purple");
        Tree myTree2 = new Tree("orange");

        myFlower1.water(40);
        myFlower2.water(40);
        myTree1.water(40);
        myTree2.water(40);

    }

}
