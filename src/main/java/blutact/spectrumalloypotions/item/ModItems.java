package blutact.spectrumalloypotions.item;

import blutact.spectrumalloypotions.SpectrumAlloyPotions;
import blutact.spectrumalloypotions.block.ModBlocks;
import de.dafuqs.spectrum.registries.SpectrumStatusEffects;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item BEDROCKIUM_CRYSTAL = registerItem("bedrockium_crystal",
            new Item(new FabricItemSettings().group(ItemGroup.BREWING)));

    public static final Item BEDROCKIUM_CANDY = registerItem("bedrockium_candy",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 10), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 250, 4), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200, 10), 1.0F)
                    .statusEffect(new StatusEffectInstance(SpectrumStatusEffects.DENSITY, 200, 20), 1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100, 120), 1.0F)
                    .build())));;

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
