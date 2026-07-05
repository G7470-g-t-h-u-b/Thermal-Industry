package example;

import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.Lines;
import arc.math.Angles;
import arc.math.Interp;
import arc.math.Mathf;
import mindustry.entities.Effect;
import mindustry.entities.effect.*;
import mindustry.graphics.Drawf;
import mindustry.graphics.Pal;

public class ModFx {
    public static ExplosionEffect explosionEffect1;
    public static Effect shapeEffect1;
    public static Effect shapeEffect2;
    public static Effect teachBlueBomb;
    public static Effect shootFireFx;
    public static final Effect hitLaserMeltdown = new Effect(8f,e->{
        Draw.color(Color.white, Pal.meltdownHit, e.fin());
        Lines.stroke(0.5F + e.fout());
        Lines.circle(e.x, e.y, e.fin() * 5.0F);
        Drawf.light(e.x, e.y, 23.0F, Pal.meltdownHit, e.fout() * 0.7F);
    });
    public static final Effect bronzeShoot = new Effect(12.0F, (e) -> {
        Draw.color(Color.white, TIColor.bronzeColor, e.fin());
        Lines.stroke(e.fout() * 1.2F + 0.5F);
        Angles.randLenVectors(e.id, 7, 25.0F * e.finpow(), e.rotation, 50.0F, (x, y) -> Lines.lineAngle(e.x + x, e.y + y, Mathf.angle(x, y), e.fin() * 5.0F + 2.0F));
    });
    public static final Effect feShoot = new Effect(12.0F, (e) -> {
        Draw.color(Color.white, TIColor.feColor, e.fin());
        Lines.stroke(e.fout() * 1.2F + 0.5F);
        Angles.randLenVectors(e.id, 7, 25.0F * e.finpow(), e.rotation, 50.0F, (x, y) -> Lines.lineAngle(e.x + x, e.y + y, Mathf.angle(x, y), e.fin() * 5.0F + 2.0F));
    });
    public static final Effect hitPhantomSpirit=new ExplosionEffect(){{
        waveColor=sparkColor=smokeColor=Color.black;
        lifetime=34;
        waveLife=16;
        waveRadBase=1.5f;
        waveRad=17;
        sparks=9;
        sparkRad=26;
        sparkLen=15;
        smokes=8;
        smokeRad=11;
    }};
    public static final ParticleEffect kuoleiTrailFx=new ParticleEffect(){{
        colorTo=TIColor.smoke1;
        lifetime=45;
        length=35f;
        cone=0;
        interp=Interp.pow10In;
        particles=3;
        sizeFrom=1.8f;
        sizeTo=2f;
    }};
}
