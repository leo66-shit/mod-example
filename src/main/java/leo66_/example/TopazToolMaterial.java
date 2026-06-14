package leo66_.example;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TopazToolMaterial implements ToolMaterial {
    public static final TopazToolMaterial INSTANCE = new TopazToolMaterial();

    @Override
    public int getDurability() {
        return 1561;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0f;
    }

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    // ✅ 必须实现这个方法！
    @Override
    public int getMiningLevel() {
        return 3;  // 3 = 钻石级
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.TOPAZ);
    }
}