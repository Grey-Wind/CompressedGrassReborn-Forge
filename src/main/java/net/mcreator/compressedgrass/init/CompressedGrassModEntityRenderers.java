
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.compressedgrass.client.renderer.GrassMonsterRenderer;
import net.mcreator.compressedgrass.client.renderer.AuthorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CompressedGrassModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CompressedGrassModEntities.GRASS_MONSTER.get(), GrassMonsterRenderer::new);
		event.registerEntityRenderer(CompressedGrassModEntities.AUTHOR.get(), AuthorRenderer::new);
	}
}
