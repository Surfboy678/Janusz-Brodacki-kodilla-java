package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

    final class BigMac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static final String SESAME = "Sesame";
    public static final String NOSESAME = "No sesame";

    public static final String STANDARD = "Standard";
    public static final String THOUSAND_ISLANDS = "1000 Islands";
    public static final String BARBECUE = "Barbecue";

    public static final String SALAD = "Salad";
    public static final String ONIONS = "Onions";
    public static final String BACON = "Bacon";
    public static final String CHILI = "Chili";

    private BigMac(final String roll, int burgers, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigMacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(String roll) {
            if(roll == BigMac.SESAME || roll == BigMac.NOSESAME) {
                this.roll = roll;
                return this;
            } else {
                throw new IllegalStateException("Roll type: Sesame or No sesame");
            }
        }

        public BigMacBuilder quantityBurgers(int quantity) {
            this.burgers = quantity;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            if(sauce == BigMac.STANDARD || sauce == BigMac.THOUSAND_ISLANDS || sauce == BigMac.BARBECUE) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Sauce typeStandard or 1000 Islands or Barbecue!");
            }
        }

        public BigMacBuilder ingredient(String ingredient) {
            if(ingredient == BigMac.BACON || ingredient == BigMac.CHILI || ingredient == BigMac.ONIONS || ingredient == BigMac.SALAD ) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Illegal type!");
            }
        }

        public BigMac build() {
            return new BigMac(roll,burgers,sauce,ingredients);
        }
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}