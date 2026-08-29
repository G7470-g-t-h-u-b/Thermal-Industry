package example.expand;

import arc.struct.Seq;
import mindustry.gen.Building;
import mindustry.world.Block;

public class MultiFactory extends Block {

    public Seq<Recipe> recipes;

    public MultiFactory(String name) {
        super(name);

        update=true;
        configurable=true;


    }

    public static class MultiFactoryBuild extends Building{

        public void updateTile(){

        }

    }
}
