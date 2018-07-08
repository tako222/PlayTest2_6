package models;

import java.util.Arrays;
import java.util.List;

/**
 * 謎のフルーツ情報保持クラス
 */
public class Fruits {

    List<String> fruits;

    public Fruits() {
        fruits = Arrays.asList(
                "Apple",
                "Orange",
                "Banana",
                "WaterMelon",
                "Strawberry",
                "Blueberry",
                "",
                "Melon");
    }

    public List<String> getFruits() {
        return this.fruits;
    }

}
