// Author: Shawn Shroyer
// Date Dec 23, 2011
package dev.shroysha.pokemon.ejb;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public abstract class PokemonItem {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String itemId;

    @Getter
    @NonNull
    private String itemName;

    public abstract void useItem(Pokemon pokemon);


    public static class Potion extends PokemonItem {

        public final int POTION_HEALTH_INCREASE = 20;

        public Potion() {
            super("Potion");
        }

        public void useItem(Pokemon pokemon) {
            int newHealth = pokemon.getHealth() + POTION_HEALTH_INCREASE;
            pokemon.setHealth(newHealth);
        }
    }

}
