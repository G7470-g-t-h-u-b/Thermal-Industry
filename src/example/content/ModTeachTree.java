package example.content;


import mindustry.content.Items;
import mindustry.content.Planets;
import mindustry.content.TechTree;

import static mindustry.content.TechTree.nodeProduce;

public class ModTeachTree {
    public static void load(){
        TechTree.TechNode[] techNodes=new TechTree.TechNode[]{null};
        Planets.serpulo.techTree.each(node -> {
            if(node.content == Items.titanium) techNodes[0] = node;
        });
        TechTree.TechNode titanium_ = techNodes[0];

        TechTree.TechNode fe=nodeProduce(ModItems.ferrum,()->{});
        fe.parent=titanium_;
        titanium_.children.add(fe);
    }
}
