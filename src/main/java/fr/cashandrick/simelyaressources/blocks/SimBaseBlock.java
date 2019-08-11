package fr.cashandrick.simelyaressources.blocks;

import fr.cashandrick.simelyaressources.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SimBaseBlock extends Block {

    // Constructeur classique
    public SimBaseBlock(String name, Material materialIn) {

        super(materialIn);
        setRegistryName(name).setUnlocalizedName(name);

        ModBlocks.INSTANCE.getBlocks().add(this);
    }

    // Constructeur avec ajout d'une difficulté à casser et résistance aux explosions
    public SimBaseBlock(String name, Material materialIn, float hardness, float resistance) {
        // Constructeur classique
        this(name, materialIn);
        // Définition des résistances et dureté
        setHardness(hardness);
        setResistance(resistance);
    }


    // Constructeur ajout d'un niveau de récolte (pioche bois, fer...) harvest level et quel outil pour casser = toolClass
    public SimBaseBlock(String name, Material materialIn, float hardness, float resistance, int harvestLevel, String toolClass) {
        // level 0 = pioche bois, 1 = pierre, 2 = fer, 3 = diamant
        // toolClass pioche = pickaxe, hache = axe, pelle = shovel ou spade?
        // Constructeur classique
        this(name, materialIn, hardness, resistance);
        // Définition de l'outil nécessaire et de son niveau minimum
        setHarvestLevel(toolClass, harvestLevel);
    }

}

