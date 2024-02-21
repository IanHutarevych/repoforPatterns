package creational.Prototype;


import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {
    private Map<String, Item> items = new HashMap<>();

    public ItemRegistry() {
        loadItems();
    }

    private void loadItems() {
        Weapon pistol = new Weapon("Pistol");
        items.put("pistol", pistol);

        Weapon rifle = new Weapon("Rifle");
        items.put("rifle", rifle);
    }

    public Item createItem(String type) {
        Item item = null;
        item = (Item) items.get(type).clone();
        return item;
    }
}
