package leo66_.example;

import leo66_.example.block.TopazBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

@SuppressWarnings("deprecation")
public class ModBlocks {
    // 方块（不是 BlockItem）
    public static final Block TOPAZ_BLOCK = new TopazBlock(
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.GOLD)
                    .strength(5.0f, 6.0f)
                    .sounds(BlockSoundGroup.METAL)
                    .requiresTool()
    );

    public static void registerAll() {
        // 只注册方块
        Registry.register(Registries.BLOCK,
                new Identifier(Hello_minecraft.MOD_ID, "topaz_block"),
                TOPAZ_BLOCK
        );

        Hello_minecraft.LOGGER.info("方块加载完毕");
    }
}