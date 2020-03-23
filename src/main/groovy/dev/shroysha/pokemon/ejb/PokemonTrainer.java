package dev.shroysha.pokemon.ejb;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class PokemonTrainer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long trainerId;

    @NonNull
    @Getter
    private String trainerName;

    @OneToMany
    @Getter
    private List<Pokemon> pokemonBelt = new ArrayList<>();
    @OneToMany
    @Getter
    private List<PokemonItem> itemBelt = new ArrayList<>();

}
