package _5kyu;

import java.util.Map;

public class PeteBaker {
    public static void main(String[] args) {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);

        System.out.println(cakes(recipe, available));
    }

    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int cakes = Integer.MAX_VALUE;
        if  (!available.keySet().containsAll(recipe.keySet())) {
            return 0;
        } else {
            for (Map.Entry<String, Integer> rec : recipe.entrySet()) {
                int count = available.get(rec.getKey()) / rec.getValue();
                if (count < cakes) {
                    cakes = count;
                }
            }
        }
        return cakes;
    }
}

/*
return recipe.entrySet().stream().mapToInt(e -> available.getOrDefault(e.getKey(), 0) / e.getValue()).min().orElse(0);
 */