package com.heyimamethyst.fairyfactions.core.registry;

import com.heyimamethyst.fairyfactions.FairyFactions;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class ModBiomeTags
{
    public static final TagKey<Biome> IS_FAIRY_BIOME = makeTag("is_fairy_biome");

    private static TagKey<Biome> makeTag(String p_203855_)
    {
        return TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(p_203855_));
    }

    public static TagKey<Biome> create(final ResourceLocation name)
    {
        return TagKey.create(Registry.BIOME_REGISTRY, name);
    }
}
