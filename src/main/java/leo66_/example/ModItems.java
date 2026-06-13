package leo66_.example;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // 创建物品实例
    public static final Item TOPAZ = new Item(new Item.Settings());

    public static void registerAll() {
        // 将物品注册到游戏中
        Registry.register(Registries.ITEM,
                new Identifier(Hello_minecraft.MOD_ID, "topaz"),  // 标识符: mymod:topaz
                TOPAZ
        );
    }
}
