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
            .icon(() -> new ItemStack(ModItems.TOPAZ))  // 组图标
            .displayName(Text.translatable("itemGroup.mymod.main"))  // 显示名称
            .entries((context, entries) -> {
                // 将物品添加到组中
                entries.add(ModItems.TOPAZ);
            })
            .build();

    public static void registerAll() {
        Registry.register(Registries.ITEM_GROUP,
                new Identifier(Hello_minecraft.MOD_ID, "main"),
                MYMOD_GROUP
        );
    }
}