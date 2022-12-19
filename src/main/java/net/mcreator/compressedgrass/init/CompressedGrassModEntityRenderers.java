
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.compressedgrass.client.renderer.GrassMonsterRenderer;
import net.mcreator.compressedgrass.client.renderer.GodRenderer;
import net.mcreator.compressedgrass.client.renderer.AuthorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CompressedGrassModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CompressedGrassModEntities.GRASS_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CompressedGrassModEntities.GRASS_BOW_PLUS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CompressedGrassModEntities.GRASS_MONSTER.get(), GrassMonsterRenderer::new);
		event.registerEntityRenderer(CompressedGrassModEntities.AUTHOR.get(), AuthorRenderer::new);
		event.registerEntityRenderer(CompressedGrassModEntities.GOD.get(), GodRenderer::new);
	}
}
