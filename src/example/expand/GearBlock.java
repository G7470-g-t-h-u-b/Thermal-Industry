package example.expand;

import arc.graphics.g2d.Draw;
import arc.graphics.g2d.TextureRegion;
import mindustry.Vars;
import mindustry.gen.Building;
import mindustry.graphics.Drawf;
import mindustry.world.Block;
import mindustry.world.Tile;
import mindustry.world.draw.DrawBlock;

public class GearBlock extends Block {
    public float rotationSpeed=0;
    public DrawBlock drawer;
    public TextureRegion region;
    public TextureRegion topRegion;
    public GearBlock(String name) {
        super(name);
    }
    public class GearBuild extends Building{
        public void draw(){
            Draw.rect(region,x,y);
            Draw.z(30.1f);
            super.drawCracks();
            Draw.z(30.2f);
            Drawf.spinSprite(region,x,y,rotationSpeed);
            Draw.rect(topRegion,x,y);
        }
        public void updateTile(){
            Tile other_x_1= Vars.world.tile((int)x+1,(int)y);

            if (other_x_1.blockID()==this.tile.blockID()) {

            }
        }
    }
}
