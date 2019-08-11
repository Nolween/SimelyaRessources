package fr.cashandrick.simelyaressources.events;

import fr.cashandrick.simelyaressources.init.ModBlocks;
import fr.cashandrick.simelyaressources.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/** Classe pour dire à Minecraft d'ajouter les items/blocs dans le jeu */
public class RegistringEvent {

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> e){
        // Enregistrement des items
        ModItems.INSTANCE.init();
        e.getRegistry().registerAll(ModItems.INSTANCE.getItems().toArray(new Item[0]));
    }


    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> e){
        // Enregistrement des blocks
        ModBlocks.INSTANCE.init();
        e.getRegistry().registerAll(ModBlocks.INSTANCE.getBlocks().toArray(new Block[0]));
    }
}
