package fr.cashandrick.simelyaressources;


import fr.cashandrick.simelyaressources.events.RegistringEvent;
import fr.cashandrick.simelyaressources.proxy.CommonProxy;
import fr.cashandrick.simelyaressources.utils.References;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// Informations du mod
@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class SimelyaRessourcesMain {

    // Décalaration de l'instance de Main
    @Mod.Instance(References.MODID)
    public static SimelyaRessourcesMain instance;

    // Déclaration de l'instance de proxy
    @SidedProxy(clientSide = References.CP, serverSide = References.SP)
    public static CommonProxy proxy;

    public SimelyaRessourcesMain() {
        MinecraftForge.EVENT_BUS.register(new RegistringEvent());
    }

    // Fonctions nécessaires pour la pré initialisation, initialisation et post initialisation
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit();
    }

}
