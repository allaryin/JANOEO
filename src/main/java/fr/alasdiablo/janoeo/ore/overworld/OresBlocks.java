package fr.alasdiablo.janoeo.ore.overworld;

import fr.alasdiablo.janoeo.JANOEO;
import fr.alasdiablo.janoeo.blocks.*;
import fr.alasdiablo.janoeo.utils.Registries;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

public class OresBlocks {

    @ObjectHolder(Registries.MODID + ":" + Registries.COPPER_ORE)
    public static Block COPPER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.TIN_ORE)
    public static Block TIN_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.ALUMINIUM_ORE)
    public static Block ALUMINIUM_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.URANIUM_ORE)
    public static Block URANIUM_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.SILVER_ORE)
    public static Block SILVER_ORE;
    @ObjectHolder(Registries.MODID + ":" + Registries.LEAD_ORE)
    public static Block LEAD_ORE;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new BasicOre(Registries.COPPER_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.TIN_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.ALUMINIUM_ORE, 1));
            event.getRegistry().register(new BasicOre(Registries.URANIUM_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.SILVER_ORE, 2));
            event.getRegistry().register(new BasicOre(Registries.LEAD_ORE, 1));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(JANOEO.setup.janoeoOreGroup);
            event.getRegistry().register(new BlockItem(OresBlocks.COPPER_ORE, properties).setRegistryName(Registries.COPPER_ORE));
            event.getRegistry().register(new BlockItem(OresBlocks.TIN_ORE, properties).setRegistryName(Registries.TIN_ORE));
            event.getRegistry().register(new BlockItem(OresBlocks.ALUMINIUM_ORE, properties).setRegistryName(Registries.ALUMINIUM_ORE));
            event.getRegistry().register(new BlockItem(OresBlocks.URANIUM_ORE, properties).setRegistryName(Registries.URANIUM_ORE));
            event.getRegistry().register(new BlockItem(OresBlocks.SILVER_ORE, properties).setRegistryName(Registries.SILVER_ORE));
            event.getRegistry().register(new BlockItem(OresBlocks.LEAD_ORE, properties).setRegistryName(Registries.LEAD_ORE));
        }
    }
}
