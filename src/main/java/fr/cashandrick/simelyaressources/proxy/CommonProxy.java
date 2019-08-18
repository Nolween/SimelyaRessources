package fr.cashandrick.simelyaressources.proxy;

import fr.cashandrick.simelyaressources.init.ModRecipes;

public class CommonProxy {

    public void preInit(){
    }
    public void init(){
        // Initialisation des crafts de four
        ModRecipes.instance.initRecipes();
    }
    public void postInit(){
    }
}
