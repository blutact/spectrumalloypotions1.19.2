package blutact.spectrumalloypotions.block.custom;

import blutact.spectrumalloypotions.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BedrockiumCrystalBlock extends CropBlock {
    public static final IntProperty AGE = IntProperty.of("age",0,7);
    public BedrockiumCrystalBlock(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {
        return 7;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.BEDROCKIUM_CRYSTAL_SEEDS;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.BEDROCK);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        if (Screen.hasShiftDown()){
            tooltip.add(Text.literal("Maybe you could use this?").formatted(Formatting.GRAY));
        }else {
            tooltip.add(Text.literal("Press Shift for more Info!").formatted(Formatting.GOLD));
        }

        super.appendTooltip(stack, world, tooltip, options);
    }
}
