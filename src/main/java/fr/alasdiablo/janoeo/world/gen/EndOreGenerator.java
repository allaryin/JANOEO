package fr.alasdiablo.janoeo.world.gen;

import fr.alasdiablo.janoeo.config.EndConfig;
import fr.alasdiablo.janoeo.config.GlobalConfig;
import fr.alasdiablo.janoeo.block.EndOresBlocks;
import fr.alasdiablo.janoeo.world.OreGenUtils;
import fr.alasdiablo.janoeo.world.gen.feature.CustomFillerBlockType;
import net.minecraft.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

public class EndOreGenerator implements IWorldGenerator {
    @Override
    public void startWorldGeneration() {
        GlobalConfig.Config globalConfig = GlobalConfig.CONFIG;
        EndConfig.Config endConfig = EndConfig.CONFIG;

        if (globalConfig.END_ORE_GEN.get()) ForgeRegistries.BIOMES.forEach(biome -> {

            if (endConfig.COAL_END_ORE.get()) {
                OreGenUtils.addOreGenOnBiome(
                        biome,
                        CustomFillerBlockType.END_STONE,
                        EndOresBlocks.COAL_END_ORE.getDefaultState(),
                        12,
                        34,
                        20,
                        70
                );
            }

            if (endConfig.DIAMOND_END_ORE.get()) {
                OreGenUtils.addOreGenOnBiome(
                        biome,
                        CustomFillerBlockType.END_STONE,
                        EndOresBlocks.DIAMOND_END_ORE.getDefaultState(),
                        4,
                        10,
                        20,
                        70
                );
            }

            if (endConfig.EMERALD_END_ORE.get()) {
                OreGenUtils.addBlockGenOnBiome(
                        biome,
                        Blocks.END_STONE.getDefaultState(),
                        EndOresBlocks.EMERALD_END_ORE.getDefaultState(),
                        4,
                        20,
                        70
                );
            }

            if (endConfig.GOLD_END_ORE.get()) {
                OreGenUtils.addOreGenOnBiome(
                        biome,
                        CustomFillerBlockType.END_STONE,
                        EndOresBlocks.GOLD_END_ORE.getDefaultState(),
                        6,
                        16,
                        20,
                        70
                );
            }

            if (endConfig.IRON_END_ORE.get()) {
                OreGenUtils.addOreGenOnBiome(
                        biome,
                        CustomFillerBlockType.END_STONE,
                        EndOresBlocks.IRON_END_ORE.getDefaultState(),
                        8,
                        20,
                        20,
                        70
                );
            }

            if (endConfig.LAPIS_END_ORE.get()) {
                OreGenUtils.addOreGenOnBiome(
                        biome,
                        CustomFillerBlockType.END_STONE,
                        EndOresBlocks.LAPIS_END_ORE.getDefaultState(),
                        6,
                        10,
                        20,
                        70
                );
            }

            if (endConfig.REDSTONE_END_ORE.get()) {
                OreGenUtils.addOreGenOnBiome(
                        biome,
                        CustomFillerBlockType.END_STONE,
                        EndOresBlocks.REDSTONE_END_ORE.getDefaultState(),
                        6,
                        16,
                        20,
                        70
                );
            }
        });
    }
}
