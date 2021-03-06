package fr.alasdiablo.janoeo.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class NetherRedstoneOre extends RedstoneOreBlock implements INetherOre {
    public NetherRedstoneOre(String registryName) {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .tickRandomly()
                .hardnessAndResistance(3f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .lightValue(9)
        );
        this.setRegistryName(registryName);
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBlockHarvested(worldIn, pos, state, player);
        this.angerPigman(player, worldIn, pos.getX(), pos.getY(), pos.getZ());
    }
}
