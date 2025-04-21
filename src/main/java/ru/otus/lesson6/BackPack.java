package ru.otus.lesson6;

public class BackPack {
    private String[] items = new String[5];

    public void openBackPack() {
        System.out.println("открыли рюкзак");
    }

    public String[] getAllItems() {
        String[] result = new String[countItems()];
        int i = 0;
        for (String item : items) {
            if (item != null) {
                result[i] = item;
                i++;
            }
        }
        return result;
    }

    public int countItems() {
        int k = 0;
        for (String item : items) {
            if (item != null) {
                k++;
            }
        }
        return k;
    }

    public void addItem(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
    }

    public void deleteItem(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(item)) {
                items[i] = null;
                return;
            }
        }
        System.out.println("такого предмета в рюкзаке нет!");
    }

}
