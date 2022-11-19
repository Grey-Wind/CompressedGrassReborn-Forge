
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compressedgrass.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.compressedgrass.entity.GrassMonsterEntity;
import net.mcreator.compressedgrass.entity.GodEntity;
import net.mcreator.compressedgrass.entity.AuthorEntity;
import net.mcreator.compressedgrass.CompressedGrassMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompressedGrassModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, CompressedGrassMod.MODID);
	public static final RegistryObject<EntityType<GrassMonsterEntity>> GRASS_MONSTER = register("grass_monster",
			EntityType.Builder.<GrassMonsterEntity>of(GrassMonsterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(GrassMonsterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AuthorEntity>> AUTHOR = register("author",
			EntityType.Builder.<AuthorEntity>of(AuthorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256)
					.setUpdateInterval(3).setCustomClientFactory(AuthorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GodEntity>> GOD = register("god",
			EntityType.Builder.<GodEntity>of(GodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GodEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GrassMonsterEntity.init();
			AuthorEntity.init();
			GodEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GRASS_MONSTER.get(), GrassMonsterEntity.createAttributes().build());
		event.put(AUTHOR.get(), AuthorEntity.createAttributes().build());
		event.put(GOD.get(), GodEntity.createAttributes().build());
	}
}
