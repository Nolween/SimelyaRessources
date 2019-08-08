package fr.cashandrick.simelyaressources.init;

import com.google.common.collect.Lists;
import fr.cashandrick.simelyaressources.items.SimBaseItem;
import fr.cashandrick.simelyaressources.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

public class ModItems {

    public static final ModItems INSTANCE = new ModItems();

    public static Item myr;
    /* Liste de tous les items en private */
    private List<Item> items;

    /**
     * Fonction d'initialisation des items (donner nom, stats,...)
     */
    public void init() {
        // Initialisation de la liste des items
        items = Lists.newArrayList();
        /* Ajout des items basiques */
        myr = new SimBaseItem("myr");
    }

    /*Event de Forge appelé à la préinitialisation et attribution des textures*/
    @SubscribeEvent
    public void registerModels(ModelRegistryEvent e) {
        /* Parcours des items de la liste */
        for (Item item : items) {
            // Enregistrement de l'item
            registerModel(item);
        }
    }

    /**
     * Définition des items en question, chemin, metadata,
     * Substring pour enlever le début du nom de l'item qui commence par item.
     */
    private void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }

    /**
     * Getter de la liste des items
     */
    public List<Item> getItems() {
        return items;
    }

}
