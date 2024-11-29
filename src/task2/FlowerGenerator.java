package task2;

import java.util.Random;

public class FlowerGenerator {
    public static void main(String[] args) {
        String[][] flowers = {
            {"Corn Poppy", "Papaver rhoeas", "A vibrant red flower commonly found in Polish meadows."},
            {"Lily of the Valley", "Convallaria majalis", "A delicate white flower with a sweet fragrance, Poland's national flower."},
            {"Common Snowdrop", "Galanthus nivalis", "A small white flower that blooms early in spring, symbolizing hope."},
            {"Field Forget-Me-Not", "Myosotis arvensis", "A tiny blue flower representing remembrance, often seen in the Polish countryside."},
            {"Common Daisy", "Bellis perennis", "A cheerful flower with white petals and a yellow center, symbolizing innocence."},
            {"Meadow Buttercup", "Ranunculus acris", "A bright yellow flower growing in fields and meadows across Poland."},
            {"Oxeye Daisy", "Leucanthemum vulgare", "A large daisy-like flower with white petals and a golden center, symbolizing purity."},
            {"European Columbine", "Aquilegia vulgaris", "A beautiful blue or purple flower with a unique shape, found in Polish gardens."},
            {"Common Heather", "Calluna vulgaris", "A purple-pink flower that thrives in Polish highlands, symbolizing admiration."},
            {"Wild Rose", "Rosa canina", "A delicate pink or white flower with thorny stems, found in hedgerows across Poland."}
        };
        
        Random random = new Random();
        int index = random.nextInt(flowers.length);

        System.out.println("Here is your random flower:");
        System.out.println("Common Name: " + flowers[index][0]);
        System.out.println("Scientific Name: " + flowers[index][1]);
        System.out.println("Description: " + flowers[index][2]);
    }
}

