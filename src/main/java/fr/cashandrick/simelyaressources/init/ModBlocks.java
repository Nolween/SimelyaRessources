package fr.cashandrick.simelyaressources.init;

import com.google.common.collect.Lists;
import fr.cashandrick.simelyaressources.blocks.SimBaseBlock;
import fr.cashandrick.simelyaressources.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;

public class ModBlocks {

    public static final ModBlocks INSTANCE = new ModBlocks();

    public static Block acacia_1_blanc;

    private List<Block> blocks;


    /**
     * Fonction d'initialisation des blocks (donner nom, stats,...)
     */
    public void init() {

        blocks = Lists.newArrayList();

        /* Définition des blocks */
        acacia_1_blanc = new SimBaseBlock("acacia_1_blanc", Material.WOOD, 3.0f, 20.0f, 0, "axe");

        /* Création des items blocks dans le registre */
        for (Block block : blocks) {
            ItemBlock ib = new ItemBlock(block);
            ib.setRegistryName(block.getRegistryName());
            GameRegistry.findRegistry(Item.class).register(ib);
        }

    }

    /*Event de Forge appelé à la préinitialisation et attribution des textures*/
    @SubscribeEvent
    public void registerModels(ModelRegistryEvent e) {
        // Parcours des blocks
        for (Block b : blocks) {
            // Enregistrement du model
            registerModel(b);
        }
    }

    /**
     * Définition des block en question, model, chemin, metadata,
     */
    public void registerModel(Block block) {

        // Model Loader
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(References.MODID, block.getUnlocalizedName().substring(5)), "inventory"));

    }

    public List<Block> getBlocks() {
        return blocks;
    }

}

