package example.content;


import example.expand.ResearchNode;
import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.content.Planets;
import mindustry.content.TechTree;
import mindustry.ctype.UnlockableContent;
import mindustry.type.Item;
import mindustry.type.ItemStack;
import mindustry.world.Block;

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
    public static void addToTechNode(UnlockableContent parent_, UnlockableContent children_){
        TechTree.TechNode[] techNodes=new TechTree.TechNode[]{null};
        Planets.serpulo.techTree.each(node->{
            if(node.content==parent_) techNodes[0]=node;
        });
        TechTree.TechNode _parent=techNodes[0];
        TechTree.TechNode _children=node(children_,()->{});
        _children.parent=_parent;
        _parent.children.add(_children);
    }
    public static void addToTechNode(UnlockableContent parent_, UnlockableContent children_, ItemStack[] consumeItem){
        TechTree.TechNode[] techNodes=new TechTree.TechNode[]{null};
        Planets.serpulo.techTree.each(node->{
            if(node.content==parent_) techNodes[0]=node;
        });
        TechTree.TechNode _parent=techNodes[0];
        TechTree.TechNode _children=node(children_,consumeItem,()->{});
        _children.parent=_parent;
        _parent.children.add(_children);
    }
    public static ResearchNode basicTerrainModification;
    public static void load(){
        basicTerrainModification=new ResearchNode("basic-terrain-modification");
//        TechTree.TechNode[] techNodes=new TechTree.TechNode[]{null};
//        Planets.serpulo.techTree.each(node -> {
//            if(node.content == Items.titanium) techNodes[0] = node;
//        });
//        TechTree.TechNode titanium_ = techNodes[0];
//
//        TechTree.TechNode fe=nodeProduce(ModItems.ferrum,()->{});
//        fe.parent=titanium_;
//        titanium_.children.add(fe);

        addToTechNode(Items.titanium,ModItems.hematite);
        addToTechNode(ModItems.hematite,ModItems.ferrum);
        addToTechNode(Blocks.siliconSmelter,ModBlocks.scrapSiliconSmelter);
        addToTechNode(Items.scrap,ModItems.rock);
        addToTechNode(Blocks.blastDrill,basicTerrainModification,ItemStack.with(Items.titanium,2000,Items.silicon,500,ModItems.rock,600,ModItems.ferrum,1000));//?
    }
}
