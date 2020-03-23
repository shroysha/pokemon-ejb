package dev.shroysha.pokemon.ejb;

public interface PokemonEntityScanTag {

    String BASE_URL = "http://localhost:8080";

    String
            TRAINER_CREATE = "/trainer/create",
            BATTLE_CREATE = "/battle/create",
            BATTLE_MOVE = "/battle/move";

    static void main(String[] args) {

    }
}
