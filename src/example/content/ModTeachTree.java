package example.content;


import mindustry.content.Items;
import mindustry.content.Planets;
import mindustry.content.TechTree;
import mindustry.type.Item;

import static mindustry.content.TechTree.node;
import static mindustry.content.TechTree.nodeProduce;

public class ModTeachTree {
    public static void addToTechNode(Item parent_,Item children){
        TechTree.TechNode[] techNodes=new TechTree.TechNode[]{null};
        Planets.serpulo.techTree.each(node->{
            if(node.content==parent_) techNodes[0]=node;
        });
        TechTree.TechNode _parent=techNodes[0];
        TechTree.TechNode _children=nodeProduce(children,()->{});
        _children.parent=_parent;
        _parent.children.add(_children);
    }
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
