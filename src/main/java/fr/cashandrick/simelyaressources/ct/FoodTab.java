package fr.cashandrick.simelyaressources.ct;

import fr.cashandrick.simelyaressources.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FoodTab extends CreativeTabs {

    public FoodTab(String label) {
        super(label);
    }

    // Permettre la recherche dans la tab
    @Override
    public boolean hasSearchBar() {
        return true;
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.preparation_cake_carotte);
    }
}
