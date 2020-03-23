package dev.shroysha.pokemon.ejb;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class PokemonBattle {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long battleId;

    @Getter
    @Setter
    @OneToOne
    private PokemonTrainer trainer1, trainer2;

    public boolean isBattleFull() {
        return trainer1 != null && trainer2 != null;
    }

    @Entity
    public abstract static class PokemonBattleMove {

        @Id
        private Long id;

        public abstract void doMove();

        public static class AttackMove extends PokemonBattleMove {

            private final Pokemon source;
            private final Pokemon target;
            private final Pokemon.PokemonAttack attack;

            public AttackMove(Pokemon source, Pokemon target, Pokemon.PokemonAttack attack) {
                super();
                this.source = source;
                this.target = target;
                this.attack = attack;
            }

            public Pokemon getSource() {
                return source;
            }

            public Pokemon getTarget() {
                return target;
            }

            public Pokemon.PokemonAttack getAttack() {
                return attack;
            }

            @Override
            public void doMove() {

            }
        }

        public static class ItemMove extends PokemonBattleMove {
            private final PokemonItem useItem;
            private final Pokemon onPokemon;

            public ItemMove(PokemonItem useItem, Pokemon onPokemon) {
                super();
                this.useItem = useItem;
                this.onPokemon = onPokemon;
            }

            public PokemonItem getUseItem() {
                return useItem;
            }

            public Pokemon getOnPokemon() {
                return onPokemon;
            }

            @Override
            public void doMove() {

            }
        }

        public static class SwitchPokemonMove extends PokemonBattleMove {

            private final Pokemon switchTo;

            public SwitchPokemonMove(Pokemon switchTo) {
                super();
                this.switchTo = switchTo;
            }

            public Pokemon getSwitchTo() {
                return switchTo;
            }

            @Override
            public void doMove() {

            }
        }

        public static class EscapeMove extends PokemonBattleMove {
            public EscapeMove() {
                super();
            }

            @Override
            public void doMove() {

            }
        }
    }
}
