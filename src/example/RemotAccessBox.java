package example;

import mindustry.game.Team;
import mindustry.world.Tile;
import mindustry.world.blocks.storage.CoreBlock;
import mindustry.world.meta.BlockGroup;
import mindustry.world.meta.Stat;

public class RemotAccessBox extends CoreBlock {
    public int max=20;
    public RemotAccessBox(String name) {
        super(name);
        group=BlockGroup.transportation;
        unitCapModifier=0;
        allowSpawn=false;
        unitType=null;
        drawArrow=false;
    }
    public boolean canPlaceOn(Tile tile,Team team,int rotation){
        return tile.team().cores().size<max;
    }
    public boolean canBreak(Tile tile){
        return true;
    }

    @Override
    public void setStats() {
        super.setStats();
        stats.add(new Stat("maxNumber"),max);
    }

    public class RemotAccessBuild extends CoreBuild{
        public boolean canPickup(){
            return true;
        }
    }
}
