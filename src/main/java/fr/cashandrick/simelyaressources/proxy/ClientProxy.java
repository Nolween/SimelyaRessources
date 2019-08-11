package fr.cashandrick.simelyaressources.proxy;

import fr.cashandrick.simelyaressources.init.ModBlocks;
import fr.cashandrick.simelyaressources.init.ModItems;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
        super.preInit();
        // Enregistrer les instances des items
        MinecraftForge.EVENT_BUS.register(ModItems.INSTANCE);
        // Enregistrer les instances des blocks
        MinecraftForge.EVENT_BUS.register(ModBlocks.INSTANCE);
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }
}
