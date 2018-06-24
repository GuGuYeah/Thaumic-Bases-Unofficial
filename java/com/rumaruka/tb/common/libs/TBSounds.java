package com.rumaruka.tb.common.libs;

import com.rumaruka.tb.common.handlers.RegisterHandlers;
import com.rumaruka.tb.core.TBCore;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class TBSounds {


    public static SoundEvent buffing;
    public static SoundEvent calming;
    public static SoundEvent confusion;
    public static SoundEvent electric;
    public static SoundEvent fire_loop;
    public static SoundEvent growth;
    public static SoundEvent knowledge;
    public static SoundEvent love;
    public static SoundEvent resistance;
    public static SoundEvent revolver_no_ammo;
    public static SoundEvent revolver_reload;
    public static SoundEvent revolver_shot;
    public static SoundEvent simple;


    public TBSounds(){

    }
    public static void registerSounds() {


        fire_loop = getRegisteredSoundEvent("thaumicbases:fire_loop");



    }
    private static SoundEvent getRegisteredSoundEvent(String soundNameIn)
    {
        ResourceLocation resource = new ResourceLocation(soundNameIn);
        SoundEvent sound = new SoundEvent(resource).setRegistryName(soundNameIn);
        RegisterHandlers.Sounds.SOUNDS.add(sound);
        return sound;
    }


}
