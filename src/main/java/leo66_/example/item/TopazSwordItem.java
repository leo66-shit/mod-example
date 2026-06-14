package leo66_.example.item;

import leo66_.example.TopazToolMaterial;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class TopazSwordItem extends SwordItem {
    public TopazSwordItem(Settings settings) {
        super(TopazToolMaterial.INSTANCE, 3, -2.4f, settings);
    }
}