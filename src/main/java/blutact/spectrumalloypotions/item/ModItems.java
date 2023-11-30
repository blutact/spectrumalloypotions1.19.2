package blutact.spectrumalloypotions.item;

import blutact.spectrumalloypotions.SpectrumAlloyPotions;
import blutact.spectrumalloypotions.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item BEDROCKIUM_CRYSTAL = registerItem("bedrockium_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.BREWING)));
    public static final Item BEDROCKIUM_CRYSTAL_SEEDS = registerItem("bedrockium_crystal_seeds",
            new AliasedBlockItem(ModBlocks.BEDROCKIUM_CRYSTAL_BLOCK
                    ,new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SpectrumAlloyPotions.MOD_ID, name),item);
    }
    public static void registerModItems(){
        SpectrumAlloyPotions.LOGGER.debug("Registering Mod Items for "+SpectrumAlloyPotions.MOD_ID);
    }
}
