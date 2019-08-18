package fr.cashandrick.simelyaressources.init;

        import net.minecraft.item.ItemStack;
        import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static ModRecipes instance = new ModRecipes();

    /** Initialisation */
    public void initRecipes() {
        GameRegistry.addSmelting(ModItems.preparation_cake_carotte, new ItemStack(ModItems.cake_carotte), 2.5f);
    }

}
