package example;


import mindustry.content.Items;
import mindustry.content.Planets;
import mindustry.content.TechTree;

public class ModTeachTree {
    public static void load(){
        TechTree.TechNode[] tn=new TechTree.TechNode[]{ModItems.ferrum.techNode};
        Planets.serpulo.techTree.each(node ->{
            if(node.content == Items.titanium) tn[0] = node;
        });
    }
}
