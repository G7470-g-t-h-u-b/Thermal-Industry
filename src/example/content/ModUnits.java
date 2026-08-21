package example.content;

import arc.graphics.Color;
import mindustry.ai.types.CargoAI;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.LaserBoltBulletType;
import mindustry.entities.bullet.LaserBulletType;
import mindustry.entities.part.DrawPart;
import mindustry.entities.part.HaloPart;
import mindustry.entities.part.ShapePart;
import mindustry.gen.UnitEntity;
import mindustry.graphics.Pal;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.type.unit.ErekirUnitType;

public class ModUnits {
    public static UnitType unitType1;
    public static UnitType unitType2;
    public static UnitType unitType3;
    public static UnitType raid;
    public static UnitType mysticSnail;
    public static ErekirUnitType charge;
    public static UnitType anvil;
    public static UnitType drone;
    public static UnitType gax_37;
    public static void load0(){
        gax_37=new UnitType("gax-37"){{
            health=450;
            armor=30;
            speed=1.21f;
            constructor=UnitEntity::create;
            hitSize=12;
            itemCapacity=20;
            flying=true;
            weapons.add(new Weapon(){{
                mirror=true;
                reload=5;
                bullet=new LaserBoltBulletType(4.2f,20){{
                    shootEffect=hitEffect= ModFx.hitLaserMeltdown;
                    lightColor= Pal.meltdownHit;
                    status=StatusEffects.melting;
//                    killShooter=true;
//                    fragBullets=5;
//                    fragRandomSpread=360;
//                    fragBullet=new BasicBulletType(10f,0){{
//                        lifetime=10;
//                        spawnUnit=UnitTypes.vela;
//                    }};
                }};
            }});
        }};
    }


    public static UnitType firmament;//tian1qiong2
    public static void load1(){
        firmament=new UnitType("firmament"){{
            constructor=UnitEntity::create;
            accel=0.06f;
            drag=0.04f;
            flying=true;
            health=1200;
            armor=10;
            speed=1.14f;
            hitSize=8*7.75f;
            itemCapacity=40;
            weapons.add(new Weapon(){{
                x=0f;
                y=1.75f;
                rotate=false;
                mirror=false;
                recoil=0.5f;
                shake=0.8f;
                reload=90f;
                bullet=new LaserBulletType(){{
                    lifetime=45f;
                    speed=4f;
                    damage=60f;
                    width=8*1.5f;
                    colors=new Color[]{Pal.techBlue,Pal.techBlue,Pal.techBlue,Pal.techBlue,Pal.techBlue};
                }};
                parts.addAll(new ShapePart(){{
                    sides=4;
                    radius=0;
                    radiusTo=16;
                    circle=false;
                    hollow=true;
                    color=Pal.techBlue;
                    progress=DrawPart.PartProgress.warmup.delay(0.9F);;
                    rotateSpeed=3.5f;
                    x=0f;
                    y=1.75f;
                }},new HaloPart(){{
                    tri=true;
                    shapes=3;
                    color=Pal.techBlue;
                    progress=DrawPart.PartProgress.warmup.delay(0.9F);
//                    radius=16;
                    triLength=0;
                    triLengthTo=16;
                    haloRotateSpeed=3.5f;
                    x=0f;
                    y=0.75f;
                }});
            }});
        }};
    }

    public static void loadDrone(){
        drone=new ErekirUnitType("drone"){{
            envDisabled=0;
            isEnemy=false;
            constructor= UnitEntity::create;
            controller=u->new CargoAI();
            flying=true;
            speed=3.8f;
            drag=0.06f;
            accel=1;
            rotateSpeed=12f;
            itemCapacity=120;
            hitSize=12;
            health=180;
        }};
    }
}
