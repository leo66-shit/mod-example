package leo66_.example;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MYMOD_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.TOPAZ))
            .displayName(Text.translatable("itemGroup.hello_minecraft.main"))
            .entries((context, entries) -> {
                entries.add(ModItems.TOPAZ);            // 黄宝石
                entries.add(ModItems.TOPAZ_ORE);
                entries.add(ModItems.TOPAZ_BLOCK_ITEM);  // 黄宝石方块（物品形式）
                entries.add(ModItems.TOPAZ_ORE_BLOCK_ITEM);
            })
            .build();

    public static void registerAll() {
        Registry.register(Registries.ITEM_GROUP,
                new Identifier(Hello_minecraft.MOD_ID, "main"),
                MYMOD_GROUP
        );
    }
}