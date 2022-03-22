/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devin
 */
public class Item {

    String identifier;
    String name;

    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getId() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }

        if (!(compare instanceof Item)) {
            return false;
        }

        Item compareItem = (Item) compare;

        if (identifier.equals(compareItem.identifier)) {
            return true;
        }

        return false;
    }

}
