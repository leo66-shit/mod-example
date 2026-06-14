package leo66_.example.item;

import leo66_.example.TopazToolMaterial;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class TopazShovelItem extends ShovelItem {
    public TopazShovelItem(Settings settings) {
        super(TopazToolMaterial.INSTANCE, 1.5f, -3.0f, settings);
    }
}