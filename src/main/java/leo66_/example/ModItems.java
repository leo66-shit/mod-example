package leo66_.example;

import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;  // ← 添加导入
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import leo66_.example.item.TopazSwordItem;
import leo66_.example.item.TopazHoeItem;
import leo66_.example.item.TopazShovelItem;
import leo66_.example.item.TopazAxeItem;
import leo66_.example.item.TopazPickaxeItem;

public class ModItems {
    // 普通物品
    public static final Item TOPAZ = new Item(new Item.Settings());
    public static final Item TOPAZ_ORE = new Item(new Item.Settings());
    //工具
    public static final Item TOPAZ_PICKAXE = new TopazPickaxeItem(new Item.Settings().maxDamage(TopazToolMaterial.INSTANCE.getDurability()));
    public static final Item TOPAZ_AXE = new TopazAxeItem(new Item.Settings().maxDamage(TopazToolMaterial.INSTANCE.getDurability()));
    public static final Item TOPAZ_SHOVEL = new TopazShovelItem(new Item.Settings().maxDamage(TopazToolMaterial.INSTANCE.getDurability()));
    public static final Item TOPAZ_HOE = new TopazHoeItem(new Item.Settings().maxDamage(TopazToolMaterial.INSTANCE.getDurability()));
    public static final Item TOPAZ_SWORD = new TopazSwordItem(new Item.Settings().maxDamage(TopazToolMaterial.INSTANCE.getDurability()));
    // 方块物品（从 ModBlocks 获取方块）
    public static final BlockItem TOPAZ_BLOCK_ITEM = new BlockItem(
            ModBlocks.TOPAZ_BLOCK,
            new Item.Settings()
    );
    public static final BlockItem TOPAZ_ORE_BLOCK_ITEM = new BlockItem(
            ModBlocks.TOPAZ_ORE_BLOCK,
            new Item.Settings()
    );
    public static void registerAll() {
        // 注册黄宝石
        Registry.register(Registries.ITEM,
                new Identifier(Hello_minecraft.MOD_ID, "topaz"),
                TOPAZ
        );
        Registry.register(Registries.ITEM,
                new Identifier(Hello_minecraft.MOD_ID, "topaz_ore"),
                TOPAZ_ORE
        );

        // 注册黄宝石方块物品
        Registry.register(Registries.ITEM,
                new Identifier(Hello_minecraft.MOD_ID, "topaz_block"),
                TOPAZ_BLOCK_ITEM
        );
        Registry.register(Registries.ITEM,
                new Identifier(Hello_minecraft.MOD_ID, "topaz_ore_block"),
                TOPAZ_ORE_BLOCK_ITEM);
        // 工具
        Registry.register(Registries.ITEM,
                new Identifier(Hello_minecraft.MOD_ID, "topaz_pickaxe"),
                TOPAZ_PICKAXE
        );
        Registry.register(Registries.ITEM,
                new Identifier(Hello_minecraft.MOD_ID, "topaz_axe"),
                TOPAZ_AXE
        );
        Registry.register(Registries.ITEM,
                new Identifier(Hello_minecraft.MOD_ID, "topaz_shovel"),
                TOPAZ_SHOVEL
        );
        Registry.register(Registries.ITEM,
                new Identifier(Hello_minecraft.MOD_ID, "topaz_hoe"),
                TOPAZ_HOE
        );
        Registry.register(Registries.ITEM,
                new Identifier(Hello_minecraft.MOD_ID, "topaz_sword"),
                TOPAZ_SWORD
        );
        Hello_minecraft.LOGGER.info("物品加载完毕");
    }
}