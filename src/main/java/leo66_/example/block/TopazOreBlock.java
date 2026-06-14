package leo66_.example.block;

import leo66_.example.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.util.math.BlockPos;

import java.util.Collections;
import java.util.List;

public class TopazOreBlock extends Block {
    public TopazOreBlock(Settings settings) {
        super(settings);
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContextParameterSet.Builder builder) {
        ItemStack tool = builder.getOptional(LootContextParameters.TOOL);

        // 精准采集
        if (tool != null && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, tool) > 0) {
            return Collections.singletonList(new ItemStack(this.asItem()));
        }

        // 时运计算
        int fortuneLevel = 0;
        if (tool != null) {
            fortuneLevel = EnchantmentHelper.getLevel(Enchantments.FORTUNE, tool);
        }

        // 基础掉落 1 个，时运增加概率
        int count = 1;
        if (fortuneLevel > 0) {
            // 时运公式：基础 1 个，有概率额外掉落
            double chance = 0.5 + 0.1 * fortuneLevel;
            if (Math.random() < chance) {
                count += (int)(Math.random() * fortuneLevel) + 1;
            }
        }

        return Collections.singletonList(new ItemStack(ModItems.TOPAZ_ORE, count));
    }
}