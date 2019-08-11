package fr.cashandrick.simelyaressources.items;

import fr.cashandrick.simelyaressources.init.ModItems;
import net.minecraft.item.Item;

/**
 * Classe des items basiques sans particularité
 */
public class SimBaseItem extends Item {

    /* Constructeur*/
    public SimBaseItem(String name) {
        // Définition du nom de l'item
        setRegistryName(name).setUnlocalizedName(name);




        // Ajout de l'item dans l'instance
        ModItems.INSTANCE.getItems().add(this);
    }
}
