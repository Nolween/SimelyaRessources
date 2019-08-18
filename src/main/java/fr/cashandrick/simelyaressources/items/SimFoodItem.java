package fr.cashandrick.simelyaressources.items;

import fr.cashandrick.simelyaressources.SimelyaRessourcesMain;
import fr.cashandrick.simelyaressources.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import javax.swing.text.html.parser.Entity;

public class SimFoodItem extends ItemFood {


    public SimFoodItem(String name, int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        setRegistryName(name).setUnlocalizedName(name).setCreativeTab(SimelyaRessourcesMain.tabFood);

        // Ajout de l'objet dans la liste
        ModItems.INSTANCE.getItems().add(this);
    }

//    // Exemple d'effets supplémentaires lorsque le joueur mange
//    @Override
//    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
//        // Exemple ici, le joueur va avoir un effet de speed
//        player.addPotionEffect((new PotionEffect(MobEffects.HASTE, 2, 0)));
//    }

}
