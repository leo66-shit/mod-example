package leo66_.example.item;

import leo66_.example.TopazToolMaterial;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class TopazPickaxeItem extends PickaxeItem {
    public TopazPickaxeItem(Settings settings) {
        super(TopazToolMaterial.INSTANCE, 1, -2.8f, settings);
    }
}