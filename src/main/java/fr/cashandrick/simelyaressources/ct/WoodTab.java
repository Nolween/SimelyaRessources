package fr.cashandrick.simelyaressources.ct;

import fr.cashandrick.simelyaressources.init.ModBlocks;
import fr.cashandrick.simelyaressources.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class WoodTab extends CreativeTabs {

    public WoodTab(String label) {
        super(label);
    }

    // Permettre la recherche dans la tab
    @Override
    public boolean hasSearchBar() {
        return true;
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.acacia_1_blanc);
    }
}
