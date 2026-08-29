package example.expand;

import arc.util.Time;
import mindustry.Vars;
import mindustry.world.blocks.defense.Wall;

public class ProWall extends Wall {

    public boolean canHeal=false;

        public ProWall(String name) {
        super(name);
        update=true;
    }

    public class ProWallBuild extends WallBuild {
        public void updateTile(){
            super.updateTile();
            if (canHeal) {
                Vars.world.build((int)x,(int)y).heal(20* Time.delta);
            }

        }
    }
}
