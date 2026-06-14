package leo66_.example.item;

import leo66_.example.TopazToolMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class TopazAxeItem extends AxeItem {
    public TopazAxeItem(Settings settings) {
        super(TopazToolMaterial.INSTANCE, 5, -3.0f, settings);
    }
}