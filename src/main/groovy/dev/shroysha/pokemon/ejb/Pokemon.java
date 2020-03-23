package dev.shroysha.pokemon.ejb;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Pokemon {

    // TODO: replace with csv id
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pokemonId;

    @Getter
    @NonNull
    private String pokemonName;

    @Getter
    @Setter
    private int health;

    @Entity
    @NoArgsConstructor
    @RequiredArgsConstructor
    public static abstract class PokemonAttack {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long attackId;
        @Getter
        @NonNull
        private String attackName;

    }
}
