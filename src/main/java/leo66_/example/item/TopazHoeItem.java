package leo66_.example.item;

import leo66_.example.TopazToolMaterial;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class TopazHoeItem extends HoeItem {
    public TopazHoeItem(Settings settings) {
        super(TopazToolMaterial.INSTANCE, 0, -3.0f, settings);
    }
}