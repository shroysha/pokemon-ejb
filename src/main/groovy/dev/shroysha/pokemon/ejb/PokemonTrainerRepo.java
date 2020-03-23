package dev.shroysha.pokemon.ejb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonTrainerRepo extends JpaRepository<PokemonTrainer, String> {
}