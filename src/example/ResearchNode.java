package example;
import mindustry.graphics.Pal;
import mindustry.type.Item;

public class ResearchNode extends Item {
    public ResearchNode(String name) {
        super(name);
        color= Pal.darkerGray;
    }

    @Override
    public void setStats() {
    }
}