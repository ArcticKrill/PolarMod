package com.polarmod.arctickrill;

import com.polarmod.arctickrill.proxy.CommonProxy;
import com.polarmod.arctickrill.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME, acceptedMinecraftVersions = Reference.MC_VERSION)
public class PolarMod 
{
	@Instance
	public static PolarMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event)
	{
		
	}
}
